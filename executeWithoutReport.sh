#!/bin/bash

echo "==================       This script will run and execute all the workon tests ============"

printf "\n";

echo "================= Moving to the main repository directory =========="

printf "\n";
cd /c/END1COB/NewWorkSpace/workontestautomation

echo "================= Printing the current directory ================== "

pwd

echo "================ Running command maven clean =============="


mvn clean

echo "================ Maven clean is done now =================="

echo "=============== Now lets run the test cases ==============="


mvn test


# now we will run one more test with out clean this test will send the reports in a zip file

printf "\n ==================  running the test to send the Report........"

printf "\n";

echo "=============== Running final Tests ==================="

printf "\n";

echo "=============== SENDING REPORT =========================="

#mvn test -Dtest=TestCase_Reports









