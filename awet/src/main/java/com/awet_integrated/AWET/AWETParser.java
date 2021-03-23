package com.awet_integrated.AWET;

import com.awet_integrated.subjects.ApplicationNames;
import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.Node;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AWETParser {

    public static void listFilesForFolder(final File folder) {
        for (final File fileEntry : folder.listFiles()) {
            if (fileEntry.isDirectory()) {
                listFilesForFolder(fileEntry);
            } else {
                String file = fileEntry.getName();
                if (file.contains(".java")) {
                    listOfJavaFile.add(file);
                }
            }
        }

    }

    private static List<String> listOfJavaFile = new ArrayList<>();

    private static final String BASE_FILE_FOLDER_PATH = "/home/nezihsunman/Desktop/Tests";
    private static final IDService service = new IDService();
    private static final ClickListService service_click = new ClickListService();

    public static void main(String[] args) throws InterruptedException, IOException {

        final File baseFolder = new File(BASE_FILE_FOLDER_PATH);

        listFilesForFolder(baseFolder);
        javaFormParser();
    }

    private static void javaFormParser() throws FileNotFoundException {
        int test_case_number = 1;
        for (String JavaFileName : listOfJavaFile) {
            //test_case_number++;
            System.out.println(JavaFileName);

            CompilationUnit cu1 = StaticJavaParser.parse(new FileInputStream(BASE_FILE_FOLDER_PATH + "/" + JavaFileName));
            String applicationName = "";
            for (String name : ApplicationNames.getValues()) {
                if (name.equals(ApplicationNames.Name.ECOMMERCE.getName())
                        && JavaFileName.contains(name.toLowerCase())) {
                    applicationName = ApplicationNames.Name.ECOMMERCE.getName();

                } else if (name.equals(ApplicationNames.Name.PETCLINIC.getName())
                        && JavaFileName.contains(name.toLowerCase())) {
                    applicationName = ApplicationNames.Name.PETCLINIC.getName();
                } else if (name.equals(ApplicationNames.Name.DIMESHIFT.getName())
                        && JavaFileName.contains(name.toLowerCase())) {
                    applicationName = ApplicationNames.Name.DIMESHIFT.getName();

                } else if (name.equals(ApplicationNames.Name.SPLITTYPIE.getName())
                        && JavaFileName.contains(name.toLowerCase())) {
                    applicationName = ApplicationNames.Name.SPLITTYPIE.getName();

                } else if (name.equals(ApplicationNames.Name.RETROBOARD.getName())
                        && JavaFileName.contains(name.toLowerCase())) {
                    applicationName = ApplicationNames.Name.RETROBOARD.getName();

                } else if (name.equals(ApplicationNames.Name.PHOENIX.getName())
                        && JavaFileName.contains(name.toLowerCase())) {
                    applicationName = ApplicationNames.Name.PHOENIX.getName();

                } else if (name.equals(ApplicationNames.Name.PAGEKIT.getName())
                        && JavaFileName.contains(name.toLowerCase())) {
                    applicationName = ApplicationNames.Name.PAGEKIT.getName();
                }
            }

            Class<? extends CompilationUnit> cu1class = cu1.getClass();
            //System.out.println(cu1.toString());
            cu1.removeComment();
            //System.out.println(cu1.toString());
            for (Node child : cu1.getChildNodes()) {
                if (child instanceof ClassOrInterfaceDeclaration) {
                    for (Node codeChild : child.getChildNodes()) {
                        if (codeChild instanceof MethodDeclaration) {

                            String insideMethod = codeChild.toString();

                            if (insideMethod.contains("By.xpath") && insideMethod.contains("sendKeys")) {
                                //System.out.println(codeChild.toString());
                                insideMethod.replaceAll("\\{", " ");
                                insideMethod.replaceAll("\\}", " ");
                                String pharese = codeChild.toString();
                                String delims = ";";
                                String[] tokens = pharese.split(delims);
                                String idNameToSend = "";

                                /*for (int i = 1; i < tokens.length; i++) {
                                    if (tokens[i].contains("sendKeys")) {
                                        if (tokens[i].contains("sendKeys")) {
                                            String methodSplit2 = tokens[i];
                                            int left2 = methodSplit2.indexOf("sendKeys");
                                            int right2 = methodSplit2.lastIndexOf("\")");
                                            String value = methodSplit2.substring(left2 + 10, right2);
                                            if (tokens[i].contains("By.id")) {
                                                String methodSplit = tokens[i];
                                                int left = methodSplit.indexOf("By.id");
                                                int right = methodSplit.indexOf("\"))");
                                                String id = methodSplit.substring(left + 7, right);
                                            } else if (tokens[i].contains("By.xpath")) {
                                                if (tokens[i].contains("//a[")) {
                                                    String methodSplit = tokens[i];
                                                    int left = methodSplit.indexOf("By.xpath(");
                                                    int right = methodSplit.indexOf("\"))");
                                                    String id = methodSplit.substring(left + 9, right);
                                                } else if (tokens[i].contains("div[@id=\\'")) {
                                                    String methodSplit = tokens[i];
                                                    int left = methodSplit.indexOf("div[@id=\\'");
                                                    int right = methodSplit.indexOf("\\']/");
                                                    String id = methodSplit.substring(left + 10, right);
                                                } else {
                                                    String methodSplit = tokens[i];
                                                    int left = methodSplit.indexOf("input[@id=\\'");
                                                    int right = methodSplit.indexOf("\\']\"))");
                                                    String id = methodSplit.substring(left + 12, right);
                                                    //Save DB

                                                }

                                            }
                                        }
                                    }
                                }*/
                                int begin = 1;
                                List<ID> listOfID = new ArrayList<ID>();

                                for (int i = 1; i < tokens.length; i++) {
                                    String xpath = "";
                                    String tagName = "";
                                    String key = "";
                                    String attributeName = "";
                                    String beforeClickType = "";
                                    String infoBeforeClickType = "";
                                    String how_xpath_or_id = "";

                                    if (tokens[i].contains("By.xpath") && !tokens[i].contains("sendKeys") && tokens[i].contains("click()")) {

                                        if (tokens[i].contains("//button[contains(.,\\'")) {
                                            String methodSplit = tokens[i];
                                            int leftofXpath = methodSplit.indexOf("By.xpath(\"");
                                            int rightofXpath = methodSplit.indexOf("\")).click()");
                                            xpath = methodSplit.substring(leftofXpath + 10, rightofXpath);
                                            int left = methodSplit.indexOf("//button[contains(.,\\'");
                                            int right = methodSplit.indexOf("\\')]\"");
                                            tagName = "button";
                                            beforeClickType = "withText";
                                            how_xpath_or_id = "By.tagname";
                                            infoBeforeClickType = methodSplit.substring(left + 22, right);
                                        } else if (tokens[i].contains("//form[@id=\\'")) {
                                            String methodSplit = tokens[i];
                                            int leftofXpath = methodSplit.indexOf("By.xpath(\"");
                                            int rightofXpath = methodSplit.indexOf("\")).click()");
                                            xpath = methodSplit.substring(leftofXpath + 10, rightofXpath);
                                            int left = methodSplit.indexOf("//form[@id=\\'");
                                            int right = methodSplit.indexOf("\\']");
                                            infoBeforeClickType = methodSplit.substring(left + 13, right);
                                            tagName = "form";
                                            beforeClickType = "underxpath";
                                            how_xpath_or_id = "By.tagname";

                                        }
                                        else if (tokens[i].contains("//a[contains(text(),\\'")&& !tokens[i].contains("']/")) {
                                            String methodSplit = tokens[i];
                                            int leftofXpath = methodSplit.indexOf("//a[contains(text(),\\'");
                                            int rightofXpath = methodSplit.indexOf("\")).click()");
                                            xpath = methodSplit.substring(leftofXpath, rightofXpath);
                                            int left = methodSplit.indexOf("//a[contains(text(),\\'");
                                            int right = methodSplit.indexOf("\\')]");
                                            infoBeforeClickType = methodSplit.substring(left + 22, right);
                                            tagName = "a";
                                            beforeClickType = "withText";
                                            how_xpath_or_id = "withText";
                                        } else if (tokens[i].contains("//a[contains(.,\\'")&& !tokens[i].contains("']/")) {
                                            String methodSplit = tokens[i];
                                            int leftofXpath = methodSplit.indexOf("//a[contains(.,\\'");
                                            int rightofXpath = methodSplit.indexOf("\")).click()");
                                            xpath = methodSplit.substring(leftofXpath, rightofXpath);
                                            int left = methodSplit.indexOf("//a[contains(.,\\'");
                                            int right = methodSplit.indexOf("\\')]");
                                            infoBeforeClickType = methodSplit.substring(left + 17, right);
                                            tagName = "a";
                                            beforeClickType = "withText";
                                            how_xpath_or_id = "By.tagname";
                                        }else if (tokens[i].contains("//a[@id=\\'")&& !tokens[i].contains("']/")) {
                                            String methodSplit = tokens[i];
                                            int leftofXpath = methodSplit.indexOf("By.xpath(\"");
                                            int rightofXpath = methodSplit.indexOf("\")).click()");
                                            xpath = methodSplit.substring(leftofXpath + 10, rightofXpath);
                                            int left = methodSplit.indexOf("//a[@id=\\'");
                                            int right = methodSplit.indexOf("\\']");
                                            infoBeforeClickType = methodSplit.substring(left + 10, right);
                                            tagName = "a";
                                            beforeClickType = "withText";
                                            how_xpath_or_id = "By.tagname";
                                        }
                                        else if (tokens[i].contains("//nav[@id=")&& !tokens[i].contains("']/")) {
                                            String methodSplit = tokens[i];
                                            int leftofXpath = methodSplit.indexOf("//nav[@id=\\");
                                            int rightofXpath = methodSplit.indexOf("\")).click()");
                                            xpath = methodSplit.substring(leftofXpath, rightofXpath);
                                            int left = methodSplit.indexOf("//nav[@id=\\");
                                            int right = methodSplit.indexOf("\\']");
                                            infoBeforeClickType = methodSplit.substring(left + 12, right);
                                            tagName = "nav";
                                            beforeClickType = "withText";
                                            how_xpath_or_id = "By.tagname";
                                        }
                                        else if (tokens[i].contains("//div[@id=") && !tokens[i].contains("']/")) {
                                            String methodSplit = tokens[i];
                                            int leftofXpath = methodSplit.indexOf("//div[@id=");
                                            int rightofXpath = methodSplit.indexOf("\")).click()");
                                            xpath = methodSplit.substring(leftofXpath, rightofXpath);
                                            int left = methodSplit.indexOf("//div[@id=");
                                            int right = methodSplit.indexOf("\\']");
                                            infoBeforeClickType = methodSplit.substring(left + 12, right);
                                            tagName = "div";
                                            beforeClickType = "divUnderXpath";
                                            how_xpath_or_id = "withText";
                                        }else if (tokens[i].contains("//div[@id=")) {
                                            String methodSplit = tokens[i];
                                            int leftofXpath = methodSplit.indexOf("//div[@id=");
                                            int rightofXpath = methodSplit.indexOf("\")).click()");
                                            xpath = methodSplit.substring(leftofXpath, rightofXpath);
                                            int left = methodSplit.indexOf("//div[@id=");
                                            int right = methodSplit.indexOf("\\']");
                                            infoBeforeClickType = methodSplit.substring(left + 12, right);
                                            tagName = "div";
                                            beforeClickType = "By.xpath";
                                            how_xpath_or_id = "underxpath";
                                        } else if (tokens[i].contains("By.xpath(\"") && tokens[i].contains("\")).click()")) {
                                            String methodSplit = tokens[i];
                                            int left = methodSplit.indexOf("By.xpath(\"");
                                            int right = methodSplit.indexOf("\"))");
                                            tagName = "button";
                                            xpath = methodSplit.substring(left + 10, right);
                                            System.out.println(xpath);
                                            how_xpath_or_id = "By.xpath";
                                            beforeClickType = "underxpath";
                                            //javaClickParser(xpath, tagName, "only click", test_case_number, "By.xpath");
                                        } else if (tokens[i].contains("By.id") && tokens[i].contains("click")) {
                                            String methodSplit = tokens[i];
                                            int left = methodSplit.indexOf("By.id");
                                            int right = methodSplit.indexOf("\"))");
                                            xpath = methodSplit.substring(left + 7, right);
                                            tagName = "button";
                                            how_xpath_or_id = "By.id";
                                            beforeClickType = "By.id";
                                            //javaClickParser(xpath, tagName, "only click", test_case_number, "By.id");
                                        } else if (tokens[i].contains("By.tagName(")) {
                                            String methodSplit = tokens[i];
                                            int left = methodSplit.indexOf("By.tagName(");
                                            int right = methodSplit.indexOf("\"))");
                                            xpath = methodSplit.substring(left + 12, right);
                                            tagName = "button";
                                            how_xpath_or_id = "By.id";
                                            beforeClickType = "By.id";
                                            //javaClickParser(xpath, tagName, "only click", test_case_number, "By.id");
                                        } else if (tokens[i].contains("\")).click()")) {
                                            String methodSplit = tokens[i];
                                            int leftofXpath = methodSplit.indexOf("By.xpath(\"");
                                            int rightofXpath = methodSplit.indexOf("\")).click()");
                                            xpath = methodSplit.substring(leftofXpath + 10, rightofXpath);
                                            int left = methodSplit.indexOf("By.xpath(\"");
                                            int right = methodSplit.indexOf("\")).click()");
                                            //xpath = methodSplit.substring(left + 10, right);
                                            tagName = "xpath";
                                            beforeClickType = "underxpath";
                                            how_xpath_or_id = "By.xpath";
                                        }

                                        if (begin == i) {
                                            //say crawler click this xpath only click
                                            javaClickParser(xpath, tagName, "only click", test_case_number, how_xpath_or_id, JavaFileName, applicationName,infoBeforeClickType);

                                        } else {
                                            for (int j = begin; j < i; j++) {
                                                if (tokens[j].contains("By.id") && tokens[j].contains("sendKeys")) {
                                                    String methodSplit = tokens[j];
                                                    int left = methodSplit.indexOf("By.id");
                                                    int right = methodSplit.indexOf("\"))");
                                                    key = methodSplit.substring(left + 7, right);
                                                    String methodSplit2 = tokens[j];
                                                    int left2 = methodSplit2.indexOf("sendKeys");
                                                    int right2 = methodSplit2.lastIndexOf("\")");
                                                    String value = methodSplit2.substring(left2 + 10, right2);
                                                    if (!xpath.equals("")) {
                                                        ID tempId = new ID(tagName, key, value, "By.id", test_case_number, attributeName, xpath, beforeClickType, infoBeforeClickType, JavaFileName, applicationName);
                                                        listOfID.add(tempId);
                                                    }

                                                } else if (tokens[j].contains("input[@id") && tokens[j].contains("sendKeys")) {
                                                    String methodSplit = tokens[j];
                                                    int left = methodSplit.indexOf("input[@id=\\'");
                                                    int right = methodSplit.indexOf("\\']\"))");
                                                    key = methodSplit.substring(left + 12, right);
                                                    String methodSplit2 = tokens[j];
                                                    int left2 = methodSplit2.indexOf("sendKeys");
                                                    int right2 = methodSplit2.lastIndexOf("\")");
                                                    String value = methodSplit2.substring(left2 + 10, right2);
                                                    if (!xpath.equals("")) {
                                                        ID tempId = new ID(tagName, key, value, "input[@id", test_case_number, attributeName, xpath, beforeClickType, infoBeforeClickType, JavaFileName, applicationName);
                                                        listOfID.add(tempId);
                                                    }
                                                } else if (tokens[j].contains("By.name") && tokens[j].contains("sendKeys")) {
                                                    String methodSplit = tokens[j];
                                                    int left = methodSplit.indexOf("By.name");
                                                    int right = methodSplit.indexOf("\"))");
                                                    key = methodSplit.substring(left + 9, right);
                                                    String methodSplit2 = tokens[j];
                                                    int left2 = methodSplit2.indexOf("sendKeys");
                                                    int right2 = methodSplit2.lastIndexOf("\")");
                                                    String value = methodSplit2.substring(left2 + 10, right2);
                                                    if (!xpath.equals("")) {
                                                        ID tempId = new ID(tagName, key, value, "By.name", test_case_number, attributeName, xpath, beforeClickType, infoBeforeClickType, JavaFileName, applicationName);
                                                        listOfID.add(tempId);
                                                    }

                                                } else if (tokens[j].contains("div[@id=\\'") && tokens[j].contains("sendKeys(\"") && !tokens[i].contains("']/")) {
                                                    String methodSplit = tokens[j];
                                                    int left = methodSplit.indexOf("//div[@id=\\'");
                                                    int right = methodSplit.indexOf("\"))");
                                                    key = methodSplit.substring(left, right);
                                                    String methodSplit2 = tokens[j];
                                                    int left2 = methodSplit2.indexOf("sendKeys(\"");
                                                    int right2 = methodSplit2.lastIndexOf("\")");
                                                    String value = methodSplit2.substring(left2 + 10, right2);
                                                    if (!xpath.equals("")) {
                                                        ID tempId = new ID(tagName, key, value, "By.xpath", test_case_number, attributeName, xpath, beforeClickType, infoBeforeClickType, JavaFileName, applicationName);
                                                        listOfID.add(tempId);
                                                    }
                                                } else if (tokens[j].contains("div[@id=\\'") && tokens[j].contains("sendKeys(")) {
                                                    String methodSplit = tokens[j];
                                                    int left = methodSplit.indexOf("//div[@id=\\'");
                                                    int right = methodSplit.indexOf("\"))");
                                                    key = methodSplit.substring(left, right);
                                                    String methodSplit2 = tokens[j];
                                                    int left2 = methodSplit2.indexOf("sendKeys(");
                                                    int right2 = methodSplit2.lastIndexOf(")");
                                                    String value = methodSplit2.substring(left2 + 9, right2);
                                                    if (!xpath.equals("")) {
                                                        ID tempId = new ID(tagName, key, value, "By.xpath", test_case_number, attributeName, xpath, beforeClickType, infoBeforeClickType, JavaFileName, applicationName);
                                                        listOfID.add(tempId);
                                                    }
                                                }
                                                else if (tokens[j].contains("By.xpath(\"") && tokens[j].contains("sendKeys")) {
                                                    String methodSplit = tokens[j];
                                                    int left = methodSplit.indexOf("By.xpath(\"");
                                                    int right = methodSplit.indexOf("\"))");
                                                    key = methodSplit.substring(left + 10, right);
                                                    String methodSplit2 = tokens[j];
                                                    int left2 = methodSplit2.indexOf("sendKeys");
                                                    int right2 = methodSplit2.lastIndexOf("\")");
                                                    String value = "";
                                                    if (left2 + 10 < right2) {
                                                        value = methodSplit2.substring(left2 + 10, right2);
                                                        if (!xpath.equals("")) {
                                                            ID tempId = new ID(tagName, key, value, "By.xpath", test_case_number, attributeName, xpath, beforeClickType, infoBeforeClickType, JavaFileName, applicationName);
                                                            listOfID.add(tempId);
                                                        }
                                                    }

                                                }
                                            }
                                        }
                                        begin = i + 1;

                                    }

                                /*
                                if (tokens[i].contains("By.id")) {
                                    String methodSplit = tokens[i];
                                    int left = methodSplit.indexOf("By.id");
                                    int right = methodSplit.indexOf("\"))");
                                    String id = methodSplit.substring(left + 7, right);
                                    if (tokens[i].contains("sendKeys")) {
                                        String methodSplit2 = tokens[i];
                                        int left2 = methodSplit2.indexOf("sendKeys");
                                        int right2 = methodSplit2.lastIndexOf("\")");
                                        String value = methodSplit2.substring(left2 + 10, right2);
                                        if (keyList.containsKey(id)) {
                                            ID tempId = new ID(idNameToSend, id, value);
                                            //IDService service = new IDService();
                                            //service.saveStudent(tempId);
                                            keyList.get(id).add(value);
                                            //System.out.println(value);
                                        } else {
                                            ID tempId = new ID(idNameToSend, id, value);
                                            //IDService service = new IDService();
                                            //service.saveStudent(tempId);
                                            List<String> tempKeylist = new ArrayList<String>();
                                            tempKeylist.add(id);
                                            keyList.put(id, tempKeylist);
                                            // System.out.println(id);
                                        }
                                    }
                                }*/
                                }
                                for (ID id : listOfID) {
                                    System.out.println(id.toString());
                                    service.saveID(id);
                                }
                            } else if (insideMethod.contains("By.xpath") && !insideMethod.contains("sendKeys")) {
                                insideMethod.replaceAll("\\{", " ");
                                insideMethod.replaceAll("\\}", " ");
                                String pharese = codeChild.toString();
                                String delims = ";";
                                String[] tokens = pharese.split(delims);
                                String idNameToSend = "";
                                for (int i = 1; i < tokens.length; i++) {
                                    String xpath = "";
                                    String tagName = "";
                                    String key = "";

                                    if (tokens[i].contains("By.xpath(\"")) {
                                        String methodSplit = tokens[i];
                                        int left = methodSplit.indexOf("By.xpath(\"");
                                        int right = methodSplit.indexOf("\"))");
                                        tagName = "button";
                                        xpath = methodSplit.substring(left + 10, right);
                                        System.out.println(xpath);
                                        javaClickParser(xpath, tagName, "only click", test_case_number, "By.xpath", JavaFileName, applicationName,"");
                                    } else if (tokens[i].contains("By.id") && tokens[i].contains("click")) {
                                        String methodSplit = tokens[i];
                                        int left = methodSplit.indexOf("By.id");
                                        int right = methodSplit.indexOf("\"))");
                                        xpath = methodSplit.substring(left + 7, right);
                                        tagName = "button";
                                        javaClickParser(xpath, tagName, "only click", test_case_number, "By.id", JavaFileName, applicationName,"");
                                    } else if (tokens[i].contains("By.tagName(")) {
                                        String methodSplit = tokens[i];
                                        int left = methodSplit.indexOf("By.tagName(");
                                        int right = methodSplit.indexOf("\"))");
                                        xpath = methodSplit.substring(left + 12, right);
                                        tagName = "button";
                                        javaClickParser(xpath, tagName, "only click", test_case_number, "By.id", JavaFileName, applicationName,"");
                                    }

                                }

                            }

                        }

                    }
                }
                // cu1.stream().map().;
        /*VoidVisitor<?> methodNameVisitor = new MethodNamePrinter();
        methodNameVisitor.visit(cu, null);

        ParserConfiguration parserConfiguration = new ParserConfiguration().setAttributeComments(false);

        StaticJavaParser.setConfiguration(parserConfiguration);
*/

            }
        }
    }

    public static void javaClickParser(String xpath, String tagName, String how, int test_case_number, String
            how_xpath_or_id, String javaFileName, String applicationName, String infoBeforeClickType) {

        if (!xpath.equals("")) {
            System.out.println("xpath" + xpath + tagName);
            service_click.saveClick(new ClickList(xpath, tagName, how, test_case_number, how_xpath_or_id, javaFileName, applicationName,infoBeforeClickType));
        }
    }
}
