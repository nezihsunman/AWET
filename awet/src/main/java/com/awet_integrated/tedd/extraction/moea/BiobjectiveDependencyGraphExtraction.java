package com.awet_integrated.tedd.extraction.moea;

import com.awet_integrated.subjects.Config;
import com.awet_integrated.tedd.extraction.DependencyGraphExtractor;
import com.awet_integrated.tedd.graph.DependencyGraphManager;
import com.awet_integrated.tedd.graph.GraphEdge;
import com.awet_integrated.tedd.graph.GraphNode;
import com.awet_integrated.utils.Properties;
import org.apache.log4j.Logger;
import org.jgrapht.Graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class BiobjectiveDependencyGraphExtraction implements DependencyGraphExtractor {

    private final String mapOfDependenciesToAdd;

    private final static Logger logger = Logger.getLogger(BiobjectiveDependencyGraphExtraction.class.getName());

    public BiobjectiveDependencyGraphExtraction(Config config) {
        this.mapOfDependenciesToAdd = config.getDependencyGraphExtractionConfig().getParetoFrontSolution();
    }

    public BiobjectiveDependencyGraphExtraction(String mapOfDependenciesToAdd) {
        if(mapOfDependenciesToAdd == null || mapOfDependenciesToAdd.isEmpty())
            throw new IllegalArgumentException("Map of dependencies cannot be null nor empty!");
        this.mapOfDependenciesToAdd = mapOfDependenciesToAdd;
    }

    public Graph<GraphNode<String>, GraphEdge> generateGraph(int nodeOrderOffset) {
        List<String> mapNodesDeps = Arrays.stream(this.mapOfDependenciesToAdd.split("-"))
                .collect(Collectors.toList());
        DependencyGraphManager<String> dependencyGraphManager = new DependencyGraphManager<>();
        List<GraphNode<String>> nodes = new LinkedList<>();
        for (int i = 0; i < mapNodesDeps.size() + 1; i++) {
            GraphNode<String> graphNode = new GraphNode<>("t" + (i + nodeOrderOffset), i + nodeOrderOffset);
            nodes.add(graphNode);
            dependencyGraphManager.addNode(graphNode);
        }
        for (int i = 1; i < nodes.size(); i++) {
            char[] bits = mapNodesDeps.get(i - 1).toCharArray();
            this.addDependenciesTowards(nodes.subList(0, i), bits, nodes.get(i), dependencyGraphManager);
        }
        return dependencyGraphManager.getDependencyGraph();
    }

    @Override
    public Graph<GraphNode<String>, GraphEdge> computeDependencies() {
        List<String> mapNodesDeps = Arrays.stream(this.mapOfDependenciesToAdd.split("-"))
                .collect(Collectors.toList());
        DependencyGraphManager<String> dependencyGraphManager = new DependencyGraphManager<>();
        int numberOfVariables = mapNodesDeps.size();
        if(numberOfVariables != Properties.tests_order.length - 1) {
            throw new IllegalStateException("Number of variables must be equal to num of tests (nodes) - 1: "
                    + (Properties.tests_order.length - 1) + ". Found: " + numberOfVariables);
        }
        List<GraphNode<String>> nodes = this.buildNodes(dependencyGraphManager);
        for (int i = 1; i < nodes.size(); i++) {
            char[] bits = mapNodesDeps.get(i - 1).toCharArray();
            this.addDependenciesTowards(nodes.subList(0, i), bits, nodes.get(i), dependencyGraphManager);
        }
        return dependencyGraphManager.getDependencyGraph();
    }

    private List<GraphNode<String>> buildNodes(DependencyGraphManager<String> dependencyGraphManager) {
        List<GraphNode<String>> result = new LinkedList<>();
        for (int i = 0; i < Properties.tests_order.length; i++) {
            GraphNode<String> graphNode = new GraphNode<>(Properties.tests_order[i], i);
            result.add(graphNode);
            dependencyGraphManager.addNode(graphNode);
        }
        return result;
    }

    private void addDependenciesTowards(List<GraphNode<String>> targetNodes,
                                        char[] bits,
                                        GraphNode<String> sourceNode,
                                        DependencyGraphManager<String> dependencyGraphManager){
        for (int i = 0; i < targetNodes.size(); i++) {
            GraphNode<String> targetNode = targetNodes.get(i);
            if(bits[i] == '1') {
                dependencyGraphManager.addDependency(sourceNode, targetNode,
                        new GraphEdge(new ArrayList<>(), sourceNode, targetNode));
            }
        }
    }




}
