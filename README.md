# Galaxy AI Automation Framework

## Overview

This project is a Selenium Automation Framework built from scratch using Java and TestNG to automate critical user workflows of an AI-powered web application similar to Galaxy.ai.

The framework follows industry-standard automation practices including Page Object Model (POM), reusable components, reporting, and CI/CD integration to ensure maintainability, scalability, and reliability.

---

## Tech Stack

* Java
* Selenium WebDriver
* TestNG
* Maven
* Page Object Model (POM)
* WebDriverManager
* Extent Reports
* Jenkins
* GitHub Actions
* Git & GitHub

---

## Framework Features

### Page Object Model (POM)

* Separate page classes for better maintainability
* Reusable locators and methods
* Improved code readability

### Explicit Waits

* Handles dynamic web elements
* Improves test stability
* Reduces flaky test failures

### Reporting

* Extent Reports integration
* Detailed execution results
* Pass/Fail status tracking

### CI/CD Integration

* Jenkins pipeline execution
* GitHub Actions workflow
* Automated test execution on code changes

---

## Project Structure

src/test/java

├── base
│ └── BaseTest.java

├── pages
│ ├── LoginPage.java
│ ├── SignupPage.java
│ └── VerificationPage.java

├── utilities
│ └── ExtentManager.java

├── tests
│ └── GalaxyTest.java

└── reports
└── ExtentReport.html

---

## Automated Test Flow

### User Signup Flow

* Launch Application
* Handle Welcome Popup
* Click "Get Started"
* Enter First Name
* Enter Last Name
* Enter Email Address
* Enter Password
* Click Continue
* Validate Successful Navigation

---

## OOP Concepts Used

### Encapsulation

Locators are kept private within page classes and exposed through public methods.

### Abstraction

Complex Selenium operations are hidden behind business methods such as:

* clickGetStarted()
* enterFirstName()
* clickContinue()

### Inheritance

BaseTest class contains common browser setup and teardown methods which are inherited by test classes.

### Objects & Constructors

Page Objects are initialized using WebDriver and constructors for better reusability.

---

## Running Tests

Clone Repository

git clone (https://github.com/dips2022/galaxyaiAutomation/)

Navigate to Project

cd galaxyautomation

Execute Tests

mvn clean test

---

## Jenkins Execution

The framework is integrated with Jenkins and can be executed automatically using scheduled builds or CI/CD pipelines.

---

## GitHub Actions

GitHub Actions workflow is configured to execute automation tests automatically on repository updates.

---

## Future Enhancements

* Screenshot Capture on Failure
* Data Driven Testing
* REST Assured API Automation
* Cross Browser Execution
* Docker Integration

---

## Author

Dipali Sonawane

QA Engineer | Manual & Automation Testing

Email: [dipalisonawane1999@gmail.com](mailto:dipalisonawane1999@gmail.com)

LinkedIn: https://www.linkedin.com/in/dipali-sonawane-a5a147230/

GitHub: https://github.com/dips2022


 
