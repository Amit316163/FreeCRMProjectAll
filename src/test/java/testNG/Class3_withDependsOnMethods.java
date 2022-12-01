package testNG;

import org.testng.annotations.Test;

public class Class3_withDependsOnMethods {
	
	
	@Test()
	public void login() {
		System.out.println("Login to the application");
		System.out.println(10/0);
	}
	@Test(dependsOnMethods = "login")
	public void homePage() {
		System.out.println("Verify the home page");
	}
	
	@Test(dependsOnMethods = {"homePage","login"})
	public void contactUSPage() {
		System.out.println("Verify the contact page");
	}
	
	@Test()
	public void logout() {
		System.out.println("Logout from the application");
	}

}
