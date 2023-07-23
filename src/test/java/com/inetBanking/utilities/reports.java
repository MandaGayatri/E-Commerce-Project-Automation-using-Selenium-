package com.inetBanking.utilities;
import java.io.File;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class reports extends TestListenerAdapter 
{
 public ExtentHtmlReporter reporter;
 public ExtentReports extent;
 public ExtentTest logger;
 
 public void onStart(ITestContext testContext)
 {
	 String timeStamp = new SimpleDateFormat("yyyy:mm:dd:mm:ss").format(new Date());
	 String repname = "Testreport-"+timeStamp+".html";
	 reporter = new ExtentHtmlReporter("C:\\Users\\pcs\\Downloads\\E-Commerce-Automation-Testing-main\\E-Commerce-Automation-Testing-main\\reports"+repname);
	 reporter.loadXMLConfig("C:\\Users\\pcs\\Downloads\\E-Commerce-Automation-Testing-main\\E-Commerce-Automation-Testing-main\\extent-config.xml");
	 
              

        extent = new ExtentReports();
        extent.attachReporter(reporter);
        extent.setSystemInfo("user","gautam");
        extent.setSystemInfo("host name", "gayatri");
        extent.setSystemInfo("environment", "QA");
        
        reporter.config().setDocumentTitle("inetBanking project");
        reporter.config().setReportName("Functional test case");
        reporter.config().setTestViewChartLocation(ChartLocation.BOTTOM);
        reporter.config().setTheme(Theme.STANDARD);        
 }
 public void onTestSuccess(ITestResult tr)
 {
	 logger = extent.createTest(tr.getName());
	 logger.log(Status.PASS,MarkupHelper.createLabel(tr.getName(),ExtentColor.GREEN));
 }
 
 public void onTestFailure(ITestResult tr)
 {
	 logger = extent.createTest(tr.getName());
	 logger.log(Status.FAIL, MarkupHelper.createLabel(tr.getName(),ExtentColor.RED));
	 String screenshotpath = System.getProperty("user.dir")+"/ScreenShots/+tr.getName()"+".png";
	 
	 File f = new File(screenshotpath);
	if(f.exists())
	{
		try {
		logger.fail("screenshot is below"+logger.addScreenCaptureFromPath(screenshotpath));
	        }
		catch(Exception e)
		{
			System.out.println(e);
		}
  }
 
}
 public void ontestSkip(ITestResult tr)
 {
	 logger = extent.createTest(tr.getName());
	 logger.log(Status.SKIP,MarkupHelper.createLabel(tr.getName(), ExtentColor.ORANGE));
 }
 public void ontestFinish(ITestResult tr)
 {
	 extent.flush();
 }

 
}
