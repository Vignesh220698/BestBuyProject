package pageP1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseP1.ProjectBaseP1;

public class CountySelectionPage extends ProjectBaseP1 {
	
	
	@FindBy(xpath = "(//a[@class='us-link'])[1]")
	WebElement UsButton;
	
	public CountySelectionPage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver,this);	
	}
	
	public HomepageP1 UnitedStateicon() {
    	click(UsButton);
    	return new HomepageP1(driver);
		
	}
	

}
