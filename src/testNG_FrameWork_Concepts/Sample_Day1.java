package testNG_FrameWork_Concepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Sample_Day1 {
    @Parameters({"url"}) // this is how, we need to call the parameter for the required method.  And we should pass the parameter as an argument on the method.
	@Test
	public void Come(String url) {
		
		System.out.println(url);	
		}
  
 

}
