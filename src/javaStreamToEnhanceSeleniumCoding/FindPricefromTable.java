package javaStreamToEnhanceSeleniumCoding;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class FindPricefromTable {

	public static void main(String[] args) {
		// Initialize WebDriver
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");  // Replace with actual page URL

        // Define the product to search for
        String productName = "Beans";

        // Locate the table
        WebElement table = driver.findElement(By.xpath("//table[@class='table table-bordered']"));

        // Get all rows (excluding headers)
        List<WebElement> rows = table.findElements(By.tagName("tr"));

        // Loop through rows to find the matching product
        for (WebElement row : rows) {
            List<WebElement> columns = row.findElements(By.tagName("td"));

            // Ensure row has data and check the first column for the product name
            if (columns.size() > 0 && columns.get(0).getText().equalsIgnoreCase(productName)) {
                // Fetch price from the third column
                String price = columns.get(2).getText();
                System.out.println("Price of " + productName + ": " + price);
                break; // Exit loop once found
            }
        }

        // Close browser
        driver.quit();

	}

}
