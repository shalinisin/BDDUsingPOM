package com.qa3.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa3.testutil.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(xpath="//td[contains(text(),'Boyko, Larisa')]")
	WebElement user;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomepageUserName() {
		return user.getText();
		
	}
	
}
