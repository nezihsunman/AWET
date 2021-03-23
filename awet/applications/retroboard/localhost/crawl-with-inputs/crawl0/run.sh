#!/bin/bash
BASEDIR=$(dirname "$0")
echo "Compiling generated tests source files..."
cp="$BASEDIR/../../../libs/*"
javac -cp $cp:../../../plugins/testcasegenerator-plugin/target/classes/ "$BASEDIR/src/test/java//generated/GeneratedTests.java"
echo "Running generated tests..."
java -cp $cp:../../../plugins/testcasegenerator-plugin/target/classes/:"$BASEDIR/src/test/java/" org.testng.TestNG testng.xml