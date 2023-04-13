package listners;

import java.io.IOException;
import java.nio.file.Path;

import org.testng.ITestContext;
import org.testng.ITestListener;

import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.crm.autudesk.GenericUtility.BaseClass;

public class Listener implements ITestListener
{
   
	public void onFinish(ITestContext context) {
		reports.flush();
		
	}

	public void onStart(ITestContext context) {
		ExtentHtmlReporter reporter=new ExtentHtmlReporter(System.getProperty("user.dir")
				+"/ExtentReportsSDET21/ExtentReorts1.html");
		reporter.config().setDocumentTitle("SDET21");
		reports=new ExtentReports();
		reports.attachReporter(reporter);
		
		reports.setSystemInfo("BuildNo", "5.1");
		reports.setSystemInfo("Env", "Pre-Prod");
		reports.setSystemInfo("PLATform", "Windows");
		reports.setSystemInfo("Browser Version", "Chrome-93");
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult result) {
		test.log(Status.FAIL, result.getThrowable());
		test.log(Status.FAIL, result.getMethod().getMethodName());
		
		BaseClass baseclass=new BaseClass();
		try {
			String path = baseclass.getscreenshot(result.getMethod().getMethodName());
			test.addScreenCaptureFromPath(path);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void onTestSkipped(ITestResult result) {
		test.log(Status.SKIP, result.getMethod().getMethodName()+"is SkIPPED");
		
		
	}

	 ExtentReports reports;
	    ExtentTest test;
	public void onTestStart(ITestResult result) {
		test=reports.createTest(result.getMethod().getMethodName());
		
	}

	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, result.getMethod().getMethodName()+"is passed");
		
		
	}
	

}
