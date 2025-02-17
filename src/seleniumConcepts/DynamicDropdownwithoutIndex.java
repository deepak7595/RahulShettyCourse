package seleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdownwithoutIndex {

	public static void main(String[] args) throws InterruptedException {

		// --(//input[@text()='chennai'])[2] => Instead of wrapping up with braces. we
		// can go with parent to child........
		// Two xpaths, first refers parent and one white space and child xpath
		// example: //div[@class='destination'] //a[@class='MAA']

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://spicejet.com"); // URL in the browser

		// //a[@value='MAA'] - Xpath for chennai

		// //a[@value='BLR']

		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();

		driver.findElement(By.xpath("//a[@value='BLR']")).click();

		Thread.sleep(2000);

		// driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();

		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']"))
				.click();

		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();

	}

}
