package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Acti2 { public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
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
	driver.findElement(By.xpath("//div[@class='popup_menu_button popup_menu_button_support popup_menu_button_pressed']//div[@class='menu_icon']")).click();;

}
}
