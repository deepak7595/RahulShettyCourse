package seleniumConcepts;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot_WebElements {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();

		String name = "deepak";

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.get("https://demo.automationtesting.in/Register.html");
		WebElement firstName = driver.findElement(By.xpath("//input[@ng-model='FirstName']"));
		firstName.sendKeys(name);
		//this will take the screenshot of the particular element
		File f = firstName.getScreenshotAs(OutputType.FILE);
		
		// Screenshot will be stored in Project. select-> right click -> refresh the project -> you will see the image under target folder 
		FileUtils.copyFile(f, new File("logo.png"));
		driver.close();		


	}

}

