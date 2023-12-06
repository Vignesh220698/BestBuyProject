package pageP1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import baseP1.ProjectBaseP1;

public class LinkverifyinHomepage extends ProjectBaseP1{

	public LinkverifyinHomepage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver,this);		
	}
	public void LinksinHM() throws InterruptedException {
		List<WebElement>links=driver.findElements(By.tagName("a"));

		int size=links.size();
		System.out.println("Total Links="+size);

		for(WebElement obj:links) {
			String link1= obj.getText();
			String link2= obj.getAttribute("href");
			System.out.println(link2 +"<--Belongs to-->"+link1);			
		}

		Thread.sleep(4000);

		WebElement Link1=driver.findElement(By.xpath("//a[text()='Major Appliances']"));
		Actions act = new Actions(driver);
		act.moveToElement(Link1).click().perform();

		Thread.sleep(3000);
		String link1=driver.getPageSource();
		if(link1.contains("Major Appliance ")) {
			System.out.println("Major Application link verified");
		}else {
			System.out.println("Major Application link  not verified");
		}

		driver.navigate().back();
		Thread.sleep(2000);
		WebElement Link2=driver.findElement(By.xpath("//a[text()='Apple']"));

		act.moveToElement(Link2).click().perform();

		Thread.sleep(3000);
		String link2=driver.getPageSource();
		if(link2.contains("Apple")) {
			System.out.println("Apple link verified");
		}else {
			System.out.println("Apple ink  not verified");
		}

		driver.navigate().back();
		Thread.sleep(2000);
		WebElement Link3=driver.findElement(By.xpath("//a[text()='Electric Transportation']"));

		act.moveToElement(Link3).click().perform();

		Thread.sleep(3000);
		String link3=driver.getPageSource();
		if(link3.contains("Electric Transportation")) {
			System.out.println("Electric Transportation link verified");
		}else {
			System.out.println("Electric Transportation link  not verified");
		}

		driver.navigate().back();
		Thread.sleep(2000);
		WebElement Link4=driver.findElement(By.xpath("//a[text()='PC Gaming']"));

		act.moveToElement(Link4).click().perform();

		Thread.sleep(3000);
		String link4=driver.getPageSource();
		if(link4.contains("PC Gaming")) {
			System.out.println("PC Gaming link verified");
		}else {
			System.out.println("PC Gaming link  not verified");
		}
		
		
		driver.navigate().back();
		Thread.sleep(2000);
		WebElement Link5=driver.findElement(By.xpath("//a[text()='Accessibility']"));

		act.moveToElement(Link5).click().perform();

		Thread.sleep(3000);
		String link5=driver.getPageSource();
		if(link5.contains("Accessibility")) {
			System.out.println("Bottom link:Accesibility: link verified");
		}else {
			System.out.println("Bottom link:Accesibility: link failed");
		}
		
		

	}
}