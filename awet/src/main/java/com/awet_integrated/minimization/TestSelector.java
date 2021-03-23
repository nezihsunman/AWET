package com.awet_integrated.minimization;

import com.awet_integrated.coverage.CovUnit;
import com.awet_integrated.coverage.CoverageReport;
import com.awet_integrated.tedd.graph.GraphNode;
import com.awet_integrated.tedd.graph.utils.ComparatorNodesIncreasing;
import com.awet_integrated.utils.SetsUtils;
import org.apache.log4j.Logger;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TestSelector {

    private final static Logger logger = Logger.getLogger(TestSelector.class.getName());

    public List<GraphNode<String>> greedySelectingTestCases(CoverageReport coverageReport) {
        List<GraphNode<String>> greedySelectedTestCases = new LinkedList<>();
        Map<GraphNode<String>, Set<CovUnit>> mapTestCovUnits = coverageReport.getMapTestCovUnits();
        Set<CovUnit> allCovUnits = new HashSet<>();
        List<GraphNode<String>> originalTestSuite = new LinkedList<>(mapTestCovUnits.keySet());
        originalTestSuite.sort(new ComparatorNodesIncreasing<>());
        GraphNode<String> testWithMaxCov = null;
        int maxCov = -1;
        for (GraphNode<String> testCase : originalTestSuite) {
            Set<CovUnit> unitsCoveredByTestCase = mapTestCovUnits.get(testCase);
            allCovUnits.addAll(unitsCoveredByTestCase);
            if(unitsCoveredByTestCase.size() > maxCov) {
                maxCov = unitsCoveredByTestCase.size();
                testWithMaxCov = testCase;
            }
        }
        logger.info("Test with max cov: " + testWithMaxCov + ", cov: " + maxCov);
        Set<CovUnit> incrementalCovUnits = new HashSet<>(mapTestCovUnits.get(testWithMaxCov));
        greedySelectedTestCases.add(testWithMaxCov);
        originalTestSuite.remove(testWithMaxCov);

        logger.info("All cov units: " + allCovUnits.size());
        while(!originalTestSuite.isEmpty() && !incrementalCovUnits.containsAll(allCovUnits)) {
            GraphNode<String> testToAdd = null;
            int maxCovDifference = -1;
            for (GraphNode<String> testCase : originalTestSuite) {
                Set<CovUnit> unitsCoveredByTestCase = mapTestCovUnits.get(testCase);
                int difference = SetsUtils.setsDifference(unitsCoveredByTestCase, incrementalCovUnits).size();
                if(difference > maxCovDifference) {
                    maxCovDifference = difference;
                    testToAdd = testCase;
                }
            }
            logger.info("Test to add: " + testToAdd + ", max cov diff: " + maxCovDifference);
            incrementalCovUnits.addAll(mapTestCovUnits.get(testToAdd));
            logger.info("Incremental cov units: " + incrementalCovUnits.size());
            greedySelectedTestCases.add(testToAdd);
            originalTestSuite.remove(testToAdd);
        }
        return greedySelectedTestCases;
    }

    public List<GraphNode<String>> selectTestCases(CoverageReport coverageReport) {
        List<GraphNode<String>> selectedTestCases = new LinkedList<>();
        Map<GraphNode<String>, Set<CovUnit>> mapTestCovUnits = coverageReport.getMapTestCovUnits();
        Set<CovUnit> allCovUnits = new HashSet<>();
        List<GraphNode<String>> originalTestSuite = new LinkedList<>(mapTestCovUnits.keySet());
        originalTestSuite.sort(new ComparatorNodesIncreasing<>());
        for (GraphNode<String> testCase : originalTestSuite) {
            logger.info("Test case: " + testCase);
            Set<CovUnit> unitsCoveredByTestCase = mapTestCovUnits.get(testCase);
            if(!allCovUnits.containsAll(unitsCoveredByTestCase)) {
                selectedTestCases.add(testCase);
                allCovUnits.addAll(unitsCoveredByTestCase);
            }
        }
        return selectedTestCases;
    }
}
