package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {

	public static ExtentReports getReportInstance() {

		ExtentSparkReporter sparkReporter = new ExtentSparkReporter("test-output/ExtentReport.html");

		sparkReporter.config().setReportName("Galaxy AI Automation Report");
		sparkReporter.config().setDocumentTitle("Automation Test Results");

		ExtentReports extent = new ExtentReports();
		extent.attachReporter(sparkReporter);

		extent.setSystemInfo("Tester", "Dipali");
		extent.setSystemInfo("Framework", "Selenium + TestNG");

		return extent;
	}

	// TODO Auto-generated method stub

}
