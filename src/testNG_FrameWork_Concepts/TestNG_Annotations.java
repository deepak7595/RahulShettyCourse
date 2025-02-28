package testNG_FrameWork_Concepts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class TestNG_Annotations {

	// These Two annotations scope will be in Test level
	@BeforeTest
	public void login() {
		System.out.println("This Block will execute before Test");

	}
	
	@AfterTest // the scope is only for test level, if we more than one test, then we have to use another annotation
	public void logout() {
		System.out.println("This generally use to delete the cookies, and clear data");

	}
	
	
	
	// These Two annotations scope will be in Suite level
	@org.testng.annotations.BeforeSuite
	public void BeforeSuite() {
		System.out.println("Environment details will be set, in this suite");

	}
	
	@AfterSuite
	public void AfterSuite() {
		System.out.println("This generally use to delete the cookies, and clear data");

	}
	
	// These Two annotations scope will be at Method level
	@BeforeMethod
	public void BeforeMethod() {
		System.out.println("This will execute, before all the methods");

	}
	
	@AfterMethod
	public void AfterMethod() {
		System.out.println("This will execute, After all the methods");

	}
	
	
	@BeforeClass
	public void BeforeClass() {
		System.out.println("This will execute, before any method in the class");

	}
	
	
	@AfterClass
	public void AfterClass() {
		System.out.println("This will execute, After any method in the class");

	}
	
	// In TestNg, The execution of Methods is based on Alphabetic order.
	
	
	

}
