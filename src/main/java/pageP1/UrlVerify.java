package pageP1;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import baseP1.ProjectBaseP1;


public class UrlVerify extends ProjectBaseP1 {



	public UrlVerify(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver,this);		
	}
	public void urlcheck() throws InterruptedException {


		String url= driver.getCurrentUrl();

		String Actual= url;
		String Excepted="https://www.bestbuy.com/";
		Assert.assertEquals(Actual,Excepted);

		System.out.println("Url matches : Link is not broken");
		
		try {
            URL urlobj = new URL(url);
            HttpURLConnection connection = (HttpURLConnection) urlobj.openConnection();
            
            int statusCode = connection.getResponseCode();
            System.out.println("Status Code: " + statusCode);
            
            String statusMessage = connection.getResponseMessage();
            System.out.println("Status Message: " + statusMessage);
            
            if (statusCode == HttpURLConnection.HTTP_OK) {
                System.out.println("The URL is reachable.");
            } else {
                System.out.println("There was an issue with the URL.");
            }

            connection.disconnect();
        } catch (IOException e) {
            e.printStackTrace();
        }

//		try {
//			URL urlObj = new URL(url);
//			HttpURLConnection connection = (HttpURLConnection) urlObj.openConnection();
//
//			connection.setRequestMethod("head");
//
//			int statusCode = connection.getResponseCode();
//
//			if (statusCode == 404) {
//				System.out.println("The URL " + url + " is broken, returning a 404 status code.");
//			} else {
//				System.out.println("The URL " + url + " is valid with status code: " + statusCode);
//			}
//
//			connection.disconnect();
//
//		} catch (IOException e) {
//			System.out.println("Error checking the URL: " + e.getMessage());
//		}


	}

}
