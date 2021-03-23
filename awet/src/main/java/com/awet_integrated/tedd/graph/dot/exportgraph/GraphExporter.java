package com.awet_integrated.tedd.graph.dot.exportgraph;

import com.awet_integrated.tedd.graph.GraphEdge;
import com.awet_integrated.tedd.graph.GraphNode;
import com.awet_integrated.utils.Properties;
import org.jgrapht.Graph;
import org.jgrapht.io.DOTExporter;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;

public class GraphExporter<T> {

    private Graph<GraphNode<T>, GraphEdge> dependencyGraph;
    private EdgeLabelProvider edgeLabelProvider;
    private NodeNameProvider<T> nodeNameProvider;
    private String dependencyGraphPath;

    public GraphExporter() {
        this.edgeLabelProvider = new EdgeLabelProvider();
        this.nodeNameProvider = new NodeNameProvider<>();
    }

    public GraphExporter(Graph<GraphNode<T>, GraphEdge> dependencyGraph){
        this();
        this.dependencyGraph = dependencyGraph;
    }

    public void export(Graph<GraphNode<T>, GraphEdge> dependencyGraph, String exportedGraphName){
        String dependencyGraphPath = Properties.DEPENDENCY_GRAPH_PATH;
        DOTExporter<GraphNode<T>, GraphEdge> dotExporter = new DOTExporter<>(nodeNameProvider,
                null, edgeLabelProvider);
        try {
            Writer writer = new PrintWriter(dependencyGraphPath + "/" + exportedGraphName + "-"
                    + Properties.APPLICATION_NAME + ".txt", "UTF-8");
            dotExporter.exportGraph(dependencyGraph, writer);
            this.dependencyGraphPath = dependencyGraphPath + "/" + exportedGraphName + "-"
                    + Properties.APPLICATION_NAME + ".txt";
        } catch (FileNotFoundException | UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    public void export(String exportedGraphName){
        if(this.dependencyGraph != null) {
            String dependencyGraphPath = Properties.DEPENDENCY_GRAPH_PATH;
            DOTExporter<GraphNode<T>, GraphEdge> dotExporter = new DOTExporter<>(nodeNameProvider,
                    null, edgeLabelProvider);
            try {
                Writer writer = new PrintWriter(dependencyGraphPath + "/"
                        + exportedGraphName + "-"
                        + Properties.APPLICATION_NAME + ".txt", "UTF-8");
                dotExporter.exportGraph(this.dependencyGraph, writer);
                this.dependencyGraphPath = dependencyGraphPath + "/" + exportedGraphName + "-"
                        + Properties.APPLICATION_NAME + ".txt";
            } catch (FileNotFoundException | UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        } else {
            throw new UnsupportedOperationException("Dependency graph is not initialized");
        }
    }

    public String getDependencyGraphPath() {
        return dependencyGraphPath;
    }
}
