package seleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[text()='1 Adult']")).click();
		Thread.sleep(2000);
		
//		for (int i = 1; i < 4; i++) {
//			WebElement clk = driver.findElement(By.id("hrefIncAdt"));
//			clk.click();
//		}
		
		
		//Click 4 time, by using loop
		int i = 1; // initialization
		while (i<5) { // condition
			WebElement clk = driver.findElement(By.id("hrefIncAdt"));
			i++; //increment
		}	
		driver.findElement(By.id("btnclosepaxoption")).click();
		driver.close();
	}

}
