package org.qsp.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SeleniumHome {
		@FindBy(name="Search")
		private WebElement search;
		@FindBy(xpath="//img[@class='search-icon])")
		private WebElement searchBtn;

		public SeleniumHome(WebDriver driver) {
			PageFactory.initElements(driver, this);
	}

		public void sendText(String text) {
			search.sendKeys(text);
		
		}

		public void ClickSearchBtn() {
			searchBtn.click();
		}
		}


