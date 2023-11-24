package utilityP1;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtenDreportBestBuy {
	
	public static ExtentReports getreportP1() {
		ExtentSparkReporter reports = new ExtentSparkReporter("./ReportBestBuy/reportBestBuy.html");
		reports.config().setReportName("BestBuy Report");
		reports.config().setDocumentTitle("BestBuy Test");
		
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(reports);
		
		return extent;

}
}