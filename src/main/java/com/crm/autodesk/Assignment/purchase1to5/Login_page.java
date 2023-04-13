package com.crm.autodesk.Assignment.purchase1to5;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Login_page {
	WebDriver driver;
	public  Login_page(WebDriver driver)
	
	
	
		//Initialization
				{
					PageFactory.initElements(driver, this);
				}
				
				//login 
				@FindBy(name="user_name")
				private WebElement usernme;
				
				@FindBy(name="user_password")
				private WebElement pssword;
				
				
				@FindBy(id="submitButton")
				private WebElement sbmit;
				
				public WebElement getUsernme() {
					return usernme;
				}

				public WebElement getPssword() {
					return pssword;
				}

				public WebElement getSbmit() {
					return sbmit;
				}
				
				//Business logic
				
				public void login(String username,String password)
				
				{
					usernme.sendKeys(username);
					pssword.sendKeys(password);
				}
				public void submit()
				{
					sbmit.click();
				}
			

	}


