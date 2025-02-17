package seleniumConcepts;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.*;

public class WebTable_letCodeWithKoushik {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.manage().window().maximize();
		driver.get("https://letcode.in/table");
		//one way
		//		List<WebElement> list = driver.findElements(By.xpath("//table[@id='simpletable']//th"));
		//		for (int i = 0; i < list.size(); i++) {
		//			String text = list.get(i).getText();
		//			System.out.println(text);
		//		}

		//another way.
		WebElement table = driver.findElement(By.xpath("//table[@id='simpletable']"));
		//to get headers
		System.out.println("@@@@@Table header@@@@@");
		List<WebElement> tableHeader = table.findElements(By.tagName("th"));
		for (int i = 0; i < tableHeader.size(); i++) {			
			System.out.println(tableHeader.get(i).getText());		
		}

		System.out.println(" ");
		System.out.println("@@@@data from all rows@@@@");
		//To get All rows data
		List<WebElement> allRows = table.findElements(By.xpath("//table[@id='simpletable']/tbody/tr"));
		for (int i = 0; i < allRows.size(); i++) {
			WebElement rows = allRows.get(i);
			System.out.println(rows.getText());
			
			
		}
		
		System.out.println(" ");
		System.out.println("@@@@data from first column@@@@");
		//To get value from first column	
		
//		for (WebElement row : allRows) {
//			List<WebElement> column = row.findElements(By.tagName("td"));
//			WebElement firstColumn = column.get(0);
//			System.out.println(firstColumn.getText());
//			
//		}
		for (int i = 0; i < allRows.size(); i++) {
			WebElement column = allRows.get(i);
			List<WebElement> firstColumn = column.findElements(By.tagName("td"));
			System.out.println(firstColumn.get(0).getText());
			
		}
				
		
		
		System.out.println(" ");
		System.out.println("@@@@data from all column@@@@");
		 //to get data from column
		List<WebElement> allcolumn = table.findElements(By.tagName("td"));
		for (int i = 0; i < allcolumn.size(); i++) {
			WebElement column = allcolumn.get(i);
			System.out.println(column.getText());
			
		}
		



		driver.close();

	}

}
