package testP1;

import org.testng.annotations.Test;

import baseP1.ProjectBaseP1;
import pageP1.CountySelectionPage;

public class TC0010__NegSign extends ProjectBaseP1{
	
	@Test(priority = 10,enabled = true)
	public void Negs() throws InterruptedException {	
		
		new  CountySelectionPage(driver).
		UnitedStateicon().
		Negsignup().
		neSigin();
	}

}
