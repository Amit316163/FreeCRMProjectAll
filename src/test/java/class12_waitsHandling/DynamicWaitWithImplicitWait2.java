package class12_waitsHandling;

import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicWaitWithImplicitWait2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		System.out.println("start at "+new Date());
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println("start at "+new Date());
		
		//it will throw exception for below statement 
		//we have to use static wait if not used then it will throw exception 
		
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
//		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//		System.out.println("stop at "+new Date());
		
		//using implicit wait for element to be loaded
		
		//Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		System.out.println("stop at "+new Date());
		
		
		//dont merge dymanic and static wait  in above code itself--line 35
		
		
		
		



	}

}
