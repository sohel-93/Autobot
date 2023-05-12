package TestNG;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.*;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class BasicExtentReportClass {
	
	ExtentSparkReporter htmlReporter;
	ExtentReports reports;
	ExtentTest test;
	@BeforeTest
	public void startReport()
	{
		htmlReporter = new ExtentSparkReporter("ExtentReportDemo.html");
		reports = new ExtentReports();
		reports.attachReporter(htmlReporter);
		
		// add environment details
		reports.setSystemInfo("Machine", "testpc1");
		reports.setSystemInfo("OS", "Windows 11");
		reports.setSystemInfo("User", "sohel");
		reports.setSystemInfo("Browser", "Chrome");
		
		//configure to change look and feel of reports
		
		htmlReporter.config().setDocumentTitle("Extent Report Demo");
		htmlReporter.config().setReportName("Test Report");
		htmlReporter.config().setTheme(Theme.STANDARD);
		htmlReporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");
		
	}
	@Test
	public void LaunchBrowserAndOpenURL() 
	{
		// create test
		test =reports.createTest("Launch Browser and open url");
		Assert.assertTrue(true);//Test passed
	}
	@Test
	public void VerifyTitle() 
	{
		// create test
		test =reports.createTest("Verify Title");
		Assert.assertTrue(false);//Test failed	
	}
	@Test
	public void VerifyLogo() 
	{
		// create test
		test =reports.createTest("Verify Logo");
		Assert.assertTrue(true);//Test passed
	}
	@Test
	public void VerifyEmail() 
	{
		// create test
		test =reports.createTest("Verify Email");
		throw new SkipException("Skipping this test case with exception");
	}
	@Test
	public void VerifyUserName() 
	{
		// create test
		test =reports.createTest("Verify UserName");
		Assert.assertTrue(true);//Test pass
	}
	@AfterMethod
	public void getTestResult(ITestResult Result)
	{
		if(Result.getStatus()==ITestResult.FAILURE)
		{
			test.log(Status.FAIL, MarkupHelper.createLabel(Result.getName()+"FAIL", ExtentColor.RED));
		}
		else if(Result.getStatus()==ITestResult.SUCCESS)
		{
			test.log(Status.PASS, MarkupHelper.createLabel(Result.getName()+"PASS", ExtentColor.GREEN));
		}
		else if(Result.getStatus()==ITestResult.SKIP)
		{
			test.log(Status.SKIP, MarkupHelper.createLabel(Result.getName()+"SKIP", ExtentColor.GREY));
		}
	}
	@AfterTest
	public void tearDown()
	{
		reports.flush();
	}

}
