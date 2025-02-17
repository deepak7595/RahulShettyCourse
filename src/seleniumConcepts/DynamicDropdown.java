package seleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='Delhi (DEL)']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[text()='AMD']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[text()='AYJ']")).click();

	}

}
