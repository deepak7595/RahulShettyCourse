package seleniumConcepts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5iFrames {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		//	driver.manage().window().maximize();
		//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//	driver.get("https://the-internet.herokuapp.com/nested_frames");
		//	int size = driver.findElements(By.tagName("frame")).size();
		//	System.out.println(size);
		//	driver.switchTo().frame(0);
		//	int size2 = driver.findElements(By.tagName("frame")).size();
		//	System.out.println(size2);
		//	driver.switchTo().frame(1);
		//	String text = driver.findElement(By.id("content")).getText();
		//	System.out.println(text);	





		// TODO Auto-generated method stub







//RahulShetty's Answer

		driver.get("http://the-internet.herokuapp.com/");



		driver.findElement(By.linkText("Nested Frames")).click();



		driver.switchTo().frame("frame-top");



		driver.switchTo().frame("frame-middle");



		System.out.println(driver.findElement(By.id("content")).getText());
		
		
	



	}

}


