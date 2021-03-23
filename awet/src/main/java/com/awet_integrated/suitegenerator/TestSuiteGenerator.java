package com.awet_integrated.suitegenerator;

import com.awet_integrated.parsing.CrawlingActionsParser;
import com.awet_integrated.parsing.TestCase;
import com.awet_integrated.subjects.Config;
import com.awet_integrated.subjects.SetupApp;
import com.awet_integrated.utils.Properties;

import java.io.File;
import java.util.List;

public class TestSuiteGenerator {

    public static void main(String[] args){

        config();

        Config config = SetupApp.getConfig();

        SuiteGeneratorConfig suiteGeneratorConfig = config.getSuiteGeneratorConfig();
        File driverActionsFile = new File(suiteGeneratorConfig.getDriverActionsFilePath());

        CrawlingActionsParser crawlingActionsParser = new CrawlingActionsParser();
        List<TestCase> testCases = crawlingActionsParser.getTestCases(driverActionsFile);

        JavaProjectGenerator javaProjectGenerator = new JavaProjectGenerator(suiteGeneratorConfig);
        javaProjectGenerator.generateJavaProject(testCases);

    }

    private static void config(){
        instantiateProperties();
    }

    private static void instantiateProperties(){
        Properties.getInstance().createPropertiesFile();
    }


}
