package pageP1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import baseP1.ProjectBaseP1;

public class TitleVerifyHomepage extends ProjectBaseP1{

	public TitleVerifyHomepage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver,this);		
	}

	public void verifytitle() throws InterruptedException {
		driver.findElement(By.xpath("//a[text()='Black Friday Deals']")).click();

		String title=driver.getTitle();

		if(title.contains("Black Friday")) {
			System.out.println("Black Friday title verified");
		}else {
			System.out.println("Black Friday title  not verified");
		}
         Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Deal of the Day']")).click();

		String title2=driver.getTitle();

		if(title2.contains("Deal of the Day")) {
			System.out.println("Deal of the Day title verified");
		}else {
			System.out.println("Deal of the Day title  not verified");
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[text()='My Best Buy Memberships'])[1]")).click();

		String title3=driver.getTitle();

		if(title3.contains("My Best Buy Memberships")) {
			System.out.println("My Best Buy Memberships title verified");
		}else {
			System.out.println("My Best Buy Memberships title  not verified");
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Credit Cards']")).click();

		String title4=driver.getTitle();
		Thread.sleep(2000);
		if(title4.contains("Credit Cards")) {
			System.out.println("Credit Cards title verified");
		}else {
			System.out.println("Credit Cards title  not verified");
		}

	}

}
