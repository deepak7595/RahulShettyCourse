package seleniumConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserNavigators {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.uitestingplayground.com/dynamicid"); // This will wait until the page gets loaded fully
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/"); // But this will not wait till the
																					// page gets loaded fully.
		// this will open the provided URL on the same current page, not in on another
		// web page.

		driver.navigate().back(); // Will navigate to previous web page (Playground)
		driver.navigate().forward(); // Will reopen the replaced one (Automation pratice )

		driver.close();

	}

}
