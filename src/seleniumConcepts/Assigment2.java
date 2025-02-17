package seleniumConcepts;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.openqa.selenium.support.ui.Select;

public class Assigment2 {

	static String name = "Deepak";
	static String email = "johndeepak444@gmail.com";
	static String password = "1234";
	static String gender = "Male";
	static String dob = "7/51995";

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");

		driver.findElement(By.name("name")).sendKeys(name);
		driver.findElement(By.name("email")).sendKeys(email);
		driver.findElement(By.id("exampleInputPassword1")).sendKeys(password);
		driver.findElement(By.id("exampleCheck1")).click();
		WebElement element = driver.findElement(By.id("exampleFormControlSelect1"));
		Select sel = new Select(element); // select class
		sel.selectByVisibleText(gender);
		driver.findElement(By.id("inlineRadio1")).click();
		driver.findElement(By.name("bday")).sendKeys(dob);
		driver.findElement(By.cssSelector("input.btn.btn-success")).click();
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.cssSelector(".alert-success")).getText());
//		String Text = driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText();
//		Assert.assertEquals(Text, "×\r\n"
//				+ "Success! The Form has been submitted successfully!.");
//		

		driver.close();

	}

}
