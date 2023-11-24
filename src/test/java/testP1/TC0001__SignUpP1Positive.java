package testP1;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseP1.ProjectBaseP1;
import pageP1.CountySelectionPage;
import pageP1.HomepageP1;


public class TC0001__SignUpP1Positive extends ProjectBaseP1{
	@BeforeTest
	public void ReadExcel() {
		ExcelFile="Login";
	}
	
	
	@Test(priority = 1,dataProvider = "getdata",enabled=true)
	public void Register(String mail,String pass) throws InterruptedException {
	
		
		
		new CountySelectionPage(driver).
		UnitedStateicon().
		createaccount().
		regMailid(mail).
		regpass(pass).
		regconfpass(pass).
		AcccreatePage();
		
//      String Fname, String Lname,String mail,String pass,String conformpass,String mobile
//		signupfirstname(Fname).
//		signupLastname(Lname).
//		signupMailId(mail).
//		signupPassword(pass).
//		signupConfirmpassword(conformpass).
//		signupMobileNumber(mobile).
//		signupCreateAccButton();
		
		
		
		
}
}
