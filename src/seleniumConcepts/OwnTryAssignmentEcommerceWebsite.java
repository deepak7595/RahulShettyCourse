package seleniumConcepts;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OwnTryAssignmentEcommerceWebsite {

	public static void AddItem(WebDriver driver, String[] items ) {	

		List<String> products = Arrays.asList(items);
		List<WebElement> listItems = driver.findElements(By.xpath("//h4[@class='product-name']"));
		for (int i = 0; i < listItems.size(); i++) {
			String text = listItems.get(i).getText();
			String [] formatted = text.split("-");
			String ExpectedValue = formatted[0].trim();
			System.out.println(ExpectedValue);

			if (products.contains(ExpectedValue)) {
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

			}

		}

	}	
	//we use length() method to get size of Array
	//we use size() method to get size of ArrayList

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		String[] items = {"Tomato", "Beans", "Capsicum"};
		//Created one method, we wrapped all lines of code in that method. From here, we call them.
		AddItem(driver, items);


	}


}
