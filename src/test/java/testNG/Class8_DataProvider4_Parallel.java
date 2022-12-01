package testNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;




public class Class8_DataProvider4_Parallel {
	
	//we can use parallel as true to run test cases parallel but when we have 100 type of data then 
	//it will open 100 browsers at a time then it is tough to handles the browser through our system resource
	///there will be performance issue
	//Now we can use testNG.xml file to handle this through thread
	//if run from test class then it will run all parallel but from testNG.xml it will run through thread
	@DataProvider(name="login",parallel = true)
	public Object[][] data() {

		return new Object[][] {
			{"admin","admin123"},
			{"demo","demo123"},
			{"asingh","welcome@123"},
			{"xyz","abc@123"}
		};
	}
	
	
	@Test(dataProvider="login")
	public void loginValidation(String userName,String password) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(userName);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		driver.close();
	}
}
