package organazation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.autudesk.GenericUtility.WebDriverUtility;

public class HomepageOrg extends WebDriverUtility {
	WebDriver driver;
	public HomepageOrg(WebDriver drive)
	

	//Initialization
			{
			
				PageFactory.initElements(driver, this);
			}

	//locating all elements
	@FindBy(linkText = "Organizations")
	private WebElement org;
	
	//getters
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getOrg() {
		return org;
	}
	
	//Business logic
	public void clkorg()
	{
		org.click();
	}
	
	

}
