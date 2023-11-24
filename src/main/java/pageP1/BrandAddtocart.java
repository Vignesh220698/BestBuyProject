package pageP1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import baseP1.ProjectBaseP1;

public class BrandAddtocart extends ProjectBaseP1{
	
	public BrandAddtocart(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
public void BrAddtocart() throws InterruptedException {
	
	driver.findElement(By.xpath("(//button[@class='c-button-unstyled top-four v-fw-medium'])[3]")).click();
	driver.findElement(By.xpath("//a[text()='Samsung']")).click();
	driver.findElement(By.xpath("(//a[text()='TV and home theater'])[2]")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("(//button[@class='c-button c-button-primary c-button-sm c-button-block c-button-icon c-button-icon-leading add-to-cart-button'])[1]")).click();

	Thread.sleep(3000);
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

}

}
