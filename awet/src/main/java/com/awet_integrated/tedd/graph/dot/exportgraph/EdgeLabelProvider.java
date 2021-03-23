package com.awet_integrated.tedd.graph.dot.exportgraph;

import com.awet_integrated.tedd.extraction.string.StringValue;
import com.awet_integrated.tedd.graph.GraphEdge;
import com.awet_integrated.tedd.graph.dot.EdgeLabel;
import org.jgrapht.io.ComponentNameProvider;

import java.util.Collection;

public class EdgeLabelProvider implements ComponentNameProvider<GraphEdge> {

    @Override
    public String getName(GraphEdge graphEdge) {
        StringBuilder builder = new StringBuilder();
        Collection<StringValue> dependentValues = graphEdge.getDependentValues();
        int counter = 0;
        for(StringValue dependentValue: dependentValues){
            builder.append(EdgeLabel.buildLabel(dependentValue));
            if(counter != dependentValues.size() - 1){
                builder.append(" \\n ");
            }
            counter++;
        }
        if(graphEdge.isManifest() && graphEdge.isInteresting())
            builder.append("\" color=\"" + EdgeLabel.manifest_dependency_color);
        if(!graphEdge.isInteresting() && !graphEdge.isManifest())
            builder.append("\" color=\"" + EdgeLabel.uninteresting_dependency_color);
        return builder.toString();
    }
}
