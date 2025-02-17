package seleniumConcepts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//This package is mandatory to access By.tag
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class RelativeLocators {

	// Introduced since selenium 4.0
	
//1) above()-> Element located above with respect to the specified element
//2) above()-> Element located below with respect to the specified element
//3) toLeftOf()-> Element located to the left of specified element
//4) toRightOf()-> Element located to the Right of specified element
	
//	syntx: driver.findElement(withTagName("XX").above(WebElement)) 
	// it only works with tagName

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		
		//toLeftof
		WebElement left = driver.findElement(By.xpath("//input[@id='secondpassword']"));		
		String text = driver.findElement(with(By.tagName("label")).toLeftOf(left)).getText();
		System.out.println(text);
		
	
		WebElement right = driver.findElement(By.xpath("//input[@ng-model='FirstName']"));
		String text2 = driver.findElement(with(By.tagName("label")).toLeftOf(right)).getText();
		System.out.println(text2);
		
		//belowof
		WebElement below = driver.findElement(By.xpath("//input[@id='firstpassword']"));
		 driver.findElement(with(By.tagName("input")).below(below)).sendKeys("Hello");
		
		
		
		 WebElement checkboxRightSide = driver.findElement(By.xpath("//input[@name='radiooptions'] [@value='Male']"));
		 driver.findElement(with(By.tagName("label")).toRightOf(checkboxRightSide)).click();
		 
		 
		 
		 
		
	

	}

}
