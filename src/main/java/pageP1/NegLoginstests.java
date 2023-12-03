package pageP1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseP1.ProjectBaseP1;

public class NegLoginstests  extends ProjectBaseP1{


	@FindBy(xpath = "//input[@type='email']")
	WebElement loginusername;

	@FindBy(xpath = "//input[@type='password']")
	WebElement loginpassword;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement loginbutton;

	public NegLoginstests(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);		
	}

	public NegLoginstests NegEmail(String user1) {
		sendkeys(loginusername,user1);
		return this;

	}
	public NegLoginstests Negpass(String pass1) {
		sendkeys(loginpassword,pass1);
        return this;
	}
	public NegLoginstests NegLogbutton() throws InterruptedException {
		click(loginbutton);
		Thread.sleep(2000);
		String source=driver.getPageSource();		
		Thread.sleep(2000);
		if(source.contains("Please enter a valid email address.")) {
			System.out.println("Negative LoginTest Pass");			
		}else {
			System.out.println("Negative LoginTest Fail");
		}
		return this;
	}

}
