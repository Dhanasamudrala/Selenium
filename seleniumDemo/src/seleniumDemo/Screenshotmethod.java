package seleniumDemo;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshotmethod {
	public static void takescreens(string name,Webdriver driver).throws.ioexception{
		TakesScreenshot ts=(TakesScreenshot)(driver);
		File screenshot=ts.getScreenshotAs(OutputType.FILE);
		File screenshotSave=new File("./screenshot/Demo.png");
		
	}
	 
}
