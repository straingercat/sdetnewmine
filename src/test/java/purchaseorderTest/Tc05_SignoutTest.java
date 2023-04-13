package purchaseorderTest;

import org.testng.annotations.Test;

import com.crm.autodesk.Assignment.purchase1to5.Home_page;
import com.crm.autudesk.GenericUtility.BaseClass;

public class Tc05_SignoutTest extends BaseClass {
	@Test
	public void SignoutTest() {
		Home_page hp=new Home_page(driver);
		hp.mousovronsgnot();
		hp.signout();
		
	}

}
