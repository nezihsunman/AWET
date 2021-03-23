package com.awet_integrated.minimization;

import com.awet_integrated.coverage.CoverageReport;
import com.awet_integrated.coverage.CoverageReportImporter;
import com.awet_integrated.parsing.TestCaseFinder;
import com.awet_integrated.tedd.extraction.ExtractionStrategies;
import com.awet_integrated.tedd.graph.GraphEdge;
import com.awet_integrated.tedd.graph.GraphNode;
import com.awet_integrated.tedd.graph.dot.importgraph.GraphImporter;
import com.awet_integrated.utils.Properties;
import org.apache.log4j.Logger;
import org.jgrapht.Graph;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

class MinimizeTestSuite {

    private final static Logger logger = Logger.getLogger(MinimizeTestSuite.class.getName());

    public static void main(String[] args) {

        config();

        Properties.getInstance().checkFileExistence(Properties.VALIDATED_GRAPH_PATH,
                "validated_graph_path");
        Properties.getInstance().checkDirectoryExistence(Properties.COVERAGE_REPORTS_DIRECTORY_PATH,
                "coverage_reports_directory_path");
        Properties.getInstance().checkPropertyNotEmpty(Properties.EXTRACTION_STRATEGY,
                "extraction_strategy");

        Properties.tests_order = new TestCaseFinder().getTestCaseOrder();

        GraphImporter graphImporter = new GraphImporter();
        Graph<GraphNode<String>, GraphEdge> dependencyGraph =
                graphImporter.importGraph(Properties.VALIDATED_GRAPH_PATH);

        CoverageReportImporter coverageReportImporter = new CoverageReportImporter();
        if(Properties.EXTRACTION_STRATEGY.equals(ExtractionStrategies.Strategy.COVERAGE_DRIVEN.getStrategyName())) {
            List<String> filesToConsider = dependencyGraph.vertexSet().stream().map(GraphNode::getTestCase).collect(Collectors.toList());
            coverageReportImporter = new CoverageReportImporter(filesToConsider);
        }
        CoverageReport coverageReport
                = coverageReportImporter.importReport(Properties.COVERAGE_REPORTS_DIRECTORY_PATH);


        Minimizer minimizer = new Minimizer();

        logger.info("======================================");
        logger.info("Finding solution to the minimization problem...");
        long start = System.currentTimeMillis();
        minimizer.minimizeTestSuite(coverageReport, dependencyGraph, false);
        logger.info("Time elapsed for minimization: " + ((System.currentTimeMillis() - start)/1000) + "s");
        logger.info("======================================");

//        System.out.println();
//        logger.info("======================================");
//        logger.info("Finding all the solutions to the minimization problem...");
//        start = System.currentTimeMillis();
//        minimizer.minimizeTestSuite(coverageReport, dependencyGraph, true);
//        logger.info("Time elapsed for minimization: " + ((System.currentTimeMillis() - start)/1000) + "s");
//        logger.info("======================================");
    }

    private static void config() {
        instantiateProperties();
    }

    private static void instantiateProperties() {
        Properties.getInstance().createPropertiesFile();
    }
}
