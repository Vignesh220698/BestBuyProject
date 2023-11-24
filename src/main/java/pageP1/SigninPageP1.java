package pageP1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseP1.ProjectBaseP1;

public class SigninPageP1 extends ProjectBaseP1 {

	@FindBy(xpath = "//input[@type='email']")
	WebElement loginusername;

	@FindBy(xpath = "//input[@type='password']")
	WebElement loginpassword;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement loginbutton;

	public SigninPageP1(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver,this);		
	}



	public SigninPageP1 Loginmailid(String mail) {
		sendkeys(loginusername, mail);
		return this;
	}

	public SigninPageP1 Loginpassword(String pass) {
		sendkeys(loginpassword ,pass);
		return this;
	}

	public SigninPageP1 LoginButton() {
		click(loginbutton);
		return this;
	}
}
