package seleniumConcepts;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class KeyBoardActions {

	
		public static void main(String[] args) {
			// Set up WebDriver
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();

			// Open a website with an input field
			driver.get("https://www.google.com");

			// Locate the search input field
			WebElement searchBox = driver.findElement(By.name("q"));

			// Create Actions instance
			Actions actions = new Actions(driver);

			// Type text in uppercase using SHIFT key
			actions.keyDown(Keys.SHIFT)
			.sendKeys(searchBox, "selenium automation")
			.keyUp(Keys.SHIFT)
			.perform();

			// Press ENTER to search
			actions.sendKeys(Keys.ENTER).perform();

			// Close the browser
			driver.quit();

		}}
