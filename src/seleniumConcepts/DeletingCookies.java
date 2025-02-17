package seleniumConcepts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeletingCookies {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://expired.badssl.com/");
		driver.manage().window().maximize();
		//Through this line, we can delete the cookies
		driver.manage().deleteAllCookies();
		//delete specific cook
		driver.manage().getCookieNamed("");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}

}
