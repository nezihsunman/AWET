package com.awet_integrated.AWET;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class SideConverter {
    public static void listFilesForFolder(final File folder) {
        for (final File fileEntry : folder.listFiles()) {
            if (fileEntry.isDirectory()) {
                listFilesForFolder(fileEntry);
            } else {
                String file = fileEntry.getName();
                if (file.contains(".java")) {
                    listOfJavaFile.add(file);
                } else if (file.contains(".side")) {
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
            String str = JavaFileName.substring(0, JavaFileName.length());
            try {

                FileReader reader = new FileReader(BASE_FILE_FOLDER_PATH + "/" + str);

                JsonParser parser = new JsonParser();
                JsonObject jsonObject = (JsonObject) parser.parse(reader);
                System.out.println("succesfull");
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}
