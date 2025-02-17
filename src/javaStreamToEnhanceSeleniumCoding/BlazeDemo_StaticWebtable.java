package javaStreamToEnhanceSeleniumCoding;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlazeDemo_StaticWebtable {

	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.blazedemo.com/reserve.php");
		driver.manage().window().maximize();

		int rows = driver.findElements(By.xpath("//table[@class='table']//tr")).size();
		int column = driver.findElements(By.xpath("//table[@class='table']//th")).size();

		for (int i = 1; i < rows; i++) {


			for (int j = 1; j < column; j++) {
				String text2 = driver.findElement(By.xpath("//table[@class='table']//tr["+i+"]//td["+j+"]")).getText();

				System.out.println(text2);

			}

		}



//		for (int i = 1; i < rows; i++) {
//			String name= driver.findElement(By.xpath("//table[@class='table']//tr["+i+"]//td[3]")).getText();
//
//			if (name.equals("Virgin America")) {
//				
//				String text = driver.findElement(By.xpath("//table[@class='table']//tr["+i+"]//td[4]")).getText();
//				System.out.println(text);
//
//			}





		}

	

}
