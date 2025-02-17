package seleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorTraining {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.uitestingplayground.com/dynamicid");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		driver.close();

		// Xpath
		System.out.println(driver
				.findElement(
						By.xpath("//input[@id='confirmbtn']/ancestor::div/preceding-sibling::div[@class='left-align']"))
				.getText());

		// for css, when we use classname, if any spaces inbtwn, we should make replaced
		// with (.) dot operators
	}

}
