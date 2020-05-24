package com.qa3.stepDefinition;

import com.qa3.pages.HomePage;
import com.qa3.pages.LoginPage;
import com.qa3.testutil.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import static org.junit.Assert.*;

import org.junit.Assert;

public class LoginStepDefinition extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	
	

	@Given("^user is on login page$")
	public void user_is_on_login_page(){
		TestBase.initialization();
	}

	@Then("^verify title of login page$")
	public void verify_title_of_login_page(){
		loginPage = new LoginPage();
		String actual = loginPage.validateLoginTitle();
		Assert.assertEquals("CounselLink", actual);
	}

	@Then("^user enters username and password$")
	public void user_enters_username_and_password(){
		
		homePage = loginPage.validatelogin(prop.getProperty("username"), prop.getProperty("password"));
	}

	@Then("^user lands on homepage$")
	public void user_lands_on_homepage(){
		String homeUserName = homePage.verifyHomepageUserName();
		Assert.assertEquals("Boyko, Larisa", homeUserName);
	    
	}

	@Then("^quits the browser$")
	public void quits_the_browser(){
	    driver.close();
	}
	
}
