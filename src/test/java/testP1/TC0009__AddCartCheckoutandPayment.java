package testP1;

import org.testng.annotations.Test;

import baseP1.ProjectBaseP1;
import pageP1.CountySelectionPage;

public class TC0009__AddCartCheckoutandPayment extends ProjectBaseP1{
	
	
	@Test(priority = 9,enabled = true)
	public void checkoutPay() throws InterruptedException {
		
		new  CountySelectionPage(driver).
		UnitedStateicon().
		Checkout().
		CheAndpay();
		
		
		
	}
}