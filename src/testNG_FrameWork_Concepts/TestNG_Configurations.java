package testNG_FrameWork_Concepts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG_Configurations {

	Class 1

	// To install -> Go to help in eclipse -> Eclipse MarketPlace -> Search for
	// TestNG
	// Download Testng for Eclipse -> Select all the checkboxes while installing.
	// ANd if we get the restart option, then Testng is installed successfully.

	Class 2

	// To check TestNG Is already installed in machine
	// go to window -> Preferences -> Search TestNG -> if its coming then Eclipse
	// have TESTNG.

	// to execute TestNg, We need to have @Test Annotation. which means, TestnG
	// requires a function to run. we no need to have Main class.

	@Test
	public void TestNGDemo() {
		System.out.println("Welcome to TestNG");

	}

	// We should run, by using testng suite.

	Class 3

	// Importance of the XML file and its configurations.
	// if we define @Test, those function is treated as on testcase.
	// we can trigger our test execution from the XML file. Thats the heart of the
	// TestNG framework.

	// To convert -> Right click the project -> TestNG -> Convert to TestNG -> Next
	// -> Finish. Then testng.xml file will be created at the end of the project
	// root folder.

	@Test
	public void SecondDemo() {
		System.out.println("Welcome to TestNG");


		// Explanation of XML Tags and usage.
		// 1-> Test Suite -> Test folder(Modules) -> Testcases. ==> Test Suites are likely to be a different modules.

		// How to Run all the tests from XML.
		// right click testng.xml, and run Testsuite. after the proper configurations.


		class 4

		<Suite name = "Loan Department">
			<test name = "Personal Loan">
				<Classes>
					<class name = "testNG_FrameWork_Concepts.Sample_Day1">
					<class name = "testNG_FrameWork_Concepts.Sample_Day2">
					</Classes>
					</test>
			<test name = "Car Loan">
				<Classes>
					<class name = "testNG_FrameWork_Concepts.Sample_Day3">
				</Classes>
			</test>
		</Suite>		

		// here we have created one test suite has two different modules. We can execute all the testcases in single shot. 
		//if we want to execute for only one modules, we simply remove or disable one of the test 


		 Class 5
		 --------
		 
		 Include and Exclude Mechanism

		// Scenario
		//Skip Sleep testcase from Sample_Day3 class.
		
		
		<Suite name = "Loan Department">
			<test name = "Personal Loan">
				<Classes>
					<class name = "testNG_FrameWork_Concepts.Sample_Day1">
					<class name = "testNG_FrameWork_Concepts.Sample_Day2">
					</Classes>
				</test>
					<test name = "Car Loan">
				<Classes>
					<class name = "testNG_FrameWork_Concepts.Sample_Day3">
						<methods>
							<exclude name = "Sleep"> //testcase name should be specified{function name}
						</methods>
					</class>	
				</Classes>
				</test>
				</Suite>
				// This way, we can skip, any  testcases from execution. 
				
				
			The same way, we can include testcase by using "include"
			
			Example for include
			-------------------
			
			<Suite name = "Loan Department">
			<test name = "Personal Loan">
				<Classes>
					<class name = "testNG_FrameWork_Concepts.Sample_Day1">
					<class name = "testNG_FrameWork_Concepts.Sample_Day2">
					</Classes>
				</test>
					<test name = "Car Loan">
				<Classes>
					<class name = "testNG_FrameWork_Concepts.Sample_Day3">
						<methods>
							<include name = "Sleep"> // from this sleep testcase only gets execute, wake will be skipped. 
						</methods>
					</class>	
				</Classes>
			</test>
				</Suite>	
				
	Class 6:
	=======				
	
	dot wildCart: 
--------------------			

//Naming conversation is mandatory. So creating testcases based on modules. Make sure we use some standard keypoint for all the testcases.
Example, prefix or suffix should be common for all the testcases in that particular module, that way, we can easy manage the testcase, when it comes to execution


Scenario
------------

Skip all Sleep modules related testcases.
------------------------------------------

<Suite name = "Loan Department">
	<test name = "Personal Loan">
		<Classes>
			<class name = "testNG_FrameWork_Concepts.Sample_Day1">
			<class name = "testNG_FrameWork_Concepts.Sample_Day2">
			</Classes>
		</test>
			<test name = "Car Loan">
		<Classes>
			<class name = "testNG_FrameWork_Concepts.Sample_Day3">
				<methods>
					<exclude name = "Sleep.*"> // if we set the .widlcart ".*", this will exclude all the testcases which starts as "Sleep"  
				</methods>
			</class>	
		</Classes>
	</test>
		</Suite>
		// if we set the widlcart, this will exclude all the testcases which starts as "Sleep"  . we can use the same mechanism for "include"
		

Class 7
========

Package level
----------------

<Suite name = "Loan Department">
	<test name = "Personal Loan">
		<packages>
			<package name = "testNG_Configurations">		// if we give package name, all the file we have inside the package, will get execute.
		</packages>
	</test>
</Suite>



Class 8
=============

Groupings
----------

<Suite name = "Loan Department">
	<test name = "Personal Loan">
			<groups>
				<run>
					<include name ="Smoke"/>   // this will only execute the method which is having Smoke tag name. it helps to run only few testcases among all others.
					<exclude name ="Regression"/> // this will skip the testcases which has the tagName as Regression.
				</run>
			</groups>
		<Classes>
		<class name = "testNG_FrameWork_Concepts.Sample_Day1">
		<class name = "testNG_FrameWork_Concepts.Sample_Day2">
		<class name = "testNG_FrameWork_Concepts.Sample_Day3">			
		</Classes>
	</test>
</Suite>



Class 9:
=======	
Helper Attributes
================

dependsOnMethods
===================

@Test(groups = {"Smoke"})
public void Come() {
	System.out.println("Come");

}

@Test(dependsOnMethods= {"Come"}) // we have to specify the method name, so that, it will execute the specified method, before its execute. It always depends the specified method.
public void Go() {
	System.out.println("Go");
	// we can add multiple methods too.  (dependsOnMethods= {"Come", "Sleep"})

}

Class 10
============

enabled
=======

@Test(enabled = false)
public void Come() {
	System.out.println("Come");

}

if we set this for any of the method, then testng will skip this method from execution. if we set enabled=True. then execution will include.
it mostly handle the error giving methods.if any methods expect to give error, we simply hald the 


Class 11
=========

timeOut
======

This will extend the time limit for the methods. it wont allow the methods to get failed due to timeout.
It helps to wait for the specified time limit, before throw an exception or failure.

@Test(timeOut = 4000) // this take milliSeconds. => here its 40 seconds.
public void Come() {
	System.out.println("Come");

}



Class 12
===========

Parameterized
=============

// we have to specify the parameter in XML, in which level we going to use. 
if set it as suite level, that will be applicable for all the tests.
if we set it in test level that will be applicable for class level
if we set it in class


<suite name="Suite"> // if we set it above test, we can use this for all the test. if its defined next to test, then that would be useful for that particular test.
	<parameter name="url" value="https://flipkart.com"/> // that way, we can use it for different modules, they will be using different values.
		<test thread-count="5" name="Deepak">
			<classes>
				<class name="testNG_FrameWork_Concepts.Parameterizing_from_XML"/>
			</classes>
		</test> <!-- Test -->
</suite> <!-- Suite -->


Multiple Parameter
==================

<suite name="Suite"> 
	<parameter name="url" value="https://flipkart.com"/>
	<parameter name="userName" value="Deepak007"/>
	<parameter name="password" value="007"/>
		<test thread-count="5" name="Deepak">
			<classes>
				<class name="testNG_FrameWork_Concepts.Parameterizing_from_XML"/>
			</classes>
		</test> <!-- Test -->
</suite> <!-- Suite -->


use in methods
=============
@Parameters({"url", "username", "password"})
@Test
public void go(String url, String username, int password) {
	System.out.println(url);
	System.out.println(username);
	System.out.println(password);

}


Class 13:
==========

DataProvider
==============

This will be used to execute the same script, with multiple or different set of Test Data. {ex: 20 time, with 20 different test data}
This is independent of XML. its purely class dependent.



Class 14:
=========

TestNG Listerners
=================
Listerners will activate after or before your tests.

Sceanrio, we have to take screenshot, everytime it failure. We have to use, these kind of scenario's.
When testcase failed, it will re-route to that block and execute the code. as like receovery sceanrio.
we can use it for logs the errors. 
Need to create one seperate class. 
// ItestListners  is interface, which implements Testng Listerners.

To get the details of which testcase got failed, we should use. "result.getName()" => this will display the failed method name.


// Listeners tag is must in testng.xml-> Mandatory

<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
<suite name="Suite">
	<listeners>
		<listener class-name="testNG_FrameWork_Concepts.Listeners"></listener>
	</listeners>
  <test thread-count="5" name="Test">
    <classes>
      <class name="testNG_FrameWork_Concepts.DataProvider_Example"/>
    </classes>
  </test> <!-- Test -->
</suite> <!-- Suite -->


class 15: 
==========

Parellel Executions
=====================

<suite name="Suite" parallel ="tests" thread-count = 3 > // this we execute the scripts through test level. its not suggestable. selenium grid will be useful for parallel execution
<listeners>
	<listener class-name="testNG_FrameWork_Concepts.Listeners"></listener>
</listeners>
	<test thread-count="5" name="Test">
	<classes parallel ="classes" thread-count = 3>
	  <class name="testNG_FrameWork_Concepts.DataProvider_Example"/>
	</classes>
	</test> <!-- Test -->
		<test thread-count="5" name="Test">
		<classes>
		  <class name="testNG_FrameWork_Concepts.DataProvider_Example"/>
		</classes>
		</test> <!-- Test -->
</suite> <!-- Suite -->

// we can execute classes also in parallel, we should have either one of them

class 16
==========

Reports
========
test-output folder => index.hetml-> rright click -> properties -> copy the path and hit on browser -> we will get the results

		

	}

}
