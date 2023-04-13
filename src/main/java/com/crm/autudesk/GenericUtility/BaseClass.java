package com.crm.autudesk.GenericUtility;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.crm.autodesk.Assignment.purchase1to5.Home_page;
import com.crm.autodesk.Assignment.purchase1to5.Login_page;

import com.mysql.cj.jdbc.Driver;


public class BaseClass {
	public  DatabaseUtility dlib=new DatabaseUtility();
	public JSONFileUtility jsonlib=new JSONFileUtility();
	public JavaUtility jlib=new JavaUtility();
	public WebDriverUtility wlib=new WebDriverUtility();
	public ExcelFileUtility elib=new ExcelFileUtility();
	public static WebDriver driver;
	public static WebDriver staticDriver;
	
	@BeforeSuite
	public void ConnectionDB() 
	{
		System.out.println("=====MakeConnection====");
	}
	
	@BeforeClass
	public void LaunchBrowser() throws Throwable
	{
		System.out.println("---launchBrowser----");
		String browser = jsonlib.readDataFromJson("browser");
		String url = jsonlib.readDataFromJson("url");
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
			
		}
		
		else if(browser.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else
		{
			System.out.println("invalid browser");
			
		}
		wlib.waitForPageLoad(driver);
		wlib.maximize(driver);
		driver.get(url);
		staticDriver=driver;
		}
	
	
	
	@BeforeMethod
	public void loginapp() throws Throwable
	{
		System.out.println("---logintoapp---");
		String username = jsonlib.readDataFromJson("username");
		String password = jsonlib.readDataFromJson("password");
	 
		//login 
		Login_page lp=new Login_page(driver);
	  lp.login(username, password);
	  lp.submit();
	 }
	
	
	
	
	
	
	
	
	
	//@AfterMethod
	public void signout()
	{
		Home_page hp=new Home_page(driver);
		//hp.mouseHover();
		hp.signout();
		System.out.println("===signout===");
	}
	
	
	//@AfterClass
	public void closeBrowser()
	{
		System.out.println("---closebrowser---");
		driver.close();
	}

	
	
	@AfterSuite
	public void closeDb()
	{
		//close db
		System.out.println("---closeDatabase---");
	}
	
	//Screenshot method
	
	public String getscreenshot(String name) throws IOException
	{
		File srcfile=((TakesScreenshot)staticDriver).getScreenshotAs(OutputType.FILE);
		String destfile=System.getProperty("user.dir")+"/screenshots/"+name+".png";
		File finaldest=new  File(destfile);
		FileUtils.copyFile(srcfile, finaldest);
		
		return destfile;
		
		
	}
}

