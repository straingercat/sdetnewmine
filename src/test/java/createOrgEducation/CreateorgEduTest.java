package createOrgEducation;

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

public class CreateorgEduTest {
	WebDriver driver;
	@Test
	public void CreateEdu() throws Throwable{
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
		
		//click on organization
		driver.findElement(By.linkText("Organizations")).click();
		
		//click on add or plus button
		driver.findElement(By.xpath("//img[@alt='Create Organization...']")).click();
		
		//entering the organization
		driver.findElement(By.name("accountname")).sendKeys(OrgName+jlib.getRandomNum());
		
		   //selecting education from drop down
	    WebElement ind = driver.findElement(By.name("industry"));
	    wlib.select(ind, jsonlib.readDataFromJson("industry"));
	    
	    
	    //saving
	    driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
		
	

	    
	    
	    Thread.sleep(3000);
	    
	    
	  
	    
	    //logout
	    WebElement ele = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
	    wlib.mouseover(driver, ele);
	    driver.findElement(By.linkText("Sign Out")).click();
	    
	    driver.close();
	    
	    
	    
	 
	      
	    
		
		
		
	}

}
