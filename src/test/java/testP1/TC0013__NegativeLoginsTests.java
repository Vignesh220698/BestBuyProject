package testP1;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseP1.ProjectBaseP1;
import pageP1.CountySelectionPage;
import pageP1.HomepageP1;

public class TC0013__NegativeLoginsTests extends ProjectBaseP1{
	
	@BeforeTest
	public void Exceldata() {
		ExcelFile="NegLogin";
	}
	
	@Test(priority = 13,dataProvider = "getdata",enabled = true)
	public void NLoginT(String user1,String pass1) throws InterruptedException {
		
		new CountySelectionPage(driver).
		UnitedStateicon().	
		NegloginTest().
		NegEmail(user1).
		Negpass(pass1).
		NegLogbutton();
		
	}
	

}
