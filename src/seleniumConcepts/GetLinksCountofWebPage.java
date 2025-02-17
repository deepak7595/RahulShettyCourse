package seleniumConcepts;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class GetLinksCountofWebPage {

	//Here we iterate from one section to another to get the links. 

	public static void main(String[] args) throws InterruptedException {

		// links should have the tag as "a"
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		int overAllCount = driver.findElements(By.tagName("a")).size();
		System.out.println(overAllCount + " all the links present in webpage");


		// Here, we created subDriver for footer section, and getting the count, only from footer. 
		//This is called limiting webDriver scope, for particular part in web page.
		WebElement FooterlinksCount = driver.findElement(By.id("gf-BIG"));
		int element2 = FooterlinksCount.findElements(By.tagName("a")).size();
		System.out.println(element2 + " only links present in footer section" );
		//		
		//		//get the count of links from first column from the footer

		WebElement columnlinkscount = FooterlinksCount.findElement(By.xpath("//table/tbody/tr/td/ul[1]"));
		int columncount = columnlinkscount.findElements(By.tagName("a")).size();
		System.out.println(columncount + " only links present from the first column in the footer" );


		//perform click on the options, that tabs should be opened in new windows.

		for (int i =1; i < columnlinkscount.findElements(By.tagName("a")).size(); i++) {

			//to open the links in new tab, use below line
			String clickonlink = Keys.chord(Keys.CONTROL, Keys.ENTER);
			//since, its keyboard action, we have to pass it in sendkeys
			columnlinkscount.findElements(By.tagName("a")).get(i).sendKeys(clickonlink);	

		}
		// we get the Title of the url's, by using windows handling concept.

		//		Set<String> allWindow = driver.getWindowHandles();
		//		for (String x : allWindow) {
		//			driver.switchTo().window(x);
		//			
		//			String title = driver.getTitle();
		//			System.out.println(title);
		//			
		//		}

		//from RahulShetty
		Set<String> windowHandles = driver.getWindowHandles();
		Iterator<String> it = windowHandles.iterator();

		while (it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());

		}

		//difference btwn hasNext() and Next()
		//hasNext only tell, whether next window is present or not.
		//Next helps us to move from one to another window


	}

}
