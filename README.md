# Automation-Testing-Framework

A robust, scalable, and maintainable Test Automation Framework designed for the **Automation Exercise** platform, specifically automating end-to-end user workflows like User Registration and Login processes. Built using **Java**, **Selenium WebDriver**, and **TestNG**, this framework follows industry-standard software engineering practices.

##  Key Features & Highlights
* **Page Object Model (POM):** Enhances code maintainability and reduces redundancy by separating page-specific elements (Locators) and behaviors from the actual test scripts.
* **Data-Driven Testing (DDT):** Implements a clean separation of test logic and test data. External data sources in **JSON** formats are seamlessly mapped into TestNG DataProviders using the **Jackson Library**.
* **Comprehensive Test Coverage:** Validates multiple user flows including positive scenarios (successful login/registration) and critical negative paths (invalid data, existing emails, error validations).
* **Robust Synchronization:** Utilizes explicit and fluent waits instead of hard-coded sleeps to ensure highly stable test execution across varying network speeds.

---

## Technology Stack & Tools
* **Programming Language:** Java (JDK 11+)
* **Automation Tool:** Selenium WebDriver (v4.x)
* **Testing Framework:** TestNG
* **Build Management Tool:** Maven
* **JSON Parser:** Jackson Databind (for Data-Driven Testing)

---

## 📂 Project Structure
```text
Automation-Testing-Framework/
│
├── src/
│   ├── main/java/             # Page Objects (Locators and Page Actions)
│   │   └── pages/
│   │       ├── LoginPage.java
│   │       └── RegisterPage.java
│   │
│   └── test/java/             # Test Cases and Framework Configurations
│       ├── tests/
│       │   ├── LoginTests.java
│       │   └── RegisterTests.java
│       └── data/              # Test Data Management
│           └── TestDataReader.java
│
├── src/test/resources/        # Test Environment Data (JSON, Properties)
│   └── testdata/
│       └── userPayloads.json
│
├── pom.xml                    # Maven Dependencies & Configuration
└── README.md                  # Project Documentation
How to Run the Project Locally
Follow these simple steps to clone and execute the automated test suites on your machine:

Prerequisites
Ensure you have the following installed:

1. Java JDK (version 11 or higher)

2. Apache Maven

3. Google Chrome (or your preferred browser)
Steps
Clone the Repository:

Bash
git clone [https://github.com/yahiaahmd/Automation-Testing-Framework.git](https://github.com/yahiaahmd/Automation-Testing-Framework.git)
Navigate into the Project Folder:

Bash
cd Automation-Testing-Framework

Execute All Automated Tests:

Bash
mvn clean test

Developed with by Yahia Ahmed — Quality Assurance & Automation Engineer.
