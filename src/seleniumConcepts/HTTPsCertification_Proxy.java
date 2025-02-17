package seleniumConcepts;

import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HTTPsCertification_Proxy {
	
	//gothrough the link below, to explore more capabilities
			//https://developer.chrome.com/docs/chromedriver/capabilities

	public static void main(String[] args) {
		//if we run, without setting this chromeBrowser option, then our testcases will failed, due to expired certification.
		//To avoid that kind of scenario, we have to add, these below two lines.
		// For other browsers, we have FirefoxOptions, EdgeOptions, SafariOptions
		
		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		
		//To handle Proxy, we have separate class 
		Proxy proxy = new Proxy();
		proxy.setHttpProxy("");
		options.setCapability("proxy", proxy);
		//we have to get the connnection string from team member.
		// And also we can add extensions, through runtime.
		
		
		
		//we can block pop ups through below lines of code.
		
		options.setExperimentalOption("excludeSwitches",
		     Arrays.asList("disable-popup-blocking"));
		
		//we need to tell the driver, through the arugument
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://expired.badssl.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		System.out.println(driver.getTitle());

	}

}
