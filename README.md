# Lamdatest assesment_2

This project demonstrates how to configure and run TestNG tests in parallel using Maven, Eclipse, and LambdaTest.

## Prerequisites

- Java Development Kit (JDK) 11 or higher
- Apache Maven
- Eclipse IDE

## Setup

1. Clone the repository:

2. Open the project in Eclipse.

3. Set up your LambdaTest account and obtain the access key and secret key.

4. Configure the testng.xml file with your test configurations, including parallel execution settings 
   and LambdaTest desired capabilities.
   
## Running the Tests

To run the tests on the LambdaTest Cloud Selenium Grid:

1. Open the terminal in your Gitpod workspace.

2. Execute the following commands to set up the environment and run the tests:

sudo apt-get update
sudo apt-get install -y openjdk-11-jdk
sudo update-java-alternatives --set java-1.11.0-openjdk-amd64
mvn clean install -DskipTests
mvn test -Dsurefire.suiteXmlFiles=testng.xml

These commands will update the package manager, install OpenJDK 11, set the default Java version, build the project skipping the tests, and then run the tests using the TestNG XML configuration file specified in testng.xml.

3. Once the tests are executed on the LambdaTest Cloud Selenium Grid, you will receive test IDs or          	execution details as output or logs.

4. Record the final Test ID(s) and any relevant information from the test execution on LambdaTes
	