package com.awet_integrated.tedd.graph.utils;

import com.awet_integrated.tedd.graph.GraphNode;

import java.util.Comparator;

public class ComparatorNodesDecreasing<T> implements Comparator<GraphNode<T>> {

    @Override
    public int compare(GraphNode<T> node1, GraphNode<T> node2) {
        return node2.getNumOrder() - node1.getNumOrder();
    }
}
