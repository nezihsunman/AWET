package com.awet_integrated.minimization;

import com.awet_integrated.coverage.CoverageReport;
import com.awet_integrated.coverage.CoverageReportImporter;
import com.awet_integrated.tedd.graph.GraphEdge;
import com.awet_integrated.tedd.graph.GraphNode;
import com.awet_integrated.tedd.graph.RandomGraphGenerator;
import org.apache.log4j.Logger;
import org.jgrapht.Graph;
import org.jgrapht.graph.DirectedAcyclicGraph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class ScalabilitySolverEncoding {

    private final static Logger logger = Logger.getLogger(ScalabilitySolverEncoding.class.getName());

    public static void main(String[] args) {

        Minimizer minimizer = new Minimizer();

        Graph<GraphNode<String>, GraphEdge> dependencyGraph = RandomGraphGenerator.generateGraph(200);

        CoverageReportImporter coverageReportImporter = new CoverageReportImporter();
        CoverageReport coverageReport
                = coverageReportImporter.mockReport(4000000, dependencyGraph.vertexSet()); // OutOfMemoryError --> try giving more memory

        logger.info("======================================");
        logger.info("Finding solution to the minimization problem...");
        long start = System.currentTimeMillis();
        minimizer.minimizeTestSuite(coverageReport, dependencyGraph, false);
        logger.info("Time elapsed for minimization: " + ((System.currentTimeMillis() - start)/1000) + "s");
        logger.info("======================================");
    }
}
