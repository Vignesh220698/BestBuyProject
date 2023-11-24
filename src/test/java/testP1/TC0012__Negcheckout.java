package testP1;

import org.testng.annotations.Test;

import baseP1.ProjectBaseP1;
import pageP1.CountySelectionPage;

public class TC0012__Negcheckout extends ProjectBaseP1{

	@Test(priority = 12,enabled =true)
	public void NeChe() {
		new  CountySelectionPage(driver).
		UnitedStateicon().
		Negcheckout().
		NegChe();
		

		}
}
