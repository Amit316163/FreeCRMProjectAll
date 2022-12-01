package extentReport;

import java.awt.image.RescaleOp;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Listener2 implements ITestListener{
	
	
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

	test.info("I am onTestStart method "+result.getName());
	}


	@Override
	public void onTestSuccess(ITestResult result) {

		test.log(Status.PASS, "Test case passed is "+result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {

		System.out.println("I am onTestFailure method");
		test.log(Status.FAIL, "Test case failed is "+result.getName());
		test.log(Status.FAIL, "Test case failed is "+result.getThrowable());
	}


public void captureScreenShotForFailure(WebDriver driver) throws IOException {
	
	TakesScreenshot ts=(TakesScreenshot)driver;
	File screenshotFile=ts.getScreenshotAs(OutputType.FILE);
	
	SimpleDateFormat simple=new SimpleDateFormat("yyMMddHHmmss");
	String dateFormat=simple.format(new Date());
	
	FileUtils.copyFile(screenshotFile, new File("./CaptureScreenshot/Screenshot_"+dateFormat+".png"));
}


	@Override
	public void onTestSkipped(ITestResult result) {

		test.log(Status.PASS, "Test case skipped is "+result.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		test.info("I am onTestFailedButWithinSuccessPercentage method "+result.getName());

	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
		test.info("I am onTestFailedWithTimeout method "+result.getName());
	}


	@Override
	public void onStart(ITestContext context) {
		
		test.info("I am onStart method "+context.getName());
	}

	@Override
	public void onFinish(ITestContext context) {
		test.info("I am onFinish method "+context.getName());
	}


}
