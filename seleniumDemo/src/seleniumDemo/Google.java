package seleniumDemo;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.sun.glass.events.KeyEvent;

public class Google {


	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement( By.name("q")).sendKeys("java");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@contains(.,'java')]")).click();
		WebElement t=driver.findElement(By.xpath("//span[contains(text(),'Java')]"));
		Actions a=new Actions(driver);
	     a.doubleClick(t).build().perform();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_T);
		
		
		
	


	}
}
