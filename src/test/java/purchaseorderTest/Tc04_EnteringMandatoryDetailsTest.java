package purchaseorderTest;


import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import com.crm.autodesk.Assignment.purchase1to5.Details;
import com.crm.autodesk.Assignment.purchase1to5.Home_page;

import com.crm.autudesk.GenericUtility.BaseClass;

public class Tc04_EnteringMandatoryDetailsTest extends BaseClass {
	@Test
	
	public void EnteringDetailsTest() throws Throwable {
		
		
		
		//Reading data from excel Sheet2
		 
		  String sub = elib.getExcelData("Sheet2", 1, 0);
		  String searchvendor = elib.getExcelData("Sheet2", 1, 3);
	       String billad = elib.getExcelData("Sheet2", 1, 1);
	       String enterproname = elib.getExcelData("Sheet4", 1, 2);
	       String quantity = elib.getExcelData("Sheet2", 1, 2);
	       
		
		//mouse overing on more and clicking purchase order link
		Home_page b=new Home_page(driver);
		b.mouseHover();
		b.clickonpurchaseorderlink();
		
		 //adding new purchase order
		Details d=new Details(driver);
		d.clkplus();
		
		//entering Subject
		d.subjectname(sub);
		
		//adding vender
		d.vendorname();
		
		//Switching to window
		wlib.partialwindowtitle(driver, "specific_vendor_address");
		
		//searching on vendors page
		d.searchvendor(searchvendor);
		
		//clicking on search now
	    d.sbutton();
		
		//selecting vendor
		d.selvendor();
		
		//Switching  back to window
		wlib.partialwindowtitle(driver, "Inventory");
				
		
		//billing address
		d.billingadd(billad);
		
		
	
		//copying billing address
		d.copycat();
		
		Point loc = d.getItemimg().getLocation();
		int x = loc.getX();
		int y = loc.getY();
		
		//scroll  down
		wlib.scrollbar(driver, x, y);
		
		//clicking item image
		d.item();
		
		        //switch to product page
				wlib.partialwindowtitle(driver, "Products&action");
				
				//entering product
				d.proname(enterproname);
				d.sb();
				d.selepro();
				
				//Switching  back to window
				wlib.partialwindowtitle(driver, "Inventory");
				
				//entering quantity
				d.qty(quantity);
				
				//saving
				d.saving();
				
				
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		 
		
		
	
		
		
	
		
		
		
	}

}
