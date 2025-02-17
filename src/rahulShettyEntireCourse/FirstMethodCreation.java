package rahulShettyEntireCourse;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FirstMethodCreation {	
	// i'm setting the webDriver as static. we can also set this as argument of resetPassword method. 
	
	
	//Creating method for getResetPassword
	public static String resetPassword(WebDriver driver) {
		driver.findElement(By.linkText("Forgot your password?")).click();
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			System.out.println(e);
		}
		
		driver.findElement(By.xpath("//button[text()='Reset Login']")).click();
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			System.out.println(e);
		}
		String text = driver.findElement(By.className("infoMsg")).getText();
		String[] split = text.split("'");
		String password = split[1].split("'")[0];

		return password;

	}
	//Method should be created outside of the main method

	public static void main(String[] args) {

		//System.setProperty("webdriver.chrome.driver", "Path of the chrome"); => This line not required. Selenium added featured version 4.6.0. So selenium iteslf handle this things
		// this is third party . Now they handled with Selenium Manager. This will update our chrome driver versions by any updates released. 
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		String NewPassword = resetPassword(driver);
		driver.findElement(By.xpath("//button[text()='Go to Login']")).click();
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			System.out.println(e);
		}
		//driver.findElement(By.cssSelector("input#inputUsername")).sendKeys(name);
		driver.findElement(By.cssSelector("input#inputUsername")).sendKeys("Deepak");
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys(NewPassword);		
	}

}
