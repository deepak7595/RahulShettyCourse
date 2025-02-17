package seleniumConcepts;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.time.Duration;
import java.util.List;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class BrokenLinks {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		
//		int count=0;
//		List<WebElement> elements = driver.findElements(By.xpath("//*[@class='gf-li']/a"));
//		for (int i = 0; i < elements.size(); i++) {
//			@Nullable
//			String domAttribute = elements.get(i).getDomAttribute("href");
//			URL url = new URL(domAttribute);
//			URLConnection openConnection = url.openConnection();
//			HttpURLConnection conn = (HttpURLConnection)openConnection;
//			int responseCode = conn.getResponseCode();
//			if (responseCode !=200) {
//				System.out.println("Brokenlinks" + domAttribute);
//				count++;
//				
//			}
//		}
//		
//		
//		System.out.println("brokenlinkcount" + count);
		
		//collabrative code
		
//		List<WebElement> lists = driver.findElements(By.xpath("//*[@class='gf-li']/a"));
//		for (WebElement links : lists) {
//			@Nullable
//			String linksfromDOM = links.getDomAttribute("href");
//			URL url = new URL(linksfromDOM);
//			URLConnection openConnection = url.openConnection();
//			HttpURLConnection connection = (HttpURLConnection)openConnection;
//			int responseCode = connection.getResponseCode();
//			System.out.println(responseCode);
//			if (responseCode==400) {
//				System.out.println("The link is Broken, the name of the links is " + links.getText()+ "and the response code is "+responseCode);
//				Assert.assertTrue(false);			
//			}
//			
//		}
		
		
		
		//from RahulShetty
		List<WebElement> links = driver.findElements(By.xpath("//*[@class='gf-li']/a"));
		for (WebElement link : links) {
			
			@Nullable
			String url = link.getDomAttribute("href");
			HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int responseCode = conn.getResponseCode();
			System.out.println(responseCode);
			if (responseCode>400) {
				System.out.println("The link is Broken, the name of the links is " + link.getText()+ "and the response code is "+responseCode);
			Assert.assertTrue(false);
			}
			
		}




	}

}
