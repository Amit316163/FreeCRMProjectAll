package class10_PropertiesHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadingPropertiesData5 {

	WebDriver driver;
	
	PropertiesDataHandling5 prop=new PropertiesDataHandling5();

	public static void main(String[] args) throws InterruptedException, IOException {

		ReadingPropertiesData5 read=new ReadingPropertiesData5();
		 read.launchBrowser();
		 read.loginToHRM();

	}


	public  void launchBrowser() throws IOException {


		String browserName=prop.getvalue("browserType");

		if(browserName.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver =new ChromeDriver();

		}else if(browserName.equalsIgnoreCase("Edge")){
			WebDriverManager.edgedriver().setup();
			driver =new EdgeDriver();

		}else if(browserName.equalsIgnoreCase("Firefox")){
			WebDriverManager.firefoxdriver().setup();
			driver =new FirefoxDriver();
		} else {
			System.out.println("Please define the browser name");
		}

	}	

	public  void loginToHRM() throws InterruptedException, IOException  {


		driver.get(prop.getvalue("url"));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(prop.getvalue("username"));
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(prop.getvalue("password"));
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}




}
