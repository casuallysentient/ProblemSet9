#!/bin/sh

rm -rf grader/
unzip -n grader.zip
cd grader/

javac ../../src/Exercises.java -d ./
jar uf grader.jar Exercises.class
rm -rf Exercises.class

if [ $# -eq 0 ]; then
    echo
    echo "Usage: ./grademe.sh grader.jar <exercise>"
    echo
    echo "Available exercises:"
    echo "  - commonEnd"
    echo "  - endsMeet"
    echo "  - difference"
    echo "  - biggest"
    echo "  - middle"
    echo "  - increasing"
    echo "  - everywhere"
    echo "  - consecutive"
    echo "  - balance"
    echo "  - clumps"
else
    java -jar grader.jar $1
fi