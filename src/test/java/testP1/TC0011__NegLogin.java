package testP1;

import org.testng.annotations.Test;

import baseP1.ProjectBaseP1;
import pageP1.CountySelectionPage;

public class TC0011__NegLogin extends ProjectBaseP1{
	
	@Test(priority = 11,enabled = true)
	public void neLog() throws InterruptedException {
		new  CountySelectionPage(driver).
		UnitedStateicon().
		Neglogin().
		NeLogin();
	}

}
