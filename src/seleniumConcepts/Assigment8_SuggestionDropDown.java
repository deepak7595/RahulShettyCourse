package seleniumConcepts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assigment8_SuggestionDropDown {

	public static void main(String[] args) {
		String country = "India";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		WebElement inputfield = driver.findElement(By.cssSelector("input.ui-autocomplete-input"));
		inputfield.click();
		inputfield.sendKeys(country);
		List<WebElement> elements = driver.findElements(By.xpath("//ul[@id='ui-id-1']//li"));
		for (int i = 0; i < elements.size(); i++) {
			String text = elements.get(i).getText();
			System.out.println(text);
			
			if (text.equals(country)) {
				elements.get(i).click();
				break;

			}

		}
		System.out.println(driver.findElement(By.id("autocomplete")).getDomAttribute("value")); 
		

		
	}

}
