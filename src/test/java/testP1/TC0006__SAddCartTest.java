package testP1;

import org.testng.annotations.Test;

import baseP1.ProjectBaseP1;
import pageP1.CountySelectionPage;

public class TC0006__SAddCartTest extends ProjectBaseP1{

	@Test(priority = 6,enabled = true)
	public void Sadd() throws InterruptedException {
		
		new  CountySelectionPage(driver).
		UnitedStateicon()
		.SAddcart().
		AddtoCartm();
		
		
	}
}
