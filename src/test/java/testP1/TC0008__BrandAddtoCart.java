package testP1;

import org.testng.annotations.Test;

import baseP1.ProjectBaseP1;
import pageP1.CountySelectionPage;

public class TC0008__BrandAddtoCart extends ProjectBaseP1{
	
	
	@Test(priority = 8,enabled = true)
	public void BrandAdd() throws InterruptedException {
		
		new  CountySelectionPage(driver).
		UnitedStateicon().
		BAddcart().
		BrAddtocart();
	}

}
