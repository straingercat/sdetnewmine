
package com.crm.autudesk.GenericUtility;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * This class contains all the generic methods related to actions
 * @author punith raj.c
 *
 */

public class WebDriverUtility {
	
	
	/**
	 * This method will wait for the page load 20 seconds
	 */
	public void waitForPageLoad(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
		
		
		
		/**
		 * This method will maximize the window
		 */
		public void maximize(WebDriver driver)
		{
			driver.manage().window().maximize();
		}
		
		
		/**
		 * This method will select from the drop down using visible text
		 * 
		 */
		public void select(WebElement element,String value)
		{
			Select sel=new Select(element);
			sel.selectByVisibleText(value);
	}
		
		
		/**
		 * This method will select from drop down using index
		 * 
		 */
        public void select(WebElement element,int index)
        {
        	Select sel=new Select(element);
        	sel.selectByIndex(index);
        }
        
        /**
         * This method is used for mouse over actions
         * 
         */
        
        public void mouseover(WebDriver driver,WebElement element)
        {
        	Actions act = new Actions(driver);
        	act.moveToElement(element).perform();
        	
        }
        
        /**
         * This method will double click
         * 
         */
        public void doubleClick(WebDriver driver,WebElement element)
        {
        	Actions act = new Actions(driver);
        	act.doubleClick(element).perform();
        }
        
        
       /**
        * This method will accept or ok the alert popup
        */
        public void AcceptAlert(WebDriver driver)
        {
        	driver.switchTo().alert().accept();
        }
        
        
      /**
       * This method will dismiss or Cancel the alert popup
       */
        public void dismissAlert(WebDriver driver)
        {
        	driver.switchTo().alert().dismiss();
        	
        }
        
        /**
         * This method will check whether is enabled
         */
        
        	
        
        
        
        /**
         *  This method will switch to frame wrt to frame
         */
        public void SwithtoFrame(WebDriver driver,int index)
        {
        	driver.switchTo().frame(index);
        	
        }
        
        
        /**
         *  This method will switch to frame wrt to id
         */
        public void SwithtoFrame(WebDriver driver,String frameid)
        {
        	driver.switchTo().frame(frameid);
        	
        }
        
        /**
         * This method will switch to frame wrt to element
         */
        public void switchtoframe(WebDriver driver,WebElement frameElement)
        {
        	driver.switchTo().frame(frameElement);
        }
       
        
        /**
         * This method will switch to window wrt to partial window title
         * 
         */
        public void partialwindowtitle(WebDriver driver, String partialwintitle)
        {
        	Set<String> windowhandles = driver.getWindowHandles();
        	 Iterator<String> ite = windowhandles.iterator();
        	 while(ite.hasNext())
        	 {
        		 String winId=ite.next();
        		 String actTitle=driver.switchTo().window(winId).getTitle();
        		 if(actTitle.contains(partialwintitle))
        		 {
        			 driver.switchTo().window(actTitle);
        			 break;
        		 }
        		 
        		 
        	 }
        	
        }
        
               /**
         * wait for element to visible
         * 
         */
       public void waitforelementtovisible(WebDriver driver,WebElement element)
       {
    	   WebDriverWait wait=new WebDriverWait(driver,20);
    	   wait.until(ExpectedConditions.visibilityOf(element));
       }
       
       /**
        * This is for Scroll bar
        * 
        */
       public void scrollbar(WebDriver driver, int x, int y)
       {
    	  JavascriptExecutor js=(JavascriptExecutor)driver;
    	  js.executeScript("window.scrollBy("+x+","+y+")");
    	  
       }
}
