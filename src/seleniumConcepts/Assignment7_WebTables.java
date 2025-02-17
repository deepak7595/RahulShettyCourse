package seleniumConcepts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7_WebTables {

	// From this, we learn, how to traverse the values from the table

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 500)");
		List<WebElement> rows = driver.findElements(By.xpath("//table[@name='courses']//tr"));
		int rowSize = rows.size();
		System.out.println(rowSize + " ROWSIZE");

		int columnSize = driver.findElements(By.xpath("//table[@name='courses']//tr[1]//th")).size();
		System.out.println(columnSize + " COLUMNSIZE");

		List<WebElement> gtTxt = driver.findElements(By.xpath("//table[@name='courses']//tr[2]//td"));
		for (int i = 0; i < gtTxt.size(); i++) {

			System.out.println(gtTxt.get(i).getText());
		}

	}

}
