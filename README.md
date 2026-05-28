# Data-Driven Login Automation Framework (Selenium Java)

This repository contains a robust, data-driven web automation framework designed to test login functionalities. It leverages **Selenium WebDriver 4** for browser interactions, **JUnit 4** for test orchestration, and **Apache POI** to drive test scenarios externally via Microsoft Excel.

## 🛠️ Tech Stack & Tools
* **Language:** Java
* **Automation Tool:** [Selenium WebDriver v4.39.0](https://selenium.dev)
* **Test Runner:** JUnit 4
* **Data-Driving Engine:** Apache POI (v5.2.5) & Commons IO
* **Reporting Engine:** ExtentReports (v5.0.9)
* **Build Tool:** Maven

## ✨ Core Features
* **Data-Driven Testing (DDT):** Seamlessly imports login credentials, edge-case variations, and test data directly from external Excel sheets (`.xlsx`) using Apache POI.
* **Smart Synchronization:** Utilizes Selenium 4 explicit and fluent waits to defeat flaky elements and wait on dynamic page states.
* **Rich HTML Diagnostics:** Compiles detailed execution logs, steps, and visual statuses into an interactive `ExtentReports` HTML dashboard.
* **Cross-Browser Capable:** Native Selenium 4 engine configured to easily switch test execution across Chrome, Edge, and Firefox.

## 🚀 Getting Started

### Prerequisites
* JDK 11 or higher (Recommended: JDK 17)
* Apache Maven 3.8+
* Microsoft Excel or an alternative program to edit test data sheets

### Installation
1. Clone this repository:
   ```bash
   git clone https://github.com
   ```
2. Navigate into the project workspace:
   ```bash
   cd YOUR_REPOSITORY_NAME
   ```
3. Resolve dependencies and compile your classes:
   ```bash
   mvn clean compile
   ```

## 🏃 Running Tests
Execute your automated JUnit test suites directly via the Maven CLI:
```bash
mvn test
```

## 📊 Test Reports
After your automated test runs finish, view the comprehensive dashboard summary at:
* **Location:** Look inside your configured project workspace directory for the generated `ExtentReports` HTML file (e.g., `target/ExtentReports/index.html`).
