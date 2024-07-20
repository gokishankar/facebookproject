package org.Stepdefinition;


import java.util.List;

import org.help.loginpojo;
import org.help.samplebase;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.*;
import junit.framework.Assert;

public class stepdefinition extends samplebase {
	
	@Given("User should open the browser and launch url")
	public void user_should_open_the_browser_and_launch_url() {
		 browserlaunch();
		 launchurl("https://www.facebook.com/");
		}

	@When("User should type invalid username and invalid password")
	public void user_should_type_invalid_username_and_invalid_password() {
		loginpojo l=new loginpojo();
		WebElement email=l.getTxtEmail();
		email.sendKeys("smart@123");
		WebElement pass=l.getTxtpass();
		pass.sendKeys("12345");
		
		}

	@When("User click login button")
	public void user_click_login_button() throws InterruptedException {
		
		loginpojo l=new loginpojo();
		WebElement login=l.getBtlogin();
		login.click();
		Thread.sleep(2000);
	}

	@Then("Validate user should navigate to incorrect credential page")
	public void validate_user_should_navigate_to_incorrect_credential_page() {
		
		String url=driver.getCurrentUrl();
		if(url.contains("privacy")) {
			System.out.println("invalid page");
		}
		else {
			
			
			System.out.println("valid page");
		}
		
	}


@When("user have to get current url")
public void user_have_to_get_current_url() {
	
	String url=driver.getCurrentUrl();
	System.out.println(url);
}

@When("User should type valid username and invalid password")
public void user_should_type_valid_username_and_invalid_password() {
	loginpojo l=new loginpojo();
	WebElement email=l.getTxtEmail();
	email.sendKeys("smart@123");
	WebElement pass=l.getTxtpass();
	pass.sendKeys("12345");
}

@When("User should type invalid {string} and invalid {string}")
public void user_should_type_invalid_and_invalid(String s1, String s2) {
    
	loginpojo l=new loginpojo();
	WebElement email=l.getTxtEmail();
	email.sendKeys(s1);
	WebElement pass=l.getTxtpass();
	pass.sendKeys(s2);

}
@When("User should type valid username and valid password")
public void user_should_type_valid_username_and_valid_password() {
    // Write code here that turns the phrase above into concrete actions
    throw new cucumber.api.PendingException();
}
@When("User should type valid Username and invalid password")
public void user_should_type_valid_Username_and_invalid_password(io.cucumber.datatable.DataTable d) {
	//1D list without header
	List<String> li=d.asList();
	String username=li.get(2);
	String password=li.get(5);
	
	loginpojo l=new loginpojo();
	WebElement email=l.getTxtEmail();
	email.sendKeys(username);
	WebElement pass=l.getTxtpass();
	pass.sendKeys(password);

}
@When("User should type valid Username and valid password")
public void user_should_type_valid_Username_and_valid_password(io.cucumber.datatable.DataTable d) {
	//2D LIST WITHOUT HEADER
	List<List<String>> li=d.asLists();
	
	List<String> user=li.get(1);
	String user1=user.get(2);
	
	List<String> password=li.get(1);
	 String pass1 =password.get(3);
	
	
	 loginpojo l=new loginpojo();
		WebElement email=l.getTxtEmail();
		email.sendKeys(user1);
		WebElement pass=l.getTxtpass();
		pass.sendKeys(pass1);

	
	
	
}
}

