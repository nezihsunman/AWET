package com.awet_integrated.AWET;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.Node;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class AWETConverter {
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
    private static String remove = "\t";
    private static final String BASE_FILE_FOLDER_PATH = "/home/nezihsunman/Desktop/Tests";

    public static void main(String[] args) throws InterruptedException, IOException {
        final File baseFolder = new File(BASE_FILE_FOLDER_PATH);

        listFilesForFolder(baseFolder);
        javaFormParser();
    }

    private static void javaFormParser() throws IOException {
        for (String JavaFileName : listOfJavaFile) {
            //test_case_number++;
            System.out.println(JavaFileName);
            String str = JavaFileName.substring(0, JavaFileName.length() - 5);
            BufferedWriter writer = new BufferedWriter(new FileWriter(str + ".txt", true));
            CompilationUnit cu1 = StaticJavaParser.parse(new FileInputStream(BASE_FILE_FOLDER_PATH + "/" + JavaFileName));

            Class<? extends CompilationUnit> cu1class = cu1.getClass();
            //System.out.println(cu1.toString());
            cu1.removeComment();
            //System.out.println(cu1.toString());
            for (Node child : cu1.getChildNodes()) {
                if (child instanceof ClassOrInterfaceDeclaration) {
                    for (Node codeChild : child.getChildNodes()) {
                        if (codeChild instanceof MethodDeclaration) {
                            String insideMethod = codeChild.toString();
                            if (insideMethod.contains("driver.findElement")) {
                                String pharese = codeChild.toString();
                                String delims = ";";
                                String[] tokens = pharese.split(delims);
                                ArrayList<String> tokens_new = new ArrayList<>();
                                for (String tokensID : tokens) {

                                    /*if (tokensID.contains(remove)) {
                                        tokensID = tokensID.replaceAll(remove, " ");
                                    }*/
                                    tokens_new.add(tokensID + ";");
                                    tokens_new.add("Thread.sleep(3000);");
                                }
                                for (String strr : tokens_new) {
                                    writer.append(strr).append(System.lineSeparator());
                                }
                                writer.close();
                            }
                        }
                    }
                }
            }
        }
    }
}
