package pageP1;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseP1.ProjectBaseP1;

public class SearchAddtoCart extends ProjectBaseP1{

	public SearchAddtoCart(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver,this);		
	}



	public void AddtoCartm() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='gh-search-input']")).sendKeys("oneplus 11");
		driver.findElement(By.xpath("//button[@title='submit search']")).click();
		Thread.sleep(4000);
		Actions act= new Actions(driver);
		WebElement seedetail =driver.findElement(By.xpath("(//a[text()='See Details'])[1]"));

		act.moveToElement(seedetail).click().perform();


		Thread.sleep(3000);
		try {
		driver.findElement(By.xpath("//p[@title='256GB']")).click();
		}catch (Exception e) {
			System.out.println("Variant not found");
		}

		Thread.sleep(5000);
		WebElement RefButton =driver.findElement(By.xpath("//span[text()='Questions & Answers']"));
		act.moveToElement(RefButton).perform();
		Thread.sleep(6000);

	driver.findElement(By.xpath("//button[@class='c-button c-button-primary c-button-lg c-button-block c-button-icon c-button-icon-leading add-to-cart-button']")).click();	

//		WebElement AddtoCart =driver.findElement(By.xpath("//button[@class='c-button c-button-primary c-button-lg c-button-block c-button-icon c-button-icon-leading add-to-cart-button']"));
//      WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
//		wait.until(ExpectedConditions.elementToBeClickable(AddtoCart));
//		act.moveToElement(AddtoCart).click().perform();

		WebElement AddtoCarticon =driver.findElement(By.xpath("//a[text()='Go to Cart']"));
		WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait1.until(ExpectedConditions.elementToBeClickable(AddtoCarticon));
		act.moveToElement(AddtoCarticon).click().perform();
		
		
		Thread.sleep(5000);

//		driver.navigate().back();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//span[text()='Cart']")).click();
//		Thread.sleep(5000);

		String sourcecart=driver.getPageSource();
		Thread.sleep(5000);
		if(sourcecart.contains("OnePlus - 11 5G")) {
			System.out.println("Item added to cart sucessfully");
		}else
		{
			System.out.println("Item  not added to cart sucessfully");
		}


	}



}
