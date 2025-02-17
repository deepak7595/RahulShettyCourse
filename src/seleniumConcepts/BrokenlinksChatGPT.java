package seleniumConcepts;

import java.io.IOException;

import java.net.HttpURLConnection;

import java.net.MalformedURLException;

import java.net.URL;

import java.net.URLConnection;

import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;

import org.testng.asserts.SoftAssert;

public class BrokenlinksChatGPT {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/"); // Change to your target URL

		// Get all links on the page
		List<WebElement> links = driver.findElements(By.cssSelector("li[class='gf-li'] a"));

		System.out.println("Total links found: " + links.size());

		// Check each link
		for (WebElement link : links) {
			String url = link.getAttribute("href");

			if (url != null && !url.isEmpty()) {
				verifyLink(url);
			} else {
				System.out.println("Broken link found: Empty or null href");
			}
		}

		// Close the browser
		driver.quit();
		
		
		
	}
	public static void verifyLink(String url) {
        try {
            HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
            connection.setRequestMethod("HEAD");
            connection.connect();

            int responseCode = connection.getResponseCode();

            if (responseCode >= 400) {
                System.out.println("Broken Link: " + url + " -> Response Code: " + responseCode);
            } else {
                System.out.println("Valid Link: " + url + " -> Response Code: " + responseCode);
            }

            connection.disconnect();
        } catch (IOException e) {
            System.out.println("Error checking link: " + url + " -> " + e.getMessage());
        }
    }

}
