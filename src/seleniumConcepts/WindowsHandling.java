package seleniumConcepts;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.xpath("//a[@class='blinkingText']")).click();
		Set<String> ParentWindow = driver.getWindowHandles();
		
//		Set<String> windowHandles = driver.getWindowHandles();
//		System.out.println(windowHandles);
//		
		// Three ways we have
		//String URL
		//String Title
		//String windows Id
		
		//1) Handling window by using String URL
//		for (String X : ParentWindow) {
//			if (!ParentWindow.equals(X)) {
//				driver.switchTo().window(X);
//				String text = driver.findElement(By.cssSelector("p.im-para.red")).getText();
//				System.out.println(text);
//			}			
//		}
		
		//2) Handling windows by using list
//		List<String> list = new ArrayList<String>();
//		list.addAll(ParentWindow);
//		driver.switchTo().window(list.get(1));
//		String text = driver.findElement(By.cssSelector("p.im-para.red")).getText();
//		System.out.println(text);
		
		
		//3) Handling windows by using count
//		int count = 0;
//		for (String x : ParentWindow) {
//			if (count==1) {
//				driver.switchTo().window(x);
//				String text = driver.findElement(By.cssSelector("p.im-para.red")).getText();
//				System.out.println(text);
//			}
//			count++;
//			
//		}
		
		
		//From Rahul Shetty
		Iterator<String> it = ParentWindow.iterator();
		String parentId = it.next();
		String childId = it.next();
		driver.switchTo().window(childId);
		String text = driver.findElement(By.cssSelector("p.im-para.red")).getText();
		System.out.println(text);
	}

}
