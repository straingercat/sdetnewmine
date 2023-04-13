package com.crm.autudesk.GenericUtility;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListnerImplimentaion  implements ITestListener{
	ExtentReports reports;
	ExtentTest test;
	 public void onTestStart(ITestResult result) {
		 test = reports.createTest(result.getMethod().getMethodName());
	 }
	  public void onTestSuccess(ITestResult result) {
		  test.log(Status.PASS, result.getMethod().getMethodName()+" is passed");
		  
	  }
	  public void onTestFailure(ITestResult result) {
		  BaseClass b = new  BaseClass();
		  String deztination = null;
		 try {
			 deztination = b.getscreenshot(result.getMethod().getMethodName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  test.log(Status.FAIL, result.getMethod().getMethodName()+" is failed");
		  test.log(Status.SKIP, result.getThrowable());
		  try {
			test.addScreenCaptureFromPath(deztination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  }
	  public void onTestSkipped(ITestResult result) {
		  test.log(Status.SKIP, result.getMethod().getMethodName()+" is skipped");
		  test.log(Status.SKIP, result.getThrowable());
	  };
	
	  public void onTestFailedButWithinSuccessPercentage(ITestResult result) {};
	  public void onStart(ITestContext context) {
		  ExtentSparkReporter reporter = new ExtentSparkReporter("./Extentreports/reprt1.html");
		  reporter.config().setDocumentTitle("projrctnameReport");
		  reporter.config().setReportName("testExecutionReport");
		  reporter.config().setTheme(Theme.STANDARD);
		  
		   reports = new ExtentReports();
		  reports.attachReporter(reporter);
		  
		  reports.setSystemInfo("browsser", "chrome");
		  reports.setSystemInfo("os", "windows");
	  }

	  public void onFinish(ITestContext context) {
		  // like after suite
		  reports.flush();
	  }

}
