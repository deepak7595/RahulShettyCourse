package seleniumConcepts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {
	//It's used to performing mouse and keyboard interactions 
	// -> ContectClick
	//	-> doubleClick
	//	-> Drag and drop
	
	//build().perform() -> is mandatory for Actionsclass. if these two is missing, then script wont work.
	

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");

		WebElement element = driver.findElement(By.xpath("//a[@title='Login'] [@class='_1TOQfO']"));
		Actions a = new Actions(driver);
		
		a.moveToElement(element).build().perform();
		
		WebElement element2 = driver.findElement(By.xpath("//input[@name='q']"));
		element2.click();
		
		a.keyDown(Keys.SHIFT).sendKeys("Deepak").keyUp(Keys.SHIFT).doubleClick().build().perform();
		
		
		
		
		
		
		//driver.close();

	}

}
