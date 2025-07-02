## Selenium Web Automation Project using Page Object Model

![Image](https://github.com/user-attachments/assets/906af1cd-783e-4825-89b4-34484240099c)

**Testing Site:** [https://www.rokomari.com/](https://www.rokomari.com/) 

**Tester Name:** Rahibur Rahman

** Tracking the update: ** [Click to Track the testing History ](https://docs.google.com/document/d/1jK6JC78hgNvRjVl-b5xbqPZpBVi41WunchVnhRaZ2vc/edit?usp=sharing)


**Prerequisite:** 

* IntelliJ IDE  
* Generator: Maven Archetype  
* Java version 8+  
* Testcase Studio Extension for manual testcase Writing

**Manual Test case Link :** [https://docs.google.com/spreadsheets/d/12KgtCh7dqoCeAWkZRSVr9pQz6hvKf5WuODxJfX9ap5c/edit?usp=sharing](https://docs.google.com/spreadsheets/d/12KgtCh7dqoCeAWkZRSVr9pQz6hvKf5WuODxJfX9ap5c/edit?usp=sharing) 

**Testing Method:**

**Step 1 : Manual testing**

* Use Testcase Studio for manual testing testcase writing.   
* Open Rokomari.com site  
* Do manual testing   
* The testcases are automatically will be added to the testcase Studio.  
* Convert this testcase file into Excel format

**Step 2: Automation testing**

**Environment Setup**

* Goto IDE and click File\>New\>Project  
* Create a maven Archetype project  
* The project structure will look like this

  ProjectName

  ├── .idea

  ├── src

  │   ├── main

  │   └── test

  │       └── java

  │           └── package name

  │               ├── Java Class

  │               

  ├── target

  ├── pom.xml

  └── External Libraries


* In Pom.xml we need to add some selenium and TestNG dependencies

  We will find those maven dependencies in: 

  For selenium

  [https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/4.32.0](https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/4.32.0) 

  For testNG

  [https://mvnrepository.com/artifact/org.testng/testng/7.11.0](https://mvnrepository.com/artifact/org.testng/testng/7.11.0) 	


* Delete Junit dependencies from pom.xml file and copy paste those selenium and testNG codes

* At external file all the dependencies will be downloaded automatically


  
Now Create Three packages named:

1. Pages  
2. Testcases  
3. Utilities

   The pages package contains all the selectors and common functions that are repetitive.

   The Testcases package contains codes for all the test pages

   The Utilities package contains Driver setup codes

   

   Now To Generate Report:

   

* Use Allure from maven repository. Copy and paste the dependency to POM.XML file   
* A file named testing.xml will be generated.  
* After writing all the codes Run the testing.xml file  
* Now go to terminal and type: **allure generate .\\allure-results\\ \--clean**  
* After that type: **allure open .\\allure-report\\**


A local server will start and you can see the html format test results

 

