package com.inetBanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver){
		
		ldriver = rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(xpath = "//input[@name = 'uid']")
	WebElement txtUserName;
	
	@FindBy(name="password")
	
	WebElement txtPassword;
	
	@FindBy(name="btnLogin")

	WebElement btnLogin;
	
	@FindBy(xpath = "//a[text()  = 'Log out']")
	 WebElement Logout;
	
	public void setUserName(String uname)
	{
		txtUserName.sendKeys(uname);
	}
	
	public void setPassword(String pwd)
	{
		txtPassword.sendKeys(pwd);
	}
	
	public void clickSubmit()
	{
		btnLogin.click();
	}
	public void Logout()
	{
		Logout.click();
	}


}
