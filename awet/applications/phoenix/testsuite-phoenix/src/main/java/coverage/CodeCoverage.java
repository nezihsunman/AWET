package coverage;

import io.webfolder.cdp.event.network.DataReceived;
import io.webfolder.cdp.event.network.RequestWillBeSent;
import io.webfolder.cdp.event.network.ResponseReceived;
import io.webfolder.cdp.session.Session;
import io.webfolder.cdp.type.network.GetResponseBodyResult;
import io.webfolder.cdp.type.network.Request;
import io.webfolder.cdp.type.network.Response;
import io.webfolder.cdp.type.profiler.CoverageRange;
import io.webfolder.cdp.type.profiler.FunctionCoverage;
import io.webfolder.cdp.type.profiler.ScriptCoverage;
import utils.FileUtils;
import utils.Properties;
import utils.SessionProvider;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;
import java.util.stream.Collectors;

public class CodeCoverage {

    private Session session;
    private List<String> namesOfTestCasesExecuted = new LinkedList<>();
    private Map<String, Writer> testRequestsReportsMap = new LinkedHashMap<>();
    private String testCaseNameBeingExecuted;
    private Map<String, ScriptRangeCoverage> cumulativeCoverage = new LinkedHashMap<>();
    private Map<String, ScriptRangeCoverage> cumulativeCoveragePerTest = new LinkedHashMap<>();
    private Map<String, Double> executionTimePerTest = new LinkedHashMap<>();
    private File coverageReportsDir;
    private File networkLogsDir;
    private List<String> scriptNamesToExclude = new ArrayList<>();
    private String scriptNameToInclude;
    private Set<LineRange> lineRanges = new HashSet<>();

