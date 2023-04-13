package organazation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.autudesk.GenericUtility.ExcelFileUtility;

public class OrgDetails extends ExcelFileUtility {
	WebDriver driver;
	public OrgDetails(WebDriver driver) 
		
		//Initialization
		{
			
			PageFactory.initElements(driver, this);
		}

//locating all elements
	
	//adding org
		@FindBy (xpath="//img[@alt='Create Organization...']")
		private WebElement plusorg;
		
		//entering orgname
		@FindBy(name="accountname")
		private WebElement orgname;
		
		//industry dropdown
		@FindBy(name="industry")
		private WebElement ind;
		
		//getters
		public WebDriver getDriver() {
			return driver;
		}

		public WebElement getPlusorg() {
			return plusorg;
		}

		public WebElement getOrgname() {
			return orgname;
		}

		public WebElement getInd() {
			return ind;
		}
		
		//Business logic
		public void plusorg()
		{
			plusorg.click();
		}
		
		public void  orgname(String OrgName)
		{
			orgname.sendKeys( OrgName);
		}
		
		public void indt(String IndType)
		{
			ind.sendKeys(IndType);
			ind.click();
			
		}
	}


