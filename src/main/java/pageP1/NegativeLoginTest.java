package pageP1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import baseP1.ProjectBaseP1;

public class NegativeLoginTest  extends ProjectBaseP1{
	
	public NegativeLoginTest(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
}
	
	public void NeLogin() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
String source1=driver.getPageSource();
		
		if(source1.contains("Please enter a valid email address.")) {
			System.out.println("Negative Login pass");
		}else {
			System.out.println("Negative Login fail");
		}
	}
}