package seleniumConcepts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_staticWebTable {

	// To print all values from the table
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();

		int rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		int cols = driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		for (int r = 2; r <= rows; r++) {
			for (int c = 1; c <= cols; c++) {
				String value = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + r + "]//td[" + c + "]"))
						.getText();
				System.out.print(value + "\t");
			}
			System.out.println();
		}

		// To print book based on the author
		for (int r = 2; r <= rows; r++) {
			String authorName = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + r + "]//td[2]"))
					.getText();

			if (authorName.equals("Mukesh")) {
				String bookName = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + r + "]//td[1]"))
						.getText();
				System.out.println(bookName + "\t" + authorName);
			}

		}

	}

}
