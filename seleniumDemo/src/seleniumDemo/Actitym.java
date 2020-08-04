package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class Actitym {
	 public static void main(String[] args) throws InterruptedException {
			ccSystem.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demo.actitime.com/login.do");
			System.out.println(driver.getTitle());
			WebElement username=driver.findElement(By.xpath("//b[text()='admin')"));
			String usertext=username.getText();
			System.out.println(usertext);
			WebElement password=driver.findElement(By.xpath("//b[contains(.,'manager')]"));
			System.out.println(password.getText());
			 driver.findElement(By.xpath("//input[@name='username']")).sendKeys(usertext);
			driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(password.getText());
			driver.findElement(By.id("loginButton")).click();
			Thread.sleep(3000);
			WebElement reports=driver.findElement(By.xpath("//div[@id='container_reports']"));
			Actions a=new Actions(driver);
			a.moveToElement(reports).build().perform();
			
			
			
		

	 }
}
