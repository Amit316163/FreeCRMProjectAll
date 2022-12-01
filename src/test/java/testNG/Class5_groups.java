package testNG;

import org.testng.annotations.Test;

public class Class5_groups {
	
	@Test(groups ="smoke" )
	public void run1() {
		System.out.println("Run  smoke test  case 1");
	}
	@Test(groups ="sanity" )
	public void run2() {
		System.out.println("Run sanity test case 2");
	}
	@Test(groups ="smoke" )
	public void run3() {
		System.out.println("Run smoke test case 3");
	}
	@Test (groups ="sanity" )
	public void run4() {
		System.out.println("Run sanity test case 4");
	}
	@Test(groups ="smoke" )
	public void run5() {
		System.out.println("Run smoke test case 5");
	}
	@Test(groups ="regression" )
	public void run6() {
		System.out.println("Run  regression test case 6");
	}
	
	
}
