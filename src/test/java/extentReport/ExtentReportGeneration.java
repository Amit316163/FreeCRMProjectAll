package extentReport;




import org.testng.annotations.Listeners;
import org.testng.annotations.Test;



@Listeners(Listener.class)
public class ExtentReportGeneration {
	
	
	@Test(priority = 1)
	public void method1() {
		
		System.out.println("Login with username and password");
	}
	
	@Test(priority = 2)
	public void method2() {
		
		System.out.println("logged in successfully and validate the HomePage details with title");
	}
	
	@Test(priority = 3)
	public void method3() {
		
		System.out.println("Logout from the application");
	}
	
	

}
