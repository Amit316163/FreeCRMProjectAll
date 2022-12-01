package testNG;

import org.testng.annotations.Test;

public class Class4 {
	
	@Test(description="my description of test case run1",enabled = false)
	public void run1() {
		System.out.println("Test ABC run successfully");
	}
	
	@Test(invocationCount = 5)
	public void run2() {
		System.out.println("Test XYZ run successfully");
	}
	
	@Test(expectedExceptions = ArithmeticException.class)
	public void run3() {
		System.out.println("gdgdfgd");
		System.out.println("Exception "+10/0);
	
	}
}
