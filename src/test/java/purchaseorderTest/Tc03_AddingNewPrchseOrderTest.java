package purchaseorderTest;

import org.testng.annotations.Test;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.autodesk.Assignment.purchase1to5.Details;
import com.crm.autodesk.Assignment.purchase1to5.Home_page;

import com.crm.autudesk.GenericUtility.BaseClass;
//@Listeners(listners.Listener.class)
public class Tc03_AddingNewPrchseOrderTest extends BaseClass{
	@Test(groups ="Regression" )
	public void addingPrchseOrderTest() {
		
		Home_page a=new Home_page(driver);
		a.mouseHover();
		a.clickonpurchaseorderlink();
		
		Details dl=new Details(driver);
		dl.clkplus();
		
		
		
		
	}

}
