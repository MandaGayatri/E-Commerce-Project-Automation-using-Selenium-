package com.inetBanking.TestCases;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.inetBanking.pageObjects.LoginPage;
import com.inetBanking.utilities.XLutils;

public class LoginTestDDT_002 extends BaseClass
{

 
       @Test(dataProvider = "LoginData")
     public void LoginDDT(String user,String pwd) throws InterruptedException
     {
    	   LoginPage lp = new LoginPage(driver);
    	   lp.setUserName(user);
    	   lp.setPassword(pwd);
    	   lp.clickSubmit();
    	    Thread.sleep(3000);
    	   
    	   if(isAlertpresent()==true)
    	   {
    		   driver.switchTo().alert().accept();
    		   driver.switchTo().defaultContent();
    		   Assert.assertTrue(false);
    	   }
    	   else
    	   {
    		   Assert.assertTrue(true);
    		   lp.Logout();
    		   Thread.sleep(3000);
    		   driver.switchTo().alert().accept();
    		   driver.switchTo().defaultContent();
    	   }
    	   
    	   
     }
       public boolean isAlertpresent()
       {
    	   try {
       
    	   driver.switchTo().alert();
    	   return true;
       }
    	   catch(Exception e) {
    		   return false;
    	   }
    	   
       }
    
       @DataProvider(name = "LoginData")
        String [][]getData() throws Exception
       {
   String path = System.getProperty("user.dir")+"\\src\\test\\java\\com\\inetBanking\\testData\\data.xlsx";
   System.out.println("Getting Data from xlsx File");
    	
   int rownum = XLutils.getRowCount(path, "sheet1");
   int colcount = XLutils.getCellCount(path,"sheet1",1);
   
   String LoginData[][] =  new String[rownum][colcount];
   
   for(int i =1;i<=rownum;i++)
   {
	   for(int j =0;j<colcount;j++)
	   {
		   LoginData[i-1][j] = XLutils.getCellData(path,"sheet1",i,j);
	   }
   }
   return LoginData;
     }
}