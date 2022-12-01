package extentReport;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Listener implements ITestListener{
	
	
ExtentReports extent;
ExtentTest test;
	
	@BeforeSuite
	public void startReport() {
		
		 extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("./SeleniumPractice/test-output/AmitExtentReport.html");
		extent.attachReporter(spark);
	}
	

	@AfterSuite
	public void generateReport() {
		extent.flush();
	}
	
	
	
	@Override
	public void onTestStart(ITestResult result) {

		System.out.println("I am onTestStart method");
	}





	@Override
	public void onTestSuccess(ITestResult result) {

		System.out.println("I am onTestSuccess method");
	}





	@Override
	public void onTestFailure(ITestResult result) {

		System.out.println("I am onTestFailure method");
	}





	@Override
	public void onTestSkipped(ITestResult result) {

		System.out.println("I am onTestSkipped method");
	}





	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

		System.out.println("I am onTestFailedButWithinSuccessPercentage method");

		
	}





	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
		System.out.println("I am onTestFailedWithTimeout method");
	}





	@Override
	public void onStart(ITestContext context) {
		
		System.out.println("I am onStart method");
	}





	@Override
	public void onFinish(ITestContext context) {
		System.out.println("I am onFinish method");
	}





	
	

}
