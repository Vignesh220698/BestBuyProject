package pageP1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseP1.ProjectBaseP1;

public class HomepageP1 extends ProjectBaseP1{


	@FindBy(xpath ="//span[text()='Account']")
	WebElement accountbutton;

	@FindBy(xpath ="//a[text()='Sign In']")
	WebElement SignButton;

	@FindBy(xpath ="//a[text()='Create Account']")
	WebElement createaccountbutton;
	
	
	
	public HomepageP1(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver,this);		
	}
	
	public CreateAccountPage createaccount() throws InterruptedException{
		
		Thread.sleep(7000);
		click(accountbutton);
		click(createaccountbutton);
		return new CreateAccountPage(driver);

	}

	public SigninPageP1 signin() throws InterruptedException{
		Thread.sleep(7000);
		click(accountbutton);
		click(SignButton);
		
		return new SigninPageP1(driver);

	}
	public   LinkverifyinHomepage link(){
		
		return new LinkverifyinHomepage(driver);

	}
	
public   TitleVerifyHomepage Title(){
		
		return new TitleVerifyHomepage(driver);

	}

public  SearchAddtoCart SAddcart(){
	
	return new SearchAddtoCart(driver);

}
public DepartmentAddtocart  DAddcart(){
	
	driver.findElement(By.xpath("//button[@class='c-button-unstyled hamburger-menu-button']")).click();
	return new DepartmentAddtocart(driver) ;

}

public BrandAddtocart  BAddcart(){
	
	driver.findElement(By.xpath("//button[@class='c-button-unstyled hamburger-menu-button']")).click();
	return new BrandAddtocart(driver) ;

}

public CheckandPayment Checkout(){
	
	driver.findElement(By.xpath("//button[@class='c-button-unstyled hamburger-menu-button']")).click();
	return new CheckandPayment(driver);

}

    public NegativeSigninTest Negsignup() throws InterruptedException {
    	Thread.sleep(7000);
    	click(accountbutton);
		click(createaccountbutton);
    	
    	return new NegativeSigninTest(driver);
    }

 public NegativeLoginTest Neglogin() throws InterruptedException {
	 Thread.sleep(7000);
	 click(accountbutton);
		click(SignButton);
    	
	 return new NegativeLoginTest(driver);
    }

 public NegativeCheckoutTest Negcheckout() {
	 
	 return new NegativeCheckoutTest(driver);
 	
 }


}
