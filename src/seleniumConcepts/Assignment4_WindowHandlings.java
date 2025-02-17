package seleniumConcepts;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Assignment4_WindowHandlings {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//a[text()='Multiple Windows']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Click Here']"))).click();
		
		Set<String> AllWindow = driver.getWindowHandles();
		Iterator<String> it = AllWindow.iterator();
		String parentWindow = it.next();
		String childWindow = it.next();
		driver.switchTo().window(childWindow);
		String childText = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[text()='New Window']"))).getText();
		System.out.println(childText + " from child");
		driver.switchTo().window(parentWindow);
		String parentText = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[text()='Opening a new window']"))).getText();
		System.out.println(parentText + " from parent");
		
		System.out.println("Program ends !!");
		
		driver.quit();
		
		
		
		

	}

}
