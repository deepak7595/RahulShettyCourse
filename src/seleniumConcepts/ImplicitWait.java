package seleniumConcepts;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ImplicitWait {
	
	//ImplicitWait
	//driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	
	// We Target specific Elements, and that specified wait is only applicable for that element. 
			//Not for all the elements as like Implicit wait. 
			
			
			// In real time, we have to use both the combination of implicit & Explicit waits in our scripts.
			//bcz both waits handles, different scenario's
			
			
			
			// Thread.sleep is part of Java.
			// this will wait till the specified the time gets end, though the element is present before the specified time.
			
			// Two type of explict wait we  have
				// Webdriverwait
				// FluentWait
			
	
	
	//Common Template for WebDriverWait
	// WebDriverWait refName = new WebDriverWait(Webdriver reference, Seconds)
	//refName.until(ExpectedConditions.)
	
	//Since Selenium 4, the Above syntax is deprecated.
	
	//use the below syntax
	//WebDriverWait a = new WebDriverWait(driver, Duration.ofSeconds(10));
	//refName.until(ExpectedConditions.)
	
	

	public static void AddItem(WebDriver driver, String[] items) {	

		List<String> products = Arrays.asList(items);
		List<WebElement> listItems = driver.findElements(By.xpath("//h4[@class='product-name']"));
		for (int i = 0; i < listItems.size(); i++) {
			String text = listItems.get(i).getText();
			String [] formatted = text.split("-");
			String ExpectedValue = formatted[0].trim();
			System.out.println(ExpectedValue);

			if (products.contains(ExpectedValue)) {
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

			}

		}
		driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		WebDriverWait a = new WebDriverWait(driver, Duration.ofSeconds(10));
		a.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='promoCode']")));
		
		driver.findElement(By.className("promoCode")).sendKeys("Deepak");
		

	}	
	//we use length() method to get size of Array
	//we use size() method to get size of ArrayList

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		String[] items = {"Tomato", "Beans", "Capsicum"};
		//Created one method, we wrapped all lines of code in that method. From here, we call them.
		//Calling The Method
		AddItem(driver, items);
		
		
		

	}

}
