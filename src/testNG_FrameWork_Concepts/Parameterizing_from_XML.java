package testNG_FrameWork_Concepts;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterizing_from_XML {

	// This will mostly useful for global environmental setting,
	// username, password and URLs.
	// Common for all testcases.
	
	// we should execute from the XML folder, not from class.
	
	
	// if parameter is common for all test folder, then we have to set it as btwn Suite and Test.
	//<parameter name ="URL" value = "flipKart"> 
	
	 @Parameters({"url"}) // this is how, we need to call the parameter for the required method.  And we should pass the parameter as an argument on the method.
		@Test
		public void Come(String url) {
			
			System.out.println(url);	
			}
	 
	 @Parameters({"url", "username", "password"})
	 @Test
	 public void go(String url, String username, int password) {
		System.out.println(url);
		System.out.println(username);
		System.out.println(password);

	}

}
