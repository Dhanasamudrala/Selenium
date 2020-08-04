package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


		public class Demoexplicit {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.findElement( By.id("username")).sendKeys("admin");
	    driver.findElement( By.name("pwd")).sendKeys("manager",Keys.ENTER);
	    WebElement logout=driver.findElement(By.id("logoutlink"));
	    WebDriverWait wait=new WebDriverWait(driver,10);
	    wait.until(ExpectedConditions.elementToBeClickable(logout));
	    System.out.println("logindone");
	    logout.click();
	    
	}

}
