#!/bin/bash

application_name=$1
main_class=$2
extraction_strategy=$3

results_folder=$HOME/Desktop/$application_name-validation-$extraction_strategy
if [[ -d $results_folder ]]; then
    rm -rf $results_folder
fi
mkdir $results_folder
mkdir $results_folder/graphs

dependency_graph_path="$HOME/workspace/AWET/awet/applications/$application_name/testsuite-$application_name/src/main/resources"
mv $dependency_graph_path/dependency-graph-*$application_name.txt $results_folder/graphs
mv $results_folder/graphs/dependency-graph-$extraction_strategy-initial-*$application_name.txt $results_folder
mv $results_folder/graphs/dependency-graph-$extraction_strategy-final-*$application_name.txt $results_folder
