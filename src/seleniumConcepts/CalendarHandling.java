package seleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.xpath("//div[@data-testid='departure-date-dropdown-label-test-id']"
				+ "/descendant::div[@class='css-76zvg2 css-bfa6kz r-homxoj r-ubezar']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(
				"div.css-1dbjc4n.r-1awozwy.r-19m6qjp.r-156aje7.r-y47klf.r-1phboty.r-1d6rzhh.r-1pi2tsx.r-1777fci.r-13qz1uu"))
				.click();
		String text = driver.findElement(By.xpath("//div[@data-testid='departure-date-dropdown-label-test-id']"
				+ "/descendant::div[@class='css-76zvg2 css-bfa6kz r-homxoj r-ubezar']")).getText();
		System.out.println(text);

		// getAttribute method is depricated. So use, getDOMAttribute instead.

	}

}
