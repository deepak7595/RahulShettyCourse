package seleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
public class Assigment8_RahulShettyUsingKeyboardAction {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

	    driver.get("http://qaclickacademy.com/practice.php");

	    driver.findElement(By.id("autocomplete")).sendKeys("ind");

	    Thread.sleep(2000);

	    driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);

	    driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN, Keys.ENTER);

	   System.out.println(driver.findElement(By.id("autocomplete")).getDomAttribute("value")); 

	       

	}

}
