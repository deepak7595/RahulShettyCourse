package seleniumConcepts;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.time.Duration;
import java.util.List;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;


public class SoftAssertions {
	
	//difference btwn SOFT Assertion and hard Assertion(normal)
	// if hard Assertion failed, then it will stop the execution. The remaining lines of code will not be executed. 
	// if soft assertion failed, it wont stop the execution. It will execute the remaining lines of the code as usual. 
	//when using soft Assert, we should create an object. and at the end, we should use assertall method. Bcz it stores the failure while runtime. and report at the end. 
	// if we failed to put that line at the end, then it wont report anything. so that last line is mandatory.

	public static void main(String[] args) throws MalformedURLException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		List<WebElement> links = driver.findElements(By.xpath("//*[@class='gf-li']/a"));
		
		SoftAssert a = new SoftAssert();
		
		
		for (WebElement link : links) {
			
			@Nullable
			String url = link.getAttribute("href");
			HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int responseCode = conn.getResponseCode();
			System.out.println(responseCode);
			
			a.assertEquals(responseCode<400, "The link is Broken, the name of the links is " + link.getText()+ "and the response code is "+responseCode);
					
		}
		a.assertAll();

	}

}
