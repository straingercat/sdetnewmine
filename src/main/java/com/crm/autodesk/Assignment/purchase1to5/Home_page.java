package com.crm.autodesk.Assignment.purchase1to5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.autudesk.GenericUtility.WebDriverUtility;

public class Home_page extends WebDriverUtility {
	WebDriver driver;
	public Home_page(WebDriver driver) 
	
		//Initialization
				{
				this.driver=driver;
					PageFactory.initElements(driver, this);
				}

				
				
				//locating all elements
				


				@FindBy(xpath="//img[contains(@src,'user.PNG')]")
				private WebElement admistratorIMG;

				//mouse overing on more
				@FindAll({@FindBy(linkText = "More"),
					@FindBy(xpath="//*[text()='More']")})
				private WebElement more;
				
				//clicking on purchase order
				@FindBy(name="Purchase Order")
				private WebElement prchseordr;
				
				
				//mouse hover
				@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
				private WebElement mouseoveron;
				
				//clicking sign out
				@FindBy(linkText ="Sign Out")
				private WebElement signout;
				 
				//getters
				public WebElement getMore() {
					return more;
				}
				
				
				public WebElement getPrchseordr() {
					return prchseordr;
					}
				

				//getters
				public WebElement getMouseoveronsignout() {
					return mouseoveron;
				}
				
				public WebElement getSignout() {
					return signout;
				}
//Business logic
				
				//mouse overing on more 
				public void mouseHover()
				{
					mouseover(driver, more);
				}
				
				//clicking on purchase order link
				public void clickonpurchaseorderlink()
				{
					prchseordr.click();
				}
				 public void mousovronsgnot()
				    {
				    	mouseover(driver, mouseoveron);
				    	
				    }
				 
				  public void signout()
				    {
					  mouseover(driver, admistratorIMG);
				    	signout.click();
				    }
	}


