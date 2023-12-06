package testP1;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseP1.ProjectBaseP1;
import pageP1.CountySelectionPage;

public class TC0014__NegativeCreateacc extends ProjectBaseP1{
	
	@BeforeTest
	public void data() {
		ExcelFile="NegCreateacc";
	}
	
	@Test(priority = 14,dataProvider = "getdata",enabled = true)
	public void NegativeTest(String fname,String lname,String nemail,String npass,String cpass,String nmobile) throws InterruptedException {
		
		new CountySelectionPage(driver).
		UnitedStateicon().
		NegsignTest().
		NeFirstname(fname).
		Nelastname(lname).
		Neemail(nemail).
		Nepass(npass).
		Neconpass(cpass).
		Nemobile(nmobile).
		Createbutton();
		
	}

}
