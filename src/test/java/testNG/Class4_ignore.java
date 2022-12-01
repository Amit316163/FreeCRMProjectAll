package testNG;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

@Ignore
public class Class4_ignore {
	
	//@Ignore you can put on test method and also on class level
	
	@Ignore
	@Test(enabled=true)
	public void run1() {
		System.out.println("Test ABC run successfully");
	}
	//@Ignore
	@Test()
	public void run2() {
		System.out.println("Test XYZ run successfully");
	}
	//@Ignore
	@Test()
	public void run3() {
		System.out.println("gdgdfgd");
	
	}
}
