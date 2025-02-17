package seleniumConcepts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ScrollingBehaviourJavaScriptExecutor {

	// String to int, int to string conversion
	// Scrolling behaviour for webpage and tables
	// Fetch values from table
	//javascriptExecutor is also used to find the hidden elements in the dom page

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js = (JavascriptExecutor) driver;

		// this scrolls the webpage, based on the defined x and y axis
		js.executeScript("window.scrollBy(0, 500)");
		Thread.sleep(4000);

		// this is for scrolling in the table..
		// ScrollTop,Scrolldown,ScrollLeft, ScrollRight we have..

		// .tablefixhead is the classname of the table.
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");

		int sum = 0;
		// get the values from the last row of the table and perform summation
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='tableFixHead']//tr//td[4]"));
		for (int i = 0; i < list.size(); i++) {
			String text = list.get(i).getText();
			System.out.println(text);
			// getText, will return string, so we cant perform calculation with string
			// values. So we have to convert it into interger. To do so,

			sum = sum + Integer.parseInt(text);

			// to convert interger to string. The below method will help. we will get other
			// datatypes, when we Type {Integer.}
			// Integer.toString();

		}
		System.out.println(sum);
		String ExpectedAmount = driver.findElement(By.className("totalAmount")).getText();
		String[] a = ExpectedAmount.split(": ");
		System.out.println(a[1]);

		int totalAmount = Integer.parseInt(a[1]);

		Assert.assertEquals(totalAmount, sum);
		System.out.println("Testpassed");

	}

}
