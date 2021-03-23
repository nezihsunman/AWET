package com.awet_integrated.tedd.extraction;

import com.awet_integrated.parsing.TestCaseFinder;
import com.awet_integrated.subjects.Config;
import com.awet_integrated.subjects.SetupApp;
import com.awet_integrated.tedd.extraction.coverage_selection.CoverageDrivenGraphExtraction;
import com.awet_integrated.tedd.extraction.moea.BiobjectiveDependencyGraphExtraction;
import com.awet_integrated.tedd.extraction.originalorder.OriginalOrderDependencyGraphExtractor;
import com.awet_integrated.tedd.extraction.string.ConstantStringsAnalyzer;
import com.awet_integrated.tedd.graph.GraphEdge;
import com.awet_integrated.tedd.graph.GraphNode;
import com.awet_integrated.tedd.graph.dot.exportgraph.GraphExporter;
import com.awet_integrated.utils.Properties;
import org.jgrapht.Graph;

public class ExtractDependencyGraph {

    public static void main(String[] args) {

        config();

        Config config = SetupApp.getConfig();

        Properties.getInstance().checkFileExistence(Properties.TEST_SUITE_PATH,
                "test_suite_path");

        Properties.tests_order = new TestCaseFinder().getTestCaseOrder();

        DependencyGraphExtractor dependencyGraphExtractor = getExtractionStrategy(config);

        Graph<GraphNode<String>, GraphEdge> graph = dependencyGraphExtractor.computeDependencies();
        GraphExporter<String> graphExporter = new GraphExporter<>(graph);

        String graphName = "graph";
        if(Properties.EXTRACTION_STRATEGY.equals(ExtractionStrategies.Strategy.ORIGINAL_ORDER.getStrategyName())) {
            graphName += "-original-order";
        } else if(Properties.EXTRACTION_STRATEGY.equals(ExtractionStrategies.Strategy.BIOBJECTIVE.getStrategyName())) {
            graphName += "-biobjective";
        } else if(Properties.EXTRACTION_STRATEGY.equals(ExtractionStrategies.Strategy.SUB_USE.getStrategyName())) {
            graphName += "-string";
        } else if(Properties.EXTRACTION_STRATEGY.equals(ExtractionStrategies.Strategy.COVERAGE_DRIVEN.getStrategyName())) {
            graphName += "-coverage_driven";
        }

        graphExporter.export(graphName);

    }

    private static void config(){
        instantiateProperties();
    }

    private static void instantiateProperties(){
        Properties.getInstance().createPropertiesFile();
    }

    private static DependencyGraphExtractor getExtractionStrategy(Config config) {
        String extractionStrategy = Properties.EXTRACTION_STRATEGY;
        for (String strategy: ExtractionStrategies.getValues()){
            if(strategy.equals(ExtractionStrategies.Strategy.ORIGINAL_ORDER.getStrategyName()) && extractionStrategy.equals(strategy)){
                return new OriginalOrderDependencyGraphExtractor();
            } else if(strategy.equals(ExtractionStrategies.Strategy.BIOBJECTIVE.getStrategyName()) && extractionStrategy.equals(strategy)) {
                return new BiobjectiveDependencyGraphExtraction(config);
            } else if(strategy.equals(ExtractionStrategies.Strategy.SUB_USE.getStrategyName()) && extractionStrategy.equals(strategy)) {
                return new ConstantStringsAnalyzer();
            }else if(strategy.equals(ExtractionStrategies.Strategy.COVERAGE_DRIVEN.getStrategyName()) && extractionStrategy.equals(strategy)) {
                return new CoverageDrivenGraphExtraction(config);
            }
        }
        throw new IllegalArgumentException("Unknown extraction strategy "
                + extractionStrategy + ". See " + ExtractionStrategies.class + " for reference.");
    }
}
