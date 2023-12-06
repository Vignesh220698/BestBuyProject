package pageP1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseP1.ProjectBaseP1;

public class NegativeSignupsTest  extends ProjectBaseP1{

	@FindBy(xpath = "//input[@id='firstName']")
	WebElement firstname;

	@FindBy(xpath = "//input[@id='lastName']")
	WebElement lastname;

	@FindBy(xpath = "//input[@id='email']")
	WebElement email;

	@FindBy(xpath = "//input[@id='fld-p1']")
	WebElement pass;

	@FindBy(xpath = "//input[@id='reenterPassword']")
	WebElement conpass;

	@FindBy(xpath = "//input[@id='phone']")
	WebElement mobile;

	@FindBy(xpath = "//button[@class='c-button c-button-secondary c-button-lg c-button-block c-button-icon c-button-icon-leading cia-form__controls__submit ']")
	WebElement Createaccbutton;

	public NegativeSignupsTest(WebDriver driver) {

		this.driver=driver;
		PageFactory.initElements(driver,this);

	}


	public NegativeSignupsTest NeFirstname(String fname) {

		sendkeys(firstname,fname);
		return this;
	}

	public NegativeSignupsTest Nelastname(String lname) {
		sendkeys(lastname,lname);
		return this;
	}
	public NegativeSignupsTest Neemail(String nemail) {
		sendkeys(email,nemail);
		return this;
	}
	public NegativeSignupsTest Nepass(String npass) {
		sendkeys(pass,npass);
		return this;
	}
	public NegativeSignupsTest Neconpass(String cpass) {
		sendkeys(conpass,cpass);
		return this;
	}
	public NegativeSignupsTest Nemobile(String nmobile) {
		sendkeys(mobile,nmobile);
		return this;
	}
	public NegativeSignupsTest Createbutton() throws InterruptedException {
		click(Createaccbutton);
		Thread.sleep(2000);
		String source1=driver.getPageSource();
		Thread.sleep(2000);
		if(source1.contains("Please enter")) {
			System.out.println("Negative create acc Test pass");
		}else {
			System.out.println("Negative create acc Test fail");
		}
		return this;
	}
}
