package com.awet_integrated.tedd.extraction;

import com.awet_integrated.tedd.graph.GraphEdge;
import com.awet_integrated.tedd.graph.GraphNode;
import org.jgrapht.Graph;

public interface DependencyGraphExtractor {

    Graph<GraphNode<String>, GraphEdge> computeDependencies();
}
