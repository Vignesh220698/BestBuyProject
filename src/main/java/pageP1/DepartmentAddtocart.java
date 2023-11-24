package pageP1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import baseP1.ProjectBaseP1;

public class DepartmentAddtocart extends ProjectBaseP1{
	
	public DepartmentAddtocart(WebDriver driver ){
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	public void Deptaddtocart() throws InterruptedException {
		
		driver.findElement(By.xpath("(//button[@class='c-button-unstyled hamburger-menu-flyout-list-item '])[1]")).click();
		
		driver.findElement(By.xpath("//button[text()='Major Kitchen Appliances']")).click();
		driver.findElement(By.xpath("(//a[text()='Refrigerators'])[1]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//a[@class='flex-image-inner-wrapper flex-fluid-image'])[1]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//button[@class='c-button c-button-primary c-button-sm c-button-block c-button-icon c-button-icon-leading add-to-cart-button'])[1]")).click();
		driver.navigate().back();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Cart']")).click();
		Thread.sleep(3000);
		
		String sourcecart=driver.getPageSource();
		Thread.sleep(5000);
		if(sourcecart.contains("Door Smart Refrigerator")) {
			System.out.println("Item added to cart sucessfully");
		}else
		{
			System.out.println("Item  not added to cart sucessfully");
		}
	}
}
