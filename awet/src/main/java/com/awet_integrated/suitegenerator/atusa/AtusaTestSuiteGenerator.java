package com.awet_integrated.suitegenerator.atusa;

import com.crawljax.core.configuration.CrawljaxConfiguration;
import com.awet_integrated.parsing.TestCase;
import com.awet_integrated.subjects.Config;
import com.awet_integrated.subjects.SetupApp;
import com.awet_integrated.suitegenerator.JavaProjectGenerator;
import com.awet_integrated.suitegenerator.SuiteGeneratorConfig;
import com.awet_integrated.utils.Properties;

import java.io.File;
import java.util.List;

public class AtusaTestSuiteGenerator {

    public static void main(String[] args){

        config();

        Config config = SetupApp.getConfig();

        SuiteGeneratorConfig suiteGeneratorConfig = config.getSuiteGeneratorConfig();
        File crawlerResultsFile = new File(suiteGeneratorConfig.getCrawlerResultsFilePath());

        ModelTestCasesExtractor modelTestCasesExtractor = new ModelTestCasesExtractor();
        List<TestCase> testCases = modelTestCasesExtractor.extractTestCases(crawlerResultsFile, config);

        JavaProjectGenerator javaProjectGenerator = new JavaProjectGenerator(suiteGeneratorConfig);
        javaProjectGenerator.generateAtusaTests(testCases);

    }

    private static void config(){
        instantiateProperties();
    }

    private static void instantiateProperties(){
        Properties.getInstance().createPropertiesFile();
    }


}
