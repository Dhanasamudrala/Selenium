package seleniumDemo;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.glass.events.KeyEvent;

public class Robo {
	 public static void main(String[] args) throws InterruptedException, AWTException {
			System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
		    Thread.sleep(2000);
		    Robot r=new Robot();
		    r.keyPress(KeyEvent.VK_CONTROL);;
		    r.keyPress(KeyEvent.VK_T);
		    r.keyRelease(KeyEvent.VK_CONTROL);
		    r.keyPress(KeyEvent.VK_T);
	 }
}
