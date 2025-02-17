package seleniumConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCheckBox {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demo.automationtesting.in/Register.html");

		// We get count of the checkbox exists in webpage.
		List<WebElement> count = driver.findElements(By.xpath("//input[@type='checkbox']"));
		int size = count.size();
		System.out.println(size);

		// To check all the exiting check boxes through ForEach Loop
//		for (WebElement x : count) {
//			if(!x.isSelected()) {
//				x.click();
//			}			
//		}

		// To check all the exiting check boxes through for Loop
		for (int i = 0; i < count.size(); i++) {
			WebElement webElement = count.get(i);
			if (!webElement.isSelected()) {
				webElement.click();
			}

		}

	}

}
