package com.skillmile.SkillMile_Cucumber;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.Login;
import utils.CommonMethods;

public class StepDefinitions {
	static WebDriver driver;
	CommonMethods common;
	String browser="chrome";
	String url ="https://www.walmart.ca/en";
	Login login;
	
	@Before
	public void Setup() {
		common=new CommonMethods();
		common.Setup(browser, url);
		driver=common.getdriver();
		login=new Login(driver);
	}
	@After
	public void teardown() {
		common.teardown();
		}
	
	
	@Given("User is on walmart page")
	public void user_is_on_walmart_page() {
		//login=new Login(driver);
		login.valdiatelandingpage("https://www.walmart.ca/en");
	  
	}

	@When("User clicks on Sign in")
	public void user_clicks_on_sign_in() {
		login.clickSignin();
	   
	}

	@Then("User enters username {string} and password {string}")
	public void user_enters_username_and_password(String un, String pw) {
		login.Logincredentails(un, pw);
	}

	@Then("User click on sign in")
	public void user_click_on_sign_in() {
	    
	}
	

}
