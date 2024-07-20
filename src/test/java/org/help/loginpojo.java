package org.help;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpojo extends samplebase  {
	
	public loginpojo() {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id="email")
	private WebElement txtEmail;
	
	@FindBy(id="pass")
	private WebElement txtpass;
	
	@FindBy(xpath="//button[@name='login']")
	private WebElement btlogin;
	
	@FindBy(xpath="//a[text()='Forgotten password?']")
    private WebElement forgotpass;
   
	@FindBy(xpath="//input[@placeholder='Email address or mobile number']")
    private WebElement emailmobile;
	
	@FindBy(xpath="//button[text()='Search']")
	private WebElement search;
	
	public WebElement getTxtEmail() {
		return txtEmail;
	}

	public WebElement getTxtpass() {
		return txtpass;
	}
	
	
	public WebElement getBtlogin() {
		return btlogin;
	}

	public WebElement getForgotpass() {
		return forgotpass;
	}

	public WebElement getEmailmobile() {
		return emailmobile;
	}

	public WebElement getSearch() {
		return search;
	}
	
}