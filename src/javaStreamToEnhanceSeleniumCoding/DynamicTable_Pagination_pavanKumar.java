package javaStreamToEnhanceSeleniumCoding;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTable_Pagination_pavanKumar {

	// Prerequsite -> we should find the counts and rows and columns first.
	// To get all the data from Table-> use nested for loop and one single line, we
	// can dynamically pass the row and column counts (single line enough)
	// if conditional base, use one for loop along with if condition. if condition
	// meets, use another lines of code, to get the data from the expected column (2
	// lines required)

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

		// To handle dynamic data.
		// 1-> To get how many pages we have, 2-> Navigate to next page , 3-> read data
		// from each pages.

		// 1-> finding the page count
		//// a[@aria-label='Next']/parent::li/preceding-sibling::li//span[text()='4']
		int size = driver.findElements(By.xpath("//ul//li")).size();
		int pageCount = size - 2;
		System.out.println(pageCount);

		// 2-> finding rows and column counts
		int rows = driver.findElements(By.xpath("//table[@class='table table-bordered']//tbody//tr")).size();
		int column = driver.findElements(By.xpath("//table[@class='table table-bordered']//tr//th")).size();
		System.out.println(rows);
		System.out.println(column);

		// 3-> with one common xpath, we iterating the table pages, by using the count
		// of it
		for (int p = 0; p <= 4; p++) {
			if (p > 1) {
				WebElement element = driver.findElement(By.xpath("//li/a/span[text()='" + p + "']"));
				element.click();
				Thread.sleep(2000);

			}
			// 4-> Getting the values from required column by iterating the rows.
			for (int i = 1; i < rows; i++) {
				String VegName = driver
						.findElement(By.xpath("//table[@class='table table-bordered']//tr[" + i + "]//td[1]"))
						.getText();
				System.out.println(VegName);
				String priceOfVeg = driver
						.findElement(By.xpath("//table[@class='table table-bordered']//tr[" + i + "]//td[2]"))
						.getText();
				System.out.println(priceOfVeg);

			}

		}

	}

}
