package com.awet_integrated.minimization;

import com.awet_integrated.coverage.CoverageReport;
import com.awet_integrated.coverage.CoverageReportImporter;
import com.awet_integrated.parsing.TestCaseFinder;
import com.awet_integrated.tedd.graph.GraphEdge;
import com.awet_integrated.tedd.graph.GraphNode;
import com.awet_integrated.tedd.graph.dot.importgraph.GraphImporter;
import com.awet_integrated.utils.Properties;
import org.apache.log4j.Logger;
import org.jgrapht.Graph;

class MinimizeSuiteOnlyCoverage {

    private final static Logger logger = Logger.getLogger(MinimizeSuiteOnlyCoverage.class.getName());

    public static void main(String[] args) {

        config();

        Properties.getInstance().checkDirectoryExistence(Properties.COVERAGE_REPORTS_DIRECTORY_PATH,
                "coverage_reports_directory_path");
        Properties.getInstance().checkFileExistence(Properties.TEST_SUITE_PATH,
                "test_suite_path");
        Properties.tests_order = new TestCaseFinder().getTestCaseOrder();

        CoverageReportImporter coverageReportImporter = new CoverageReportImporter();
        CoverageReport coverageReport
                = coverageReportImporter.importReport(Properties.COVERAGE_REPORTS_DIRECTORY_PATH);


        Minimizer minimizer = new Minimizer();

        logger.info("======================================");
        logger.info("Finding all the solutions to the minimization problem...");
        long start = System.currentTimeMillis();
        minimizer.minimizeTestSuite(coverageReport, true);
        logger.info("Time elapsed for minimization: " + ((System.currentTimeMillis() - start)/1000) + "s");
        logger.info("======================================");
    }

    private static void config() {
        instantiateProperties();
    }

    private static void instantiateProperties() {
        Properties.getInstance().createPropertiesFile();
    }
}
