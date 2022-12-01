package testNG;

import org.testng.annotations.Test;

public class Class3_withDependsOnMethods_Priority {
	//if you try to combine priority and  dependsOnMethods then still priority will take first place 
	
	@Test(priority=1)
	public void login() {
		System.out.println("Login to the application");
		System.out.println(10/0);
	}
	@Test(priority=3,dependsOnMethods = "login")
	public void homePage() {
		System.out.println("Verify the home page");
	}
	
	@Test(priority=4,dependsOnMethods = {"homePage","login"})
	public void contactUSPage() {
		System.out.println("Verify the contact page");
	}
	
	@Test(priority=2,dependsOnMethods = "login")
	public void logout() {
		System.out.println("Logout from the application");
	}

}
