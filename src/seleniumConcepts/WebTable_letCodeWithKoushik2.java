package seleniumConcepts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable_letCodeWithKoushik2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");

//		WebElement table = driver.findElement(By.xpath("//table[@id='simpletable']"));
//		List<WebElement> allRows = table.findElements(By.xpath("//tbody/tr"));
//		for (int i = 0; i < allRows.size(); i++) {
//			WebElement rows = allRows.get(i);
//			List<WebElement> column = rows.findElements(By.tagName("td"));
//			for (int j = 0; j < column.size(); j++) {
//				WebElement col = column.get(1);
//				String text = col.getText();
//				
//
//			}

//		}
		
		driver.findElement(By.name("q")).sendKeys("Selenium");
		Thread.sleep(3000);
		List<WebElement> elements = driver.findElements(By.xpath("//ul[@role='listbox']//li"));
		for (int i = 0; i < elements.size(); i++) {
			WebElement webElement = elements.get(i);
			String text = webElement.getText();
			System.out.println(text);
			{
				try {
					if (text.equals("selenium download")) {
						elements.get(i).click();
						break;
				}} catch (Exception e) {
					System.out.println(e);
				}
				}
			}
			
		

	}

}
