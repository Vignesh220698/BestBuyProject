package pageP1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseP1.ProjectBaseP1;


public class CreateAccountPage extends ProjectBaseP1 {

	@FindBy(xpath = "//input[@id='email']")
	WebElement Remail;

	@FindBy(xpath = "(//input[@type='password'])[1]")
	WebElement Rpass;

	@FindBy(xpath = "(//input[@type='password'])[2]")
	WebElement Rconpass;

	public CreateAccountPage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver,this);
	}

	


	public CreateAccountPage regMailid(String mail) {

		sendkeys(Remail, mail);
		return this;

	}

	public CreateAccountPage regpass(String pass) {
		sendkeys(Rpass, pass);
		return this;
	}

	public CreateAccountPage regconfpass(String pass) {
		sendkeys(Rconpass, pass);
		return this;
	}
	
	public void AcccreatePage() {
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Vignesh");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("s");
		//		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Vignesh@gmail.com");
		//		driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("Vignesh@123");
		//		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("Vignesh@123");
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("864564532");
		driver.findElement(By.xpath("//button[text()='Create an Account']")).click();
	}

}


















//	@FindBy(xpath = "//input[@id='firstName']")
//	WebElement firstname;
//	
//	@FindBy(xpath = "//input[@id='lastName']")
//	WebElement lastname;
//	
//	
//	@FindBy(xpath = "//input[@id='email']")
//	WebElement mailid;
//	
//	
//	@FindBy(xpath  = "(//input[@type='password'])[1]")
//	WebElement password;
//	
//	
//	@FindBy(xpath = "(//input[@type='password'])[2]")
//	WebElement confirmpassword;
//	
//	@FindBy(xpath  = "//input[@id='phone']")
//	WebElement mobilenumber;
//	
//	@FindBy(xpath =  "//button[text()='Create an Account']")
//	WebElement createaccbutton;
//	
//	public CreateAccountPage(WebDriver driver) {
//		this.driver= driver;
//		PageFactory.initElements(driver,this);		
//	}
//	
//	public  CreateAccountPage signupfirstname(String Fname) {
//		   
//		sendkeys(firstname , Fname);
//		   return this;
//		   
//	   }
//	
//	public  CreateAccountPage signupLastname(String Lname) {
//		   
//		   sendkeys(lastname , Lname);
//		   return this;
//		   
//	   }
//	public  CreateAccountPage signupMailId(String mail) {
//		   
//		   sendkeys(mailid , mail);
//		   return this;
//		   
//	   }
//	public  CreateAccountPage signupPassword(String pass) {
//		   
//		   sendkeys(password , pass);
//		   return this;
//		   
//	   }
//	public  CreateAccountPage signupConfirmpassword(String conformpass) {
//		   
//		sendkeys(confirmpassword , conformpass);
//		   return this;
//		   
//	   }
//	public  CreateAccountPage signupMobileNumber(String mobile) {
//		   
//		sendkeys(mobilenumber , mobile);
//		   return this;
//		   
//	   }
//	public  CreateAccountPage signupCreateAccButton() {
//		   
//		click(createaccbutton);
//		   return this;
//		   
//	   }


