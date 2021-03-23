package com.awet_integrated.tedd.validation;

import com.awet_integrated.tedd.graph.GraphNode;

import java.util.Optional;

public class ManifestResult<T> {

    private boolean isManifest;
    private GraphNode<T> testCaseWithUnexpectedResult;

    public ManifestResult(boolean isManifest, GraphNode<T> testCaseWithUnexpectedResult){
        this.isManifest = isManifest;
        this.testCaseWithUnexpectedResult = testCaseWithUnexpectedResult;
    }

    public boolean isManifest() {
        return this.isManifest;
    }

    public Optional<GraphNode<T>> getTestCaseWithUnexpectedResult() {
        if(this.testCaseWithUnexpectedResult != null){
            if(!this.isManifest) {
                throw new IllegalStateException("Test " + this.testCaseWithUnexpectedResult
                        + " failed but no manifest dependency was revealed.");
            }
            return Optional.of(this.testCaseWithUnexpectedResult);
        }
        return Optional.empty();
    }
}
