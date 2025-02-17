package seleniumConcepts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarHandling1 {

	
	// we can pass our variables in locators. for example
	// driver.findElement(By.xpath("//abbr[text()='"+year+"']")).click();
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		String month = "May";
		String date = "3";
		String year = "2023";	
		
		//{Important
		// we can pass our variables in locators. for example
		
		// driver.findElement(By.xpath("//abbr[text()='"+year+"']")).click();}

		//if we have lengthy classname, pick any one piece of it.. dont use full class name.
		driver.findElement(By.xpath("//button[@class='react-date-picker__calendar-button react-date-picker__button']")).click();

		driver.findElement(By.xpath("//button[@class='react-calendar__navigation__label']")).click();
		driver.findElement(By.xpath("//button[@class='react-calendar__navigation__label']")).click();

		List<WebElement> calendaryear = driver.findElements(By.xpath("//button[@class='react-calendar__tile react-calendar__decade-view__years__year']"));
		for (WebElement x : calendaryear) {
			String text = x.getText();
			if (text.contains(year)) {
				x.click();
				break;
			}


		}


		//driver.findElement(By.className("react-calendar__navigation__label")).click();
		List<WebElement> calendar = driver.findElements(By.xpath("//div[@class='react-calendar__year-view']/div/button//abbr"));
		for (WebElement x : calendar) {
			String text = x.getText();
			if (text.contains(month)) {
				x.click();
				break;	
			}


		}
		driver.findElement(By.xpath("//button[@class='react-calendar__tile react-calendar__month-view__days__day']//abbr[text()='5']")).click();


	}

}
