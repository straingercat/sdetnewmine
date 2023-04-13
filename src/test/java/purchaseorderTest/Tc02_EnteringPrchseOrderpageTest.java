package purchaseorderTest;


import org.testng.annotations.Listeners;
import org.testng.annotations.Test;



import com.crm.autodesk.Assignment.purchase1to5.Home_page;

import com.crm.autudesk.GenericUtility.BaseClass;
//@Listeners(listners.Listener.class)

public class Tc02_EnteringPrchseOrderpageTest extends BaseClass {
	
	@Test(groups ="smokesuit")
	public void enteringprchseorderpageTest() {
		
		Home_page hp=new Home_page(driver);
		hp.mouseHover();
		hp.clickonpurchaseorderlink();
	
		
		
		
		
		
		
		
		
	}

}
