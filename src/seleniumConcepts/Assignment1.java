package seleniumConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assignment1 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		// verify check box is check and unchecked successfully
		Assert.assertFalse(driver.findElement(By.id("checkBoxOption1")).isSelected());

		driver.findElement(By.id("checkBoxOption1")).click();

		// to get count of the checkbox present
		Assert.assertTrue(driver.findElement(By.id("checkBoxOption1")).isSelected());
		List<WebElement> count = driver.findElements(By.xpath("//input[@type='checkbox']"));
		int size = count.size();
		System.out.println(size);
		driver.close();
	}

}
