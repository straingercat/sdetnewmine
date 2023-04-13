package com.crm.autodesk.Assignment.purchase1to5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.autudesk.GenericUtility.ExcelFileUtility;

public class Details extends ExcelFileUtility {
	
	WebDriver driver;
	
	public Details (WebDriver driver)
	
	
	//Initialization
		{
			PageFactory.initElements( driver,this);
		}
	
//locating all elements
	
	//adding or creating purchase order
			@FindBy(xpath="//img[@alt=\"Create Purchase Order...\"]")
			private WebElement creatprcheordr;
			
			//entering subject
			@FindBy(name = "subject")
			private WebElement subjecttf;
			
			//adding vendor
			@FindBy(xpath = "//img[@alt='Select']")
			private WebElement vendor;
			
			//Searching vendor
			@FindBy(name="search_text")
			private WebElement search;
			
			//Clicking on search button
			@FindBy(name="search")
			private WebElement searchbutton;
			
			//clicking on vendor
			@FindAll({@FindBy(linkText = "Mahindra & Co"),
				@FindBy(linkText ="Volvo"),@FindBy(linkText = "Renvolt")})
				
			
			private WebElement selvendor;
			
			
			//entering billing address
			@FindBy(xpath = "//textarea[@class='detailedViewTextBox']")
			private WebElement billadd;
			
			
			//coping billing address
			@FindBy(xpath  = "(//input[@type='radio'])[4]")
			private WebElement copy;
			

			
			//clicking item image
			@FindBy(xpath="//img[@title='Products']")
			private WebElement itemimg;
			
			
			
			//entering product in search box
			@FindBy(name="search_text")
			private WebElement enterproname;
			
			//clicking on search button
			@FindBy(xpath = "//input[@type='button']")
			private WebElement searchprobutton;
			
			//selecting product
			@FindBy(linkText = "Poco-m2-pro")
			private WebElement selpro;
			
			
			
			//quantity
			@FindBy(id="qty1")
			private WebElement quantity;
			
			
			//saving
			@FindBy(xpath ="(//input[@type='submit'])[2]")
			private WebElement save;
			
			
			
			


			//getters
			public WebDriver getDriver() {
				return driver;
			}




			public WebElement getCreatprcheordr() {
				return creatprcheordr;
			}




			public WebElement getSubjecttf() {
				return subjecttf;
			}




			public WebElement getVendor() {
				return vendor;
			}




			public WebElement getSearch() {
				return search;
			}




			public WebElement getSearchbutton() {
				return searchbutton;
			}




			public WebElement getSelvendor() {
				return selvendor;
			}




			public WebElement getBilladd() {
				return billadd;
			}




			public WebElement getCopy() {
				return copy;
			}




			public WebElement getItemimg() {
				return itemimg;
			}




			public WebElement getEnterproname() {
				return enterproname;
			}




			public WebElement getSearchprobutton() {
				return searchprobutton;
			}




			public WebElement getSelpro() {
				return selpro;
			}




			public WebElement getQuantity() {
				return quantity;
			}




			public WebElement getSave() {
				return save;
			}

			


			//Business logic
			public void clkplus() 
			{
				creatprcheordr.click();
				}
              
			//entering subject
		    public void subjectname(String subject)
		    
		       {
		    	subjecttf.sendKeys(subject);
		    	}
	
		     //adding vendor
		    public void vendorname()
		    {
		    	vendor.click();
		    }
		    
		    //Searching vendor name in vendors page
		    public void searchvendor(String searchvendor)
		    {
		    	search.sendKeys(searchvendor);
		    }
		    
		    //clicking on search button
		    public void sbutton()
		    
		    {
		    	searchbutton.click();
		    }
         
		    //selecting vendor
		 
		    public void selvendor()
		    {
		    	selvendor.click();
		    }
			
			
			  //entering billing address
			    public void billingadd(String billingadd)
			    {
			    	billadd.sendKeys(billingadd);
			    }
			    
				//coping billing address
			    public void copycat() {
			    	copy.click();
				}
			    
			    
			  
			    
			  //clicking on item image
			    public void item() {
			    	itemimg.click();
			    	
			    }
			    
			    //entering product name
			    public void proname(String item) {
			    	enterproname.sendKeys(item);
			    	
			    }
			    
			    
			    //clicking on search button
			    public void sb() {
			    	searchprobutton.click();
			    }
			    
			    //selecting product
			    public void selepro() {
			    	selpro.click();
			    }
			    
			    
			    
				//quantity
			   public void qty(String Quantity)
			   {
			    	quantity.sendKeys(Quantity);
			   }

				//saving
			   public void saving()
			    {
			    	save.click();
			   }
				
				
		    
}
