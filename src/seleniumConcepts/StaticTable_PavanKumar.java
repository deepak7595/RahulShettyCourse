package seleniumConcepts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTable_PavanKumar {
	
	//Get the price from the table and do summation.
	
	//blazedemo.com for assignment

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		int Total = 0;
		List<WebElement> list = driver.findElements(By.xpath("//table[@name='BookTable']//tr//td[4]"));
		for (int i = 0; i < list.size(); i++) {
			WebElement value = list.get(i);
			String text = value.getText();
			int a = Integer.parseInt(text);
			Total = Total + a;
					
		}
		System.out.println(Total);

	}

}
