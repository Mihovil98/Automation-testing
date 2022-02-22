# Automation testing for product store website

## 1. Introduction

### About project

This project is created for the assignment at "Methods and Techinques of Software Testing" course at FERIT Osijek.
In this project, automation testing was implemented for demo product store web application.
There are 5 UI tests.

### What do you need to start the project?

1. Google Chrome - [download here] https://www.google.com/intl/en/chrome/
2. Demo product store web application - https://www.demoblaze.com/
3. Environment editor - [download here] https://www.rapidee.com/en/download
4. JDK - [download here] https://www.oracle.com/java/technologies/downloads/
5. Maven - [download here] https://maven.apache.org/download.cgi
6. IntelliJ Community - [download here] https://www.jetbrains.com/idea/download/#section=windows
7. Google Chrome driver - [download here] https://chromedriver.chromium.org/
8. Mozilla Firefox driver - [download here] https://github.com/mozilla/geckodriver/releases
9. Microsoft Edge driver - [download here] https://developer.microsoft.com/en-us/microsoft-edge/tools/webdriver/

## 2. Environment setup

This section will explain step by step how to setup environment.

### Setup Google Chrome

1. Download Google Chrome from the link at the first section.
2. Install it by clicking "Next" buttons.

### Setup Environment editor

1. Download RapidEE from the link at the first section.
2. Install it by clicking "Next" buttons.

### Setup JDK

1. Download JDK from the link at the first section - choose Windows x64 Installer.
2. Install it by clicking "Next" buttons.
3. Open RapidEE as an administrator and click "Add new variable" button under System variables.
4. Write "JAVA_HOME" as a variable name.
5. Press "F7" and paste the JAVA JDK path (C:\Program Files\Java\jdk-17.0.2), press enter and save changes.

### Setup Maven

1. Download Maven from the link at the first section - choose Binary zip archive.
2. Extract the zip archive under "C:\Program Files".
3. Open RapidEE as an administrator and select Path variable under System variables.
4. Click "Add value to the current variable".
5. Press "F7" and paste maven bin directory path (C:\Program Files\apache-maven-3.8.4\bin), press enter and save changes.

### Setup IntelliJ Community

1. Download IntelliJ Community from the link at the first section - choose Community .exe.
2. Install it by clicking "Next" buttons.

### Setup Google Chrome Driver
1. Download Google Chrome Driver from the link at the first section - choose version according to the browser version.
2. Create drivers directory under "C:" and paste downloaded .exe file there.
3. Open RapidEE as an administrator and select Path variable under System variables.
4. Click "Add value to the current variable".
5. Press "F7" and paste drivers directory path (C:\drivers), press enter and save changes.

## 3. Run Tests

Kreirati testng.xml file.
