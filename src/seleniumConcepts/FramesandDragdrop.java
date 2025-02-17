package seleniumConcepts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FramesandDragdrop {
	//mentor@rahulshettyacademy.com => send resume to this mail ID for JOB
	
	//3 ways we have to handle Frames.
	// 1) ID
	// 2) Index
	// 3) WebElements
	

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://jqueryui.com/droppable/");
		int countofframes = driver.findElements(By.tagName("iframe")).size();
		System.out.println(countofframes);
		
		//By using WebElement
		//driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
		
		//By using Index
		// here we have only one frame, so we give index as "0"
		driver.switchTo().frame(0);
		
		WebElement Source = driver.findElement(By.id("draggable"));
		WebElement Target = driver.findElement(By.id("droppable"));
		Actions a = new Actions(driver);
		
		// build().perform() => is mandatory whenever we use Actions class
		a.dragAndDrop(Source, Target).build().perform();
		
		
		// To switch back from frame, we should use, "DefaultContent"
		driver.switchTo().defaultContent();
		String text = driver.findElement(By.xpath("//a[text()='Accept']")).getText();
		System.out.println(text);
		driver.close();
	}

}
