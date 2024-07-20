package org.Stepdefinition;

import java.util.List;
import java.util.Map;

import org.help.loginpojo;
import org.help.samplebase;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.*;

public class stepforgotten extends samplebase {
	@Given("User have to launch the facebook application through chrome browser")
	public void user_have_to_launch_the_facebook_application_through_chrome_browser() {
		 browserlaunch();
		 launchurl("https://www.facebook.com/");
	}

	@When("User have to click the forgotten password")
	public void user_have_to_click_the_forgotten_password() {
		loginpojo l=new loginpojo();
		WebElement forgotpass=l.getForgotpass();
		forgotpass.click();
		
	}

	@When("User have to enter invalid email")
	public void user_have_to_enter_invalid_email() {
		loginpojo l=new loginpojo();
		WebElement email=l.getEmailmobile();
		email.sendKeys("goa@123");
	    
	}

	@Then("User have to click search button")
	public void user_have_to_click_search_button() throws InterruptedException {
		loginpojo l=new loginpojo();
		WebElement search=l.getSearch();
		search.click();
		
		//Thread.sleep(2000);
		//Alert a =driver.switchTo().alert();
		
		//String msg=a.getText();
		//System.out.println(msg);
		//if (msg.contains("temporarily blocked")) {
	//System.out.println("invalid email");
			
		//} else {
			//System.out.println("valid email");

		//}
	}
	
	@When("User have to Enter invalid email")
	public void user_have_to_Enter_invalid_email(io.cucumber.datatable.DataTable d) {
		//1D MAP WITH HEADER
		Map<String, String>  mp= d.asMap(String.class, String.class);
	       String Username=mp.get("vegetables");
	       String Password =mp.get("fruits");
	       
	       loginpojo l=new loginpojo();
			WebElement email=l.getEmailmobile();
			email.sendKeys(Username);
			
	}
	@When("User have to Enter valid email")
	public void user_have_to_Enter_valid_email(io.cucumber.datatable.DataTable d) {
		
		//2D MAP WITH HEADER
		List<Map<String,String>> mp=d.asMaps(String.class, String.class);
		Map<String,String> Username=mp.get(0);
		String user=Username.get("variety2");
		
		
		loginpojo l=new loginpojo();
		WebElement email=l.getEmailmobile();
		email.sendKeys(user);
		
		
		
	}
}
