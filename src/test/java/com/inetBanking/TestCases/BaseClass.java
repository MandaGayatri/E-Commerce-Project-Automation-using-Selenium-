package com.inetBanking.TestCases;

import com.inetBanking.utilities.readconfig;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass {
	
	readconfig rd = new readconfig();
	public String baseURL= rd.getapplicationurl();
	public String username=rd.getusername();
	public String password=rd.getpassword();
	public static WebDriver driver;
	
	
	
	@Parameters("browsers")
	@BeforeClass
	public void setup(String br)
	{
		if(br.equals("CHROME"))
		{
		System.setProperty("webdriver.chrome.driver",rd.getcpath());
		driver = new ChromeDriver();
		}
		

		driver.get(baseURL);
		
	}
	
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
     public void CaptureScreen(WebDriver driver, String tname) throws Exception
     {
    	TakesScreenshot ts = (TakesScreenshot) driver;
    	File source = ts.getScreenshotAs(OutputType.FILE);
    	File target = new File("C:\\Users\\pcs\\Downloads\\E-Commerce-Automation-Testing-main\\E-Commerce-Automation-Testing-main\\screenshot\\"+tname+".png");
    	FileUtils.copyFile(source,target );
    	System.out.println("screenshot taken");
     }

}
