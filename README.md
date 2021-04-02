# WorkON UI Test Automation

Everytime when we have new build for workon we need to test all the basic functionalities like we are able to create
requests in all the servers all the buttons are present and all the links are working and much more. This process is tedious
and time consuming. This project can be used to test the UI locally or on a remote server.


## Installation

1. Clone the repository
2. Make sure maven is working
3. Make sure JDK is set in the build path inside the eclipse
4. run the ```mvn clean```
5. run the command ```mvn test```


## Usage

1. Inside the src/main/resources/excel/testdata.xlsx 
2. above mentioned excel contains the run modes for each test cases if there is Y the test case will run otherwise it will not run.

## Contributing

Pull requests are welcome.


#### Documentation 

### Regression Testing 

- [x] Copy Request 
- [x] Delete Draft Request
- [x] Forward Request
- [x] Print Request
- [x] Save as Draft Request
- [x] Suspend Request 

### Generic Testing

- [x] AP8D Request Creation
- [x] APGA Request Creation
- [x] APMAZE Request Creation
- [x] EMEAAVG Request Creation
- [x] RBGA Request Creation
- [x] RBUBKPA Request Creation
- [x] STGA Request Creation




#### ROADMAP

- [x] Run it locally 
- [x] POC to run in docker EC2 done
- [] Run in our dev server trigerring it from local
- [x] Run in remote server building from TFS


#### Pending Tasks
- [x] Put all the testng suite files in one folder
- [x] Put all the logs output files in one folder
- [x] Separate suite files for each
- [x] All Testcases are working and report is generated
- [] Common Assert Class
- [] Common listener class and take the screenshot if test cases fails
 -[x]** Add the Request key and the link of the request in the surefire report **
 -[x]** Email the surefire reports using outlook **
