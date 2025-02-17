package seleniumConcepts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
	//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\DeepakVaithylingam\\Downloads\\chromedriver-win64\\chromedriver-win64");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demo.automationtesting.in/Alerts.html");
//		driver.findElement(By.id("name")).sendKeys("deepak");
//		driver.findElement(By.id("alertbtn")).click();
		
		driver.findElement(By.xpath("(//a[@class='analystic'])[3]")).click();
		driver.findElement(By.className("btn btn-info")).click();
		
		Alert a = driver.switchTo().alert();
//		Thread.sleep(2000);
//		a.accept();
//		driver.findElement(By.id("name")).sendKeys("deepak");
//		driver.findElement(By.id("confirmbtn")).click();
//		Thread.sleep(2000);
//		String text = a.getText();
//		System.out.println(text);
//		a.dismiss();
		a.sendKeys("Deepak");
		String text = a.getText();
		System.out.println(text);
		a.accept();
		
		driver.close();

	}

}
