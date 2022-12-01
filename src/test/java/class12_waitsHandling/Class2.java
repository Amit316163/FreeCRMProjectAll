package class12_waitsHandling;

import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Class2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		//Implicit wait
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		System.out.println("before page starts loading at  "+ new Date());

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		//Without implicit -NoSuchElement Exception thrown 
		//With implicitwait it not throw any exception
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		System.out.println("after URL page loading at  "+ new Date());
		
		//Thread.sleep(3000);-static wait
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		System.out.println("after click on login page loading at  "+ new Date());
	}

}
