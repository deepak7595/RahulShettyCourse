package javaStreamToEnhanceSeleniumCoding;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class WebTableSorting_usingStream {

	public static void main(String[] args) {
		//sort the webtable and get the text, and compare the text with java stream sorted values.
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		
		
		driver.findElement(By.xpath("//table[@class='table table-bordered']//th[1]")).click();
		List<WebElement> items = driver.findElements(By.xpath("//table[@class='table table-bordered']//tr//td[1]"));
		
		//instead of iterate by using loop, we can use java stream
//		for (int i = 0; i < items.size(); i++) {
//		System.out.println( items.get(i).getText());			
//		}
		
		
		
		 List<String> fromApplication = items.stream().map(s->s.getText()).collect(Collectors.toList());
		 List<String> sortedThroughCode = fromApplication.stream().sorted().collect(Collectors.toList());
		 //comparing two lists by using asserts
		 Assert.assertTrue(fromApplication.equals(sortedThroughCode));
		 System.out.println("TestPassed");
		 driver.close();
		
	
	}

}
