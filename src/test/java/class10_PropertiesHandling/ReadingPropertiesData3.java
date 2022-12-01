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

public class ReadingPropertiesData3 {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, IOException {

		launchBrowser();
		loginToHRM();

	}


	public static void launchBrowser() throws IOException {

		//String browserName="Chrome";
		
		//below properties code is same here and also in other method it is same
		//can we remove it duplicate of code
		File file=new File("./src/test/resources/data/config.properties");
		FileInputStream fis=new FileInputStream(file);
		
		Properties prop=new Properties();
		prop.load(fis);
		String browserName=prop.getProperty("browserType");

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
	
public static void loginToHRM() throws InterruptedException, IOException  {
		
		File file=new File("./src/test/resources/data/config.properties");
		FileInputStream fis=new FileInputStream(file);
		
		Properties prop=new Properties();
		prop.load(fis);
		
	
		driver.get(prop.getProperty("url"));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(prop.getProperty("username"));
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}




}
