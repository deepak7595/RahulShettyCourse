package seleniumConcepts;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment3_WaitConcept {

	public static void main(String[] args) throws InterruptedException {
		String userName = "rahulshettyacademy";
		String passWord = "learning";
		String dropdownOption = "Consultant";

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.id("username")).sendKeys(userName);
		driver.findElement(By.id("password")).sendKeys(passWord);
		driver.findElement(By.xpath("(//span[@class='checkmark'])[2]")).click();

		//Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='cancelBtn']")).click();

		WebElement dropdown = driver.findElement(By.xpath("//select[@class='form-control']"));

		Select sel = new Select(dropdown);
		sel.selectByVisibleText(dropdownOption);

		driver.findElement(By.id("terms")).click();
		driver.findElement(By.name("signin")).click();
		int count = 0;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='ProtoCommerce Home']")));

		List<WebElement> AddToCart = driver.findElements(By.xpath("//button[@class='btn btn-info']"));
		for (int i = 0; i < AddToCart.size(); i++) {
			AddToCart.get(i).click();

			count = AddToCart.size();

		}
		System.out.println(count);
		
	}

}
