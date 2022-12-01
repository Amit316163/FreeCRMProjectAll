package testNG;

import org.testng.annotations.Test;

public class Class2_withPriority {
	
	@Test(priority = 0)
	public void login() {
		System.out.println("Login to the application");
	}
	@Test(priority = 1)
	public void homePage() {
		System.out.println("Verify the home page");
	}
	
	@Test(priority = 2)
	public void logout() {
		System.out.println("Logout from the application");
	}

}
