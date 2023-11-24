package testP1;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseP1.ProjectBaseP1;
import pageP1.CountySelectionPage;
import pageP1.HomepageP1;


public class TC0002__LoginP1Positive extends ProjectBaseP1{


	@BeforeTest
	public void FileRead() {

		ExcelFile="Login";

	}

	@Test(priority = 2,dataProvider = "getdata",enabled=true)
	public void Register(String mail, String pass) throws InterruptedException {


		new CountySelectionPage(driver).
		UnitedStateicon().
		signin().
		Loginmailid(mail).
		Loginpassword(pass).
		LoginButton();
		


	}

}
