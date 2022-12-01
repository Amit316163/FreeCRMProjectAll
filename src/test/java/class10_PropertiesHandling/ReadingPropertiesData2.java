package class10_PropertiesHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadingPropertiesData2 {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		loginToHRM();
		

		
//		File file=new File("./src/test/resources/data/config.properties");
//		System.out.println(file.exists());//true
//		FileInputStream fis=new FileInputStream(file);
//		
//		Properties prop=new Properties();
//		prop.load(fis);
//		
//		String url=prop.getProperty("url");
//		System.out.println(url);
//		
//		String username=prop.getProperty("username");
//		System.out.println(username);
//		
//		String password=prop.getProperty("password");
//		System.out.println(password);
//		
//		//If key is not present then it will return a null value
//		String browserType=prop.getProperty("browserType");
//		System.out.println(browserType);
		
	
		
		
	}
	
	//Static way to pass the data(Hardcoded in script)
//	public static void loginToHRM() throws InterruptedException  {
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver =new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
//		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
//	}
	
	public static void loginToHRM() throws InterruptedException, IOException  {
		
		File file=new File("./src/test/resources/data/config.properties");
		FileInputStream fis=new FileInputStream(file);
		
		Properties prop=new Properties();
		prop.load(fis);
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(prop.getProperty("username"));
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	

}
