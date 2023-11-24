package testP1;

import org.testng.annotations.Test;

import baseP1.ProjectBaseP1;
import pageP1.CountySelectionPage;

public class TC0005__TitleVerify extends ProjectBaseP1{

	
	@Test(priority = 5,enabled=true)
	public void Titlverify() throws InterruptedException {
		
		new  CountySelectionPage(driver).
		UnitedStateicon().
		Title().
		verifytitle();
}
}