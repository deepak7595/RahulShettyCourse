package seleniumConcepts;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvokeMultipleWindows_Tabs {
	
	//invoking multiple windows/Tabs from selenium using one driver instance 
	//introduced selenium 4.0

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		
		// This is how, we navigate to one url from another during the execution.
//		driver.get("https://demo.automationtesting.in/Register.html");
//		driver.navigate().to("https://bugbug.io/blog/testing-frameworks/selenium-xpath/");
//		driver.navigate().back();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		// this line, opens new blank tab in browser. But control still in the parent. We need to get id, and switch the tab.
		driver.switchTo().newWindow(WindowType.TAB);
		
		//This line helps us to open new windows.
		//driver.switchTo().newWindow(WindowType.WINDOW);
		
		Set<String> windowHandles = driver.getWindowHandles();
		Iterator<String> it = windowHandles.iterator();
		String parent = it.next();
		String child = it.next();
		
		driver.switchTo().window(child);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		// here we open the new tab and change the control, and then we hit the url.
		
		driver.switchTo().window(parent);

	}

}
