package pageP1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import baseP1.ProjectBaseP1;

public class NegativeSigninTest extends ProjectBaseP1{
	
	public NegativeSigninTest(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void neSigin() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Vignesh");
		driver.findElement(By.xpath("//button[text()='Create an Account']")).click();
		Thread.sleep(3000);
		String source1=driver.getPageSource();
		
		if(source1.contains("Please enter your first name.")) {
			System.out.println("Negative Signin pass");
		}else {
			System.out.println("Negative Signin fail");
		}
	}

}
