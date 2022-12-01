package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.beust.jcommander.Parameter;

import io.github.bonigarcia.wdm.WebDriverManager;


//what are the returns type of dataProvider
//Object[] ,Object[][]
//Iterator<Object> , Iterator<Object[]>
//Object- Any data type like predefined and userdefined 

public class Class8_DataProvider1 {



	//String[] type 
	@DataProvider
	public String[] testData1() {

		String[] data=new String[]
				{
						"username",
						"12345",

				};
		return data;
	}
	
	
	@Test(dataProvider = "testData1")
	public void loginValidation1(String s) throws InterruptedException {

		System.out.println(s);
	}
	
//=====================================================================================================

	//Integrer[] type 
	@DataProvider
	public Integer[] testData2() {

		Integer[] data=new Integer[]
				{
						5555,
						12345,
				};
		return data;
	}
	
	@Test(dataProvider = "testData2")
	public void loginValidation2(Integer i) throws InterruptedException {

		System.out.println(i);
	}

	
//==================================================================================================
	//Object[] type 
	@DataProvider
	public Object[] testData() {

		Object[] data=new Object[]
				{
						"username",
						12345,

				};
		return data;
	}


	

	
	@Test(dataProvider = "testData")
	public void loginValidation(Object ob) throws InterruptedException {

		System.out.println(ob);
	}


//===============================================================================================================//		

	//Object[][] type 
	@DataProvider
	public Object[][] login() {

		Object[][] data=new Object[][]
				{
			{"username","password"},
			{"number",34556}
				};
				return data;
	}
	@Test(dataProvider = "login")
	public void validate(Object[] ob)  {

		System.out.println(ob[0]+"  --- "+ob[1]);
	}

//===============================================================================================================//	

	//Object[][] type 
	@DataProvider
	public Object[][] login1() {

		Object[][] data=new Object[][]
				{
			{"admin","admin123"},
			{"demo","demo123"}
				};
				return data;
	}

	@Test(dataProvider = "login1")
	public void validate1(String user,String pass)  {

		System.out.println(user +"==="+pass);
	}

	
//===============================================================================================================//	
	
	
	//Object[][] type 
	@DataProvider
	public Object[][] login2() {

		Object[][] data=new Object[][]
				{
			{"admin","admin123"},
			{"demo","demo123"}
				};
				return data;
	}

	@Test(dataProvider = "login2")
	public void validate2(String user,String pass)  {

		System.out.println(user +"==="+pass);
	}
	
	
//===============================================================================================================//	
	
	
		//Object[][] type 
		@DataProvider
		public Object[][] login3() {

			return new Object[][]
					{
				{"admin","admin123"},
				{"demo","demo123"}
					};
					
		}

		@Test(dataProvider = "login3")
		public void validate3(String user,String pass)  {

			System.out.println(user +"==="+pass);
		}
		
//===============================================================================================================//	
		
		
			//Object[][] type 
			@DataProvider
			public Object[][] login4() {

				return new Object[][]
						{
					{"admin","admin123","admin077","123"},
					{"demo","demo123"},
					{"users"},
					{"test","test2","test3"}
						};
						
			}

			@Test(dataProvider = "login4")
			public void validate4(String [] s)  {
				
				for(int i=0;i<s.length;i++) {
					System.out.println(s[i]);
				}
				System.out.println("============");
			}
}
