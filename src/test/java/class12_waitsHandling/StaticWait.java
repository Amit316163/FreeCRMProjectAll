package class12_waitsHandling;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaticWait {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		System.out.println("before page load start  "+ new Date());
		Thread.sleep(5000);
			
			driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
			System.out.println("before page load start  "+ new Date());
		
			driver.findElement(By.id("display-other-button")).click();
			//without hardcoded

//			boolean enabledButton=driver.findElement(By.xpath("//button[text()='Enabled']")).isDisplayed();
//			System.out.println(enabledButton);
			
			//with hardcoded
			Thread.sleep(10000);
			boolean enabledButton=driver.findElement(By.xpath("//button[text()='Enabled']")).isDisplayed();
			System.out.println(enabledButton);

		
	}
	
}
