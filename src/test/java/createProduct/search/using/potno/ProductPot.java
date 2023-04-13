package createProduct.search.using.potno;

import java.util.List;

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

public class ProductPot {
	WebDriver driver;
	@Test
	
	public void Productpotsearch() throws Throwable {
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
		
		
		//data from excel sheet(product number)
		String productname = elib.getExcelData("Sheet1", 1,4 );
		
		

		//data from excel sheet(part number)
		String partnumber = elib.getExcelData("Sheet1", 1,5 );
		
		
		
		
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
		
		
		//click on product
		driver.findElement(By.linkText("Products")).click();
		
		//add or click on plus button
		driver.findElement(By.xpath("//img[@alt='Create Product...']")).click();
		
		
		//entering the product 
		driver.findElement(By.xpath("//input[@class='detailedViewTextBox']")).sendKeys(productname);
		
		//entering the PartNumber
		driver.findElement(By.name("productcode")).sendKeys(partnumber);
		
		//saving
		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
		
		
		//Again clicking on product
		driver.findElement(By.linkText("Products")).click();
		
		//Clicking on drop down 
		WebElement partno = driver.findElement(By.name("search_field"));
		wlib.select(partno, "Part Number");
		
		//entering part number in search column
		driver.findElement(By.name("search_text")).sendKeys(partnumber);
		
		//clicking on search button
		driver.findElement(By.name("submit")).click();
		
		 //getting product no from product information page
		 WebElement ele1 = driver.findElement(By.xpath("//td[contains(text(),'PR')]"));
			String h = ele1.getText();
		
		//getting product number from product page
		 List<WebElement> ele = driver.findElements(By.xpath("(//table[@class='lvt small']/tbody/tr[*]/td[2])"));
		 for(WebElement e:ele) {
			 String f = e.getText();
			 
			//verifying by comparing
				
			 if(h.contains(f)) {
				 System.out.println("verified");
				 break;
			 }
			 
			}
		
		 
		 //logout
		    WebElement logout = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		    wlib.mouseover(driver, logout);
		    driver.findElement(By.linkText("Sign Out")).click();
		 
		
		
		 
		driver.close();
		
		
		
	}

}
