package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.beust.jcommander.Parameter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Class7_Parameters {

//Paramters in testNG
//based on use , you can pass the paramter like url,browsers etc
	//Suite level 
	//test level
	
	WebDriver driver;
	
	@Parameters("browserType")
	@BeforeTest
	public void launchBrowser(String browserType) {
		
		
		switch ( browserType) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver =new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver =new FirefoxDriver();
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver =new EdgeDriver();
			break;

		default:
			System.out.println("Please enter the proper browser type");
			break;
		}
		 
		driver.manage().window().maximize();
		
	}

	@Parameters("url")
	@Test
	public void loginValidation(String url) throws InterruptedException {
		
		driver.get(url);
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		
	}
	@Parameters("url")
	@Test
	public void loginAndLogoutValidation(String url) throws InterruptedException {
		
		driver.get(url);
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.close();

		
	}

}
