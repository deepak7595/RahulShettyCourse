package seleniumConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;

public class StaticDropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		// if select tag is present in dom Structure-> then it should be static drop
		// down.
		// we can tractable with "Select" Class

		// Tag with select drop down

		WebElement staticdropdown = driver.findElement(By.name("ctl00$mainContent$DropDownListCurrency")); // location
																											// of the
																											// drop down
																											// present
		Select sel = new Select(staticdropdown); // select class
		sel.selectByIndex(2); // select the value through index
		String selectedOne = sel.getFirstSelectedOption().getText(); // get the selected values by using getText method
		System.out.println(selectedOne);

		sel.selectByVisibleText("INR");

		sel.selectByValue("USD");

		driver.close();

	}

}
