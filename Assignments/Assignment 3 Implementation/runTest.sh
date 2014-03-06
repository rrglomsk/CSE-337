#!/bin/bash
java -cp bin:.:hamcrest-core-1.3.jar:junit-4.11.jar org.junit.runner.JUnitCore sort.SortArrayTest
