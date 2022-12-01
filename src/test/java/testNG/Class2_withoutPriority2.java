package testNG;

import org.testng.annotations.Test;

public class Class2_withoutPriority2 {
	
	@Test
	public void login() {
		System.out.println("Login to the application");
	}
	@Test
	public void homePage() {
		System.out.println("Verify the home page");
	}
	
	@Test
	public void logout() {
		System.out.println("Logout from the application");
	}

}
