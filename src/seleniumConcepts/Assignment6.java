package seleniumConcepts;

import java.time.Duration;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment6 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.xpath("//label[@for='benz']//child::input")).click();
		WebElement element = driver.findElement(By.xpath("//label[@for='benz']//child::input"));		
		String capturedValue = element.getDomAttribute("value");
		//getAttribute is deprecated
		System.out.println(capturedValue);
		WebElement select = driver.findElement(By.id("dropdown-class-example"));
		select.click();
		
		Select sel = new Select(select);
		//sel.selectByVisibleText(capturedValue);
		
		sel.selectByValue(capturedValue);
		
		driver.findElement(By.id("name")).sendKeys(capturedValue);
		driver.findElement(By.id("alertbtn")).click();
		
		Alert a =driver.switchTo().alert();
		String text = a.getText();
		a.accept();
		System.out.println(text);
		
		if (text.contains(capturedValue)) {
			System.out.println("testcase passed");
			
		}else {
		System.out.println("Testcase failed");
		}
		

	}

}
