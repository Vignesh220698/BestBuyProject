package pageP1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseP1.ProjectBaseP1;

public class CheckandPayment extends ProjectBaseP1{

	public CheckandPayment(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void CheAndpay() throws InterruptedException {

		driver.findElement(By.xpath("(//button[@class='c-button-unstyled top-four v-fw-medium'])[3]")).click();
		driver.findElement(By.xpath("//a[text()='Samsung']")).click();
		driver.findElement(By.xpath("(//a[text()='TV and home theater'])[2]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//button[@class='c-button c-button-primary c-button-sm c-button-block c-button-icon c-button-icon-leading add-to-cart-button'])[1]")).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[text()='Continue shopping']")).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='c-button-unstyled hamburger-menu-button']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[@class='c-button-unstyled hamburger-menu-flyout-list-item '])[1]")).click();

		driver.findElement(By.xpath("//button[text()='Major Kitchen Appliances']")).click();
		driver.findElement(By.xpath("(//a[text()='Refrigerators'])[1]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//a[@class='flex-image-inner-wrapper flex-fluid-image'])[1]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//button[@class='c-button c-button-primary c-button-sm c-button-block c-button-icon c-button-icon-leading add-to-cart-button'])[1]")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Continue shopping']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='gh-search-input']")).sendKeys("oneplus 11");
		driver.findElement(By.xpath("//button[@title='submit search']")).click();
		Thread.sleep(4000);
		Actions act= new Actions(driver);
		WebElement seedetail =driver.findElement(By.xpath("(//a[text()='See Details'])[1]"));
		
		act.moveToElement(seedetail).click().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//p[@title='256GB']")).click();
		
		Thread.sleep(5000);
		WebElement RefButton =driver.findElement(By.xpath("//span[text()='Questions & Answers']"));
		act.moveToElement(RefButton).perform();
		
		WebElement AddtoCart =driver.findElement(By.xpath("//button[@class='c-button c-button-primary c-button-lg c-button-block c-button-icon c-button-icon-leading add-to-cart-button']"));
      	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(AddtoCart));
		act.moveToElement(AddtoCart).click().perform();
		
		driver.findElement(By.xpath("//span[text()='Cart']")).click();
		Thread.sleep(3000);

		String sourcecart=driver.getPageSource();
		Thread.sleep(5000);
		if(sourcecart.contains("Samsung ")) {
			System.out.println("Item added to cart sucessfully");
		}else
		{
			System.out.println("Item  not added to cart sucessfully");
		}
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@class='c-close-icon c-modal-close-icon']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='btn btn-lg btn-block btn-primary']")).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='c-button c-button-secondary c-button-lg cia-guest-content__continue guest']")).click();
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//button[text()='Switch to delivery']")).click();
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Vignesh");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Vignesh");
		driver.findElement(By.xpath("//input[@id='street']")).sendKeys("Chennai");
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys("chennai");
		driver.findElement(By.xpath("//input[@id='zipcode']")).sendKeys("545432");

		WebElement state=driver.findElement(By.xpath("//select[@id='state']"));

		Select sel=new Select(state);
		sel.selectByVisibleText("TN");


		driver.findElement(By.xpath("//button[@class='c-button c-button-secondary c-button-md new-address-form__button']")).click();
try {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Keep Address as Entered']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='user.emailAddress']")).sendKeys("Vignesh@gmail.com");
		driver.findElement(By.xpath("//input[@id='user.phone']")).sendKeys("8765412345");
        Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn btn-lg btn-block btn-secondary']")).click();
}catch (Exception e) {
	System.out.println("Network failure");
}
		Thread.sleep(7000);

		String verify=driver.getPageSource();
		if(verify.contains("Please enter")) {

			System.out.println("Payment Sucessfull:Order placed");
		}else {
			System.out.println("Payment Failed:Order not placed");
		}

	}

}