    public CodeCoverage(Session session) {
        if(session == null)
            throw new IllegalArgumentException("Session cannot be null");
        this.session = session;

        try {
            this.networkLogsDir = new File(utils.Properties.user_dir + "/network-logs");
            if(this.networkLogsDir.exists()) {
                FileUtils.deleteDirectory(this.networkLogsDir);
            }
            FileUtils.createDirIfDoesNotExist(networkLogsDir);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        this.session.addEventListener((event, value) -> {
            try {
                if(event.toString().contains("Network")) {
                    if(this.testCaseNameBeingExecuted != null) {
                        Writer testRequestsReportWriter;
                        if(this.testRequestsReportsMap.get(this.testCaseNameBeingExecuted) == null) {
                            testRequestsReportWriter = new PrintWriter(new File(this.networkLogsDir + "/"
                                    + this.testCaseNameBeingExecuted + ".txt"));
                            this.testRequestsReportsMap.put(this.testCaseNameBeingExecuted, testRequestsReportWriter);
                        } else {
                            testRequestsReportWriter = this.testRequestsReportsMap.get(this.testCaseNameBeingExecuted);
                        }
                        if(event.toString().contains("Network.requestWillBeSent")) {
                            RequestWillBeSent requestWillBeSent = (RequestWillBeSent) value;
                            Request request = requestWillBeSent.getRequest();
                            Map<String, Object> requestHeaders = request.getHeaders();
                            if(requestHeaders.get("Accept") != null && requestHeaders.get("Accept").equals("application/json")) {
                                String requestString = "[request] id: " + requestWillBeSent.getRequestId() + ", method: "
                                        + request.getMethod() + ", url: " + request.getUrl();
                                if(request.getPostData() != null) {
                                    requestString += ", data: " + request.getPostData();
                                }
                                //System.out.println(requestString);
                                testRequestsReportWriter.write(requestString + "\n");
                                testRequestsReportWriter.flush();
                            }
                        } else if(event.toString().contains("Network.dataReceived")) {
                            DataReceived dataReceived = (DataReceived) value;
                            //System.out.println("+ request id: " + dataReceived.getRequestId());
                        } else if(event.toString().contains("Network.responseReceived")) {
                            ResponseReceived responseReceived = (ResponseReceived) value;
                            Response response = responseReceived.getResponse();
                            String responseString = "[response] id: " + responseReceived.getRequestId() + " status code: "
                                    + response.getStatus() + ", url: " + response.getUrl();
                            //System.out.println("- request id: " + responseReceived.getRequestId());
                            //System.out.println("- response: status " + response.getStatus() + " " + response.getStatusText());
                            if(response.getMimeType().equalsIgnoreCase("application/json")) {
                                GetResponseBodyResult getResponseBodyResult = this.session.getCommand().getNetwork()
                                        .getResponseBody(responseReceived.getRequestId());
                                if(getResponseBodyResult.getBase64Encoded()) {
                                    byte[] decodedBytes = Base64.getDecoder().decode(getResponseBodyResult.getBody());
                                    String decodedBody = new String(decodedBytes);
                                    //System.out.println("- response encoded body");
                                    responseString += ", body: " + decodedBody;
                                } else {
                                    if(response.getMimeType().equalsIgnoreCase("application/json")) {
                                        responseString += ", body: " + getResponseBodyResult.getBody();
                                    }
                                    //System.out.println("- response body: " + getResponseBodyResult.getBody());
                                }
                                testRequestsReportWriter.write(responseString + "\n");
                                testRequestsReportWriter.flush();
                            }
                        }
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        });

        this.setupCoverageProperties();
    }

    private void setupCoverageProperties() {
        this.coverageReportsDir = new File(utils.Properties.user_dir + "/coverage-reports");
        FileUtils.createDirIfDoesNotExist(coverageReportsDir);

        System.out.println("Sourcemap url: " + Properties.getInstance().getProperty("sourcemap_url"));

        this.scriptNameToInclude = Properties.getInstance().getProperty("script_name_to_include");
        if(this.scriptNameToInclude.isEmpty()) {
            // consider scripts to exclude if script to include property is empty
            String scriptNamesToExcludeProperty = Properties.getInstance().getProperty("script_names_to_exclude");
            this.scriptNamesToExclude = Arrays.asList(scriptNamesToExcludeProperty.split(":"));
        } else {
            String lineRangesProperty = Properties.getInstance().getProperty("line_ranges");
            if(lineRangesProperty.split(":").length > 0) {
                if(lineRangesProperty.split(":").length == 1
                        && lineRangesProperty.split(":")[0].isEmpty()) {
                    this.lineRanges = new LinkedHashSet<>();
                } else {
                    this.lineRanges = Arrays.stream(lineRangesProperty.split(":"))
                            .map(range -> {
                                String[] startAndEndOffset = range.split(",");
                                return new LineRange(Integer.valueOf(startAndEndOffset[0]),
                                        Integer.valueOf(startAndEndOffset[1]));
                            })
                            .collect(Collectors.toSet());
                }
            } else {
                this.lineRanges = new LinkedHashSet<>();
            }
        }

        if(!Properties.getInstance().getProperty("sourcemap_url").isEmpty()) {
            SourceMapParser sourceMapParser = new SourceMapParser();
            this.lineRanges = new HashSet<>(sourceMapParser.getLineRanges());
        }
    }

    private void startCoverageCollection(){
        // Collect accurate call counts beyond simple 'covered' or 'not covered'.
        boolean callCount = true;
        // Collect block-based coverage.
        boolean detailed = true;
        this.session.getCommand().getProfiler().startPreciseCoverage(callCount, detailed);
    }

    public void saveCoverage(boolean intermediate){

        if(intermediate) {
            // compute test execution time
            Long end = System.currentTimeMillis();
            Double start = this.executionTimePerTest.get(this.testCaseNameBeingExecuted);
            if(start != null) {
                this.executionTimePerTest.put(this.testCaseNameBeingExecuted, (end - start)/1000);
            } else {
                throw new RuntimeException("Test case name " + this.testCaseNameBeingExecuted + " not executed");
            }

            List<ScriptCoverage> scriptCoverageList = this.session.getCommand().getProfiler()
                    .takePreciseCoverage();
            this.session.getCommand().getProfiler().stopPreciseCoverage();

            for (ScriptCoverage coverage : scriptCoverageList) {

                // scripts to ignore (libraries)
                if(this.ignore(coverage)){
                    continue;
                }

                // scripts to consider
                if(!this.consider(coverage)){
                    continue;
                }

                String srcScriptName = coverage.getUrl();
                String scriptSource;

                //FIXME sometimes not able to find source script
//            try{
//                scriptSource = this.session.getCommand().getDebugger().getScriptSource(coverage.getScriptId());
//            } catch (Exception ex) {
//                System.err.println("Could not get source of script " + srcScriptName
//                        + ". Message: " + ex.getMessage());
//                continue;
//            }

                try {
                    String srcName = coverage.getUrl().substring(coverage.getUrl().lastIndexOf("/"));
                    scriptSource = SessionProvider.getInstance()
                            .getResourceFromApp(new URL(coverage.getUrl()), srcName);
                } catch (MalformedURLException e) {
                    throw new RuntimeException(e);
                }

                ScriptRangeCoverage scriptRangeCoverage = this.cumulativeCoverage.get(srcScriptName);
                ScriptRangeCoverage scriptRangeCoveragePerTest = this.cumulativeCoveragePerTest.get(srcScriptName);
                if(scriptRangeCoverage == null){
                    scriptRangeCoverage = new ScriptRangeCoverage(srcScriptName, scriptSource, lineRanges);
                }
                if(scriptRangeCoveragePerTest == null) {
                    scriptRangeCoveragePerTest = new ScriptRangeCoverage(srcScriptName, scriptSource, lineRanges);
                }

                List<FunctionCoverage> functions = coverage.getFunctions();

                for (FunctionCoverage functionCoverage : functions) {

//                    if (functionCoverage.getFunctionName().isEmpty()) {
//                        continue;
//                    }

                    for (CoverageRange range : functionCoverage.getRanges()) {
                        // considering only ranges that are covered at least once
                        if(range.getCount() > 0
                                && !this.isWholeFileRange(range, scriptRangeCoverage.getScriptSourceLength())) {
                            CoverageRangeWrapper coverageRangeWrapper
                                    = new CoverageRangeWrapper(functionCoverage.getFunctionName(),
                                    range.getStartOffset(), range.getEndOffset(), range.getCount());
//                            System.out.println("Coverage range: " + coverageRangeWrapper);
                            if(scriptRangeCoverage.canAddRange(coverageRangeWrapper)) {

                                Set<CoverageRangeWrapper> overlappingCoverageObjects
                                        = scriptRangeCoverage.getOverlappingCoverageObjects(coverageRangeWrapper);
                                if(overlappingCoverageObjects.isEmpty()) {
//                                    System.out.println("Coverage range added: " + coverageRangeWrapper);
                                    scriptRangeCoverage.addRange(coverageRangeWrapper);
                                    scriptRangeCoveragePerTest.addRange(coverageRangeWrapper);
                                } else {
                                    for (CoverageRangeWrapper overlappingCoverageObject : overlappingCoverageObjects) {
//                                        System.out.println("Coverage range added: " + overlappingCoverageObject);
                                        scriptRangeCoverage.addRange(overlappingCoverageObject);
                                        scriptRangeCoveragePerTest.addRange(overlappingCoverageObject);
                                    }
                                }
                            }
                        }
                    }
//                    System.out.println();
                }
                this.cumulativeCoverage.put(srcScriptName, scriptRangeCoverage);
                this.cumulativeCoveragePerTest.put(srcScriptName, scriptRangeCoveragePerTest);
            }
        }

        List<PercentageCovered> percentageCoveredOfEachScript;

        if(intermediate) {
            percentageCoveredOfEachScript = this.computeCoverageReport(this.cumulativeCoveragePerTest);
        } else {
            percentageCoveredOfEachScript = this.computeCoverageReport(this.cumulativeCoverage);
        }

        File testCoverageReport;

        if(intermediate) {
            testCoverageReport = new File(this.coverageReportsDir + "/"
                    + this.testCaseNameBeingExecuted + ".txt");
        } else {
            testCoverageReport = new File(this.coverageReportsDir
                    + "/test-suite-report.txt");
            this.session.getCommand().getProfiler().disable();
        }

        double executionTime = 0.0;
        if(intermediate) {
            executionTime = this.executionTimePerTest.get(this.testCaseNameBeingExecuted);
        } else {
            for (String testCaseName : this.executionTimePerTest.keySet()) {
                executionTime += this.executionTimePerTest.get(testCaseName);
            }
        }

        FileUtils.writeFile(new CoverageReport(percentageCoveredOfEachScript, executionTime).toString(),
                testCoverageReport.getAbsolutePath());

    }

    private List<PercentageCovered> computeCoverageReport(Map<String, ScriptRangeCoverage> collectedCoverage) {
        List<PercentageCovered> result = new ArrayList<>();
        for (String scriptName : collectedCoverage.keySet()) {
            // with TreeSet characters should be ordered in ascending order
            TreeSet<Integer> allCharactersCovered = new TreeSet<>();
            ScriptRangeCoverage scriptRangeCoverage = collectedCoverage.get(scriptName);

            List<CoverageRangeWrapper> rangesCovered
                    = new LinkedList<>(scriptRangeCoverage.getRangesCovered());
            for (CoverageRangeWrapper rangeCovered : rangesCovered) {
                allCharactersCovered.addAll(rangeCovered.flattenRange());
//                if(rangeCovered.getStartOffset() < scriptRangeCoverage.getScriptSourceLength()
//                        && rangeCovered.getEndOffset() < scriptRangeCoverage.getScriptSourceLength()) {
//                    allCharactersCovered.addAll(rangeCovered.flattenRange());
//                } else if(rangeCovered.getStartOffset() < scriptRangeCoverage.getScriptSourceLength()
//                        && rangeCovered.getEndOffset() > scriptRangeCoverage.getScriptSourceLength()) {
//                    allCharactersCovered.addAll(rangeCovered.flattenRange(scriptRangeCoverage.getScriptSourceLength()));
//                }
            }

            result.add(new PercentageCovered(scriptName,
                    allCharactersCovered,
                    scriptRangeCoverage.getScriptSourceLength(),
                    scriptRangeCoverage.getScriptLines()));
        }

        return result;
    }

    public void setTestCaseNameBeingExecuted(String testCaseNameBeingExecuted) {

        this.startCoverageCollection();

        this.testCaseNameBeingExecuted = testCaseNameBeingExecuted;
        this.namesOfTestCasesExecuted.add(testCaseNameBeingExecuted);

        long start = System.currentTimeMillis();
        this.executionTimePerTest.put(testCaseNameBeingExecuted, (double) start);
    }

    public void resetCoveragePerTest() {
        this.cumulativeCoveragePerTest.clear();
    }

    private boolean ignore(ScriptCoverage coverage) {
        String scriptUrl = coverage.getUrl().trim();
        if(!scriptUrl.contains(".js"))
            return true;
        if(scriptUrl.contains(".min.js"))
            return true;
        for (String scriptNameToExclude : this.scriptNamesToExclude) {
            if(scriptUrl.contains(scriptNameToExclude))
                return true;
        }
        return false;
    }

    private boolean consider(ScriptCoverage coverage) {
        if(this.scriptNameToInclude.isEmpty()) {
            return true;
        }
        String scriptUrl = coverage.getUrl().trim();
        return scriptUrl.contains(this.scriptNameToInclude);
    }

    private boolean isWholeFileRange(CoverageRange range, int scriptLength) {
        int diff = Math.abs((range.getEndOffset() - range.getStartOffset()) - scriptLength);
        if(diff == 0 || diff == 1)
            return true;
        return false;
    }
}