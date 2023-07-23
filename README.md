# E-Commerce-Automation-Testing


![Settings Window](https://github.com/MandaGayatri/E-Commerce-Automation-Testing/blob/main/Capture2.PNG)
![Settings Window](https://github.com/MandaGayatri/E-Commerce-Automation-Testing/blob/main/Capture.PNG)

## About Project

The eCommerce Login Page Mini Project is a small-scale web application focused on providing a secure and user-friendly login interface for an eCommerce platform.

It aims to enhance the user experience by allowing customers to log in securely, access their accounts and access their accounts. The project demonstrates

essential authentication and validation techniques to ensure the privacy and integrity of user data during the login process.

## My Project Contains:

### 1)Test Cases

Test Cases are like a set of instructions that describe what we want to test and how to do it. For our eCommerce Login Project,

 test cases would outline steps like entering valid credentials, checking for incorrect passwords and other scenarios.
 
 By having these test cases, we can ensure that our login page functions as expected and catches potential bugs.

### Base Class

The Base Class is like a foundation for our eCommerce Login Project. It contains common functionalities and settings that other classes can use.

 For example, it might have code for setting up the web browser, handling configurations, or logging in users. This helps avoid repeating code
 
 in multiple places and makes our project more organized.



### 2)Test Data

Test Data refers to the information we use to test the login functionality. In our case, it would include different usernames, 

passwords, and maybe some invalid data for testing error scenarios. This data is essential to ensure our login page works correctly

 with various inputs and validates user credentials accurately.

### 3)PageObjects

Page Objects is a design pattern commonly used in test automation to enhance the maintainability and readability of test scripts. 

It involves creating separate classes for each web page or component of a web application. These classes, known as "Page Objects,"

 encapsulate the page's elements, actions, and interactions, providing a clear and structured interface for test scripts to interact with the web pages.

### 4)Utilities

The utilities folder may also contain helper functions and classes specifically designed for testing purposes. These utilities can simplify common 

testing tasks, such as generating test data, setting up test environments, or verifying test results.

### 5)ScreenShots

The primary purpose of the screenshot folder is to store screenshots captured during the test execution process failure. These screenshots can be later 

reviewed by testers or developers to understand what was happening in the application at different stages of the test.

### 6)Drivers

 The drivers folder contains executable files for various web browsers, such as Chrome, Firefox, Edge, etc. These files act as intermediaries between 

Selenium scripts and the browsers, enabling Selenium to control and automate browser activities.

### 7)Configuraton

Config properties can be utilized to manage test data sources, enabling testers to define and access test data from external files (e.g., Excel, CSV)

 or databases. These properties specify the location of test data files and the method of data retrieval.

### 8)TestNG.xml

The testng.xml file is usually placed in the project's root directory or the test resources folder. It is recognized by TestNG as the primary configuration

 file that provides instructions on how to execute the tests.

The testng.xml file is organized into test suites. A test suite represents a collection of test classes or test methods that need to be executed together.

 Multiple test suites can be defined within the same testng.xml file.

### 9)POM.xml

The pom.xml file is a configuration file used in Java projects, specifically for projects built with Maven. It helps manage dependencies (external libraries)

 needed for our project to work correctly. In our eCommerce Login Project, we might use libraries for web testing and handling browser interactions, which 

we specify in the pom.xml file. This makes it easier for other developers to set up our project because Maven will automatically download the required libraries.

### Some of the Dependencies which are included in Project

1)slf4j

2)Selenium Driver

3)Selenium Remote Driver

4)JUnit

5)TestNG

6)Apache-poi

7)Apache-poi-ooxml

8)ExtentReports

9)Commons-lang3

10)PageFactory
