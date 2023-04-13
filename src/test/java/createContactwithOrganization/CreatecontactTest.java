package createContactwithOrganization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.crm.autudesk.GenericUtility.ExcelFileUtility;
import com.crm.autudesk.GenericUtility.JSONFileUtility;
import com.crm.autudesk.GenericUtility.JavaUtility;
import com.crm.autudesk.GenericUtility.WebDriverUtility;

public class CreatecontactTest {
	WebDriver driver;
	@Test
	public void createcontactinorg() throws Throwable
	{
		//read all the necessary data

		JSONFileUtility jsonlib=new JSONFileUtility();
		JavaUtility jlib=new JavaUtility();
		WebDriverUtility wlib=new WebDriverUtility();
		ExcelFileUtility elib=new ExcelFileUtility();
		
		//data from json
		String url = jsonlib.readDataFromJson("url");
		String browser = jsonlib.readDataFromJson("browser");
		String username = jsonlib.readDataFromJson("username");
		String password = jsonlib.readDataFromJson("password");
		
		//data from excel sheet
		String contactname = elib.getExcelData("Sheet1", 1, 2);
		elib.getExcelData("Sheet1", 1, 2);
		
		//data from excel sheet
				String OrgName = elib.getExcelData("Sheet1", 1, 3);
				elib.getExcelData("Sheet1", 1, 3);
		
		//Launch the browser
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
		
		//login to application
		driver.findElement(By.name("user_name")).sendKeys(username);
		driver.findElement(By.name("user_password")).sendKeys(password);
		driver.findElement(By.id("submitButton")).click();
		
		//click on contacts
		driver.findElement(By.partialLinkText("Contacts")).click();
		
		//create contact
		driver.findElement(By.xpath("//img[@alt='Create Contact...']")).click();
		
		//creating last name
		driver.findElement(By.name("lastname")).sendKeys(contactname);
		
		//clicking on plus button
		driver.findElement(By.xpath("//img[@title='Select']")).click();
		
		//switch to child window
	    wlib.partialwindowtitle(driver,"Accounts");
	    
	    //entering in search field
	    driver.findElement(By.id("search_txt")).sendKeys(OrgName);
	    
	    //clicking on search now button
	    driver.findElement(By.name("search")).click();
	    
	    //clicking on orgname
	    driver.findElement(By.linkText("testyantra")).click();
	    
	    //switch back to parent window
	    wlib.partialwindowtitle(driver,"Marketing");
	    
	    //saving
	    driver.findElement(By.name("button")).click();
	    
	    //logout
	    WebElement ele = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
	    wlib.mouseover(driver, ele);
	    driver.findElement(By.linkText("Sign Out")).click();
	    
	    driver.close();
	    
	 
		
	}
	

}
