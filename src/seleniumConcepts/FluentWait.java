package seleniumConcepts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

public class FluentWait {
	// Fluent wait finds the web element repeatedly at regular intervals of time until the timeout or till the object gets found.
			// Based on the polling, it will check the dom periodically.. wheareas WedriverDriver checks the dom continously.
			
			// 90% of people, use webdriver wait. Fluent wait is exceptional case. 
			
			// disadvantage -> it requires, lot of codes, which makes the script messy.
			
			
	// WebDriverWait and FluentWait are classes, implemeneted wait interface 
	public class FluentWaitExample {
	    public static void main(String[] args) {
	        WebDriver driver = new ChromeDriver();
	        driver.get("http://example.com");

	        Wait<WebDriver> wait = new FluentWait<>(driver)
	                .withTimeout(Duration.ofSeconds(30))
	                .pollingEvery(Duration.ofSeconds(5))
	                .ignoring(NoSuchElementException.class);

	        WebElement element = wait.until(new Function<WebDriver, WebElement>() {
	            public WebElement apply(WebDriver driver) {
	                return driver.findElement(By.id("elementId"));
	            }
	        });

	        // Perform actions with the element
	        element.click();
	        
	        driver.quit();
		
		
	    }
	}

}
