package com.inetBanking.TestCases;

import org.testng.annotations.Test;

import com.inetBanking.pageObjects.LoginPage;

import junit.framework.Assert;

public class TC_LoginTest_001 extends BaseClass
{
	@Test
	public void loginTest()  throws Exception
	{
		
		
		driver.get(baseURL);
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		lp.setPassword(password);
		
		lp.clickSubmit();
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
		}
		else
		{
			CaptureScreen(driver,"loginTest");
			Assert.assertTrue(false);
		}
		
	}

}
