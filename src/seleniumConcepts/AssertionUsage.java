package seleniumConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AssertionUsage {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demo.automationtesting.in/Register.html");
		
		//Here, we check the check box is selected by using Assertions. Expecting False, if false comes, then the step will be passed.
		Assert.assertFalse(driver.findElement(By.xpath("//input[@type='checkbox']")).isSelected());
		
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		
		//Here, we check the check box is selected by using Assertions. Expecting True
		Assert.assertTrue(driver.findElement(By.xpath("//input[@type='checkbox']")).isSelected());
		//Using Assertion
		//Assert.assertEquals("Actual what webelemet gives", "Expected value")
		
		driver.close();
		
		
		
		
		
		
		
		

	}

}
