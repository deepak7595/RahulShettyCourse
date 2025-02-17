package seleniumConcepts;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LaunchBrowser {

	public static void main(String[] args) {

		String name = "deepak";

		// System.setProperty("Webdriver.chrome.driver",
		// "C:\\Users\\DeepakVaithylingam\\Downloads\\chromedriver-win64\\chromedriver-win64.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");

		driver.findElement(By.linkText("Forgot your password?")).click();
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			System.out.println(e);
		}
		// driver.findElement(By.id("inputUsername")).click();
		driver.findElement(By.xpath("//button[@class='reset-pwd-btn']")).click();
		String s = driver.findElement(By.cssSelector("p[class='infoMsg']")).getText();
		System.out.println(s);
		driver.findElement(By.cssSelector("button.go-to-login-btn")).click();
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			System.out.println(e);
		}

		driver.findElement(By.cssSelector("input#inputUsername")).sendKeys(name);
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("rahulshettyacademy");
		// driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			System.out.println(e);
		}
		// String name = driver.findElement(By.className("error")).getText();
		// Assert.assertEquals(name, "* Incorrect username or password");
		//
		// driver.findElement(By.cssSelector("input#inputUsername")).sendKeys("Rahul");
		// driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("rahulshettyacademy");
		String text = driver.findElement(By.xpath("//h2[contains(text(), 'Hello')]")).getText();
		Assert.assertEquals(text, "Hello " + name + ",");
		driver.close();

	}

}
