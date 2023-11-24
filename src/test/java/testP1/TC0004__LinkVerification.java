package testP1;

import org.testng.annotations.Test;

import baseP1.ProjectBaseP1;
import pageP1.CountySelectionPage;

public class TC0004__LinkVerification extends ProjectBaseP1{
	
	
	@Test(priority = 4,enabled=true)
	public void linkverify() throws InterruptedException {
		
		new CountySelectionPage(driver).
		UnitedStateicon().
		link().
		LinksinHM();
		
	}

}
