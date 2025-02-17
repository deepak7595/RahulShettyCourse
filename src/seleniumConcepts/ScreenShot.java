package seleniumConcepts;

import java.io.File;
import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;


public class ScreenShot {
	
	//adding External jars -> select project-> right click-> preference -> build path-> library ->add external jars -> apply

	public static void main(String[] args) throws IOException  {
		WebDriver driver = new ChromeDriver();
		driver.get("https://expired.badssl.com/");
		driver.manage().window().maximize();
		
		TakesScreenshot tk = (TakesScreenshot)driver;
		File src = tk.getScreenshotAs(OutputType.FILE);
//		try {
//			//use "D directory", dont use c drive
//			FileUtils.copyFile(src, new File("D:\\My Software\\AutomationScreenshot//Sample.png"));
//		} catch (Exception e) {
//			System.out.println(e);
		
		
		//we can handle through FIlehandler too
		org.openqa.selenium.io.FileHandler.copy(src, new File("D:\\My Software\\AutomationScreenshot//Sample.png"));
		
		
		//from Rahulshetty
		//File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

	}

}
