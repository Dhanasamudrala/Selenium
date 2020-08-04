package seleniumDemo;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Deselect {
	 public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.skillrary.com/user/login");
			WebElement ele=driver.findElement(By.id("b"));
			Select s=new Select(ele);
			List<WebElement> opts=s.getOptions();
			if(s.isMultiple()) {
				s.selectByValue(opts.get(1).Gettext());
				s.selectByValue(opts.get(3).Gettext());
			
	
			}
	 }

