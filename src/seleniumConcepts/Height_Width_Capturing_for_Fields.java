package seleniumConcepts;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Height_Width_Capturing_for_Fields {
	 static String name = "deepak";
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.get("https://demo.automationtesting.in/Register.html");
		
		driver.get("https://demo.automationtesting.in/Register.html");
		WebElement firstName = driver.findElement(By.xpath("//input[@ng-model='FirstName']"));
		
		//this will get the height and width of the element
		
		System.out.println(firstName.getRect().getDimension().getHeight());
		System.out.println(firstName.getRect().getDimension().getWidth());
		
		
		
	}

}
