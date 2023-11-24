package testP1;

import org.testng.annotations.Test;

import baseP1.ProjectBaseP1;
import pageP1.CountySelectionPage;

public class TC0007__DeptAddtoCart extends ProjectBaseP1{
	
	@Test(priority = 7,enabled = true)
	public void DeptAdd() throws InterruptedException {
		
		new  CountySelectionPage(driver).
		UnitedStateicon().
		DAddcart().
		Deptaddtocart();

}
}
