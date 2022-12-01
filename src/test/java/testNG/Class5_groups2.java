package testNG;

import org.testng.annotations.Test;
@Test(groups = "all")
public class Class5_groups2 {
	
	@Test(groups ={"smoke","sanity"} )
	public void run7() {
		System.out.println("Run smoke&sanity test case 7");
	}
	@Test(groups ="sanity" )
	public void run8() {
		System.out.println("Run sanity test case 8");
	}
	@Test(groups ="smoke" )
	public void run9() {
		System.out.println("Run smoke test case 9");
	}
	@Test (groups ={"sanity","functional"} )
	public void run10() {
		System.out.println("Run sanity&functional test case 10");
	}
	
	
	
}
