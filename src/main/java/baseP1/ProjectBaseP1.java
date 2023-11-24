package baseP1;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import utilityP1.UtilitiyP1;

public class ProjectBaseP1 extends UtilitiyP1 {
	
	
	@Parameters({"url","browser"})
	@BeforeMethod
	public void Launcbrowser(String url,String browser ) {
		launchbrowser(url,browser);
	}
	

	
	@DataProvider(name="getdata")
	public Object[][] Retrivedata() throws IOException {
		Object[][] data=ReadExcel(ExcelFile);
		return data;
	}
	
	@AfterMethod
    public void close() {
		
	    closebrowser();
	}


}
