 package testP1;

import org.testng.annotations.Test;

import baseP1.ProjectBaseP1;
import pageP1.UrlVerify;

public class TC0003__urlverify extends ProjectBaseP1{
	
	@Test(priority = 3,enabled=true)
	public void URl() throws InterruptedException {
		
		new UrlVerify(driver).
		urlcheck();
		
	}

}
