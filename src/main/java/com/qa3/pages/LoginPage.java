package com.qa3.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.qa3.testutil.TestBase;

public class LoginPage extends TestBase{
	
/*********OR*****************/
	
	
	@FindBy(name="username")
	WebElement username;
	
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(id="btnSignIn")
	WebElement signIn;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String validateLoginTitle() {
		return driver.getTitle();
	}
	
	public HomePage validatelogin(String un,String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		signIn.click();
		return new HomePage();
	}
	
}

