Lamdatest assesment_2
This project demonstrates how to configure and run TestNG tests in parallel using Maven, Eclipse, and LambdaTest.

Prerequisites
Java Development Kit (JDK) 11 or higher
Apache Maven
Eclipse IDE
Setup
Clone the repository:

Open the project in Eclipse.

Set up your LambdaTest account and obtain the access key and secret key.

Configure the testng.xml file with your test configurations, including parallel execution settings and LambdaTest desired capabilities.

Running the Tests
To run the tests on the LambdaTest Cloud Selenium Grid:

Open the terminal in your Gitpod workspace.

Execute the following commands to set up the environment and run the tests:

tasks:

init: mvn install -DskipTests=false mvn test -Dsurefire.suiteXmlFiles=testng.xml
These commands will update the package manager, install OpenJDK 11, set the default Java version, build the project skipping the tests, and then run the tests using the TestNG XML configuration file specified in testng.xml.

Once the tests are executed on the LambdaTest Cloud Selenium Grid, I will receive test IDs or execution details as output or logs.

Recorded the final Test ID(s) and any relevant information from the test execution on LambdaTest.
