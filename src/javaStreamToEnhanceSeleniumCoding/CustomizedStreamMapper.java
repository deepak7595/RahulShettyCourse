package javaStreamToEnhanceSeleniumCoding;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomizedStreamMapper {

	// get the Beans price from the webTable

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));



		//getPrice is our custom method
		//we filter the productname by using filter, and map we use custom function
		List<WebElement> elementsList = driver.findElements(By.xpath("//tr/td[1]"));

		List<String> price = elementsList.stream().filter(s -> s.getText().contains("Beans"))
				.map(s -> getPriceVeggie(s)).collect(Collectors.toList());


		price.forEach(a -> System.out.println(a));
	}

	private static String getPriceVeggie(WebElement s) {

		// TODO Auto-generated method stub

		String pricevalue = s.findElement(By.xpath("//tr/td[1]/following-sibling::td[1]")).getText();

		return pricevalue;

	}

}
