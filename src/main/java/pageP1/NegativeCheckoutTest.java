package pageP1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import baseP1.ProjectBaseP1;

public class NegativeCheckoutTest extends ProjectBaseP1{
	
	public NegativeCheckoutTest(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
}
	
	public void NegChe() {
		String NegTest=driver.getPageSource();
		
		if(NegTest.contains(" Check out")) {
			System.out.println("Negative checkout fail");
		}else {
			System.out.println("Negative checkout Pass");
		}
	}
}
