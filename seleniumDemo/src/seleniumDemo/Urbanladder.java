package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Urbanladder {
	           
		 public static void main(String[] args) throws InterruptedException {
				System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.urbanladder.com/");
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
				WebElement liv=driver.findElement(By.xpath("//li/span[contains( .,'living')]"));
				WebElement sale=driver.findElement(By.xpath("//li[@class='topnav_item saleunit']"));
				Actions a=new Actions(driver);
				a.moveToElement(sale).perform();
		 }
	}

	
	
