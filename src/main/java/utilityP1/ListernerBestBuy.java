package utilityP1;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import baseP1.ProjectBaseP1;

public class ListernerBestBuy  extends ProjectBaseP1  implements ITestListener{
	
	ExtentTest test;
	ExtentReports extent=ExtenDreportBestBuy.getreportP1();
	

	public void onTestStart(ITestResult result) {
		System.out.println("Test Start");
		
		test=extent.createTest(result.getMethod().getMethodName());
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Sucess");
		
		test.log(Status.PASS, "Test Pass");
		String filepath = null;
		try {
			filepath=getScreenShotP1(result.getMethod().getMethodName());
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.addScreenCaptureFromPath(filepath,result.getMethod().getMethodName());
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Test fail");
		test.fail(result.getThrowable());
		
		String filepath = null;
		try {
			filepath=getScreenShotP1(result.getMethod().getMethodName());
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.addScreenCaptureFromPath(filepath,result.getMethod().getMethodName());
		
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("Test skip");
	}

	
	public void onFinish(ITestContext context) {
		
		extent.flush();
		System.out.println("Test Finish");
	}

}
