package seleniumDemo;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumdemo {
	public static void main(String[]args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https.//www.selenium.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   WebElement search=driver.findElement(By.name("search"));
	   search.sendKeys("java".Keys.ENTER);
	   driver.navigate().back();

}
