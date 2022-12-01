package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Class1_Annotations {

	//Annotations with sequence 

	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("Setup system property");
	}
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Launch the browser");
	}
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Enter the application url");
	}
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Login to the application");
	}
	@Test
	public void verifyHomePage()
	{
		System.out.println("Verify home page");
	}
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("Logout from application");
	}
	@AfterClass
	public void afterClass()
	{
		System.out.println("Delete all the cookies");
	}

	@AfterTest
	public void afterTest()
	{
		System.out.println("Generate the report");
	}
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("Close the browser");
	}
}

//@DataProvider @Parameters @Factory @Listeners 


