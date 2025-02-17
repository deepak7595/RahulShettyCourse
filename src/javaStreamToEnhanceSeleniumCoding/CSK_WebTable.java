package javaStreamToEnhanceSeleniumCoding;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSK_WebTable {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().window().maximize();

		int rows = driver.findElements(By.xpath("//table[@class='table table-bordered']//tr")).size();
		int columns = driver.findElements(By.xpath("//table[@class='table table-bordered']//th")).size();

		//To get all data from the table
		// values starts from first column, so we should set r values as 1. 

//		for (int r = 1; r <= rows; r++) {
//			
//
//			for (int c = 1; c <= columns; c++) {
//				String text = driver.findElement(By.xpath("//table[@class='table table-bordered']//tr["+r+"]//td["+c+"]")).getText();
//				
//				System.out.println(text);
//
//			}
//			System.out.println();
//		}
		
		//to get price of Rice
		
		for (int r = 1; r <=rows ; r++) {
			String text = driver.findElement(By.xpath("//table[@class='table table-bordered']//tr["+r+"]//td[1]")).getText();
			if (text.equals("Rice")) {
				
			String	 text2 = driver.findElement(By.xpath("//table[@class='table table-bordered']//tr["+r+"]//td[2]")).getText();
				 System.out.println(text2);
				
			}
			
			
		}


	}

}
