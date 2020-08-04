package org.qsp.testngdemo;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demotestng {
	@Test
	
	public void m1() {
	
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Reporter.log("hey..",true);
	}
	@Test
	 public void m2() {
		System.out.println("hiiii");
		
	}
		
	
		
	}
	
	
	


