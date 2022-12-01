package class12_waitsHandling;

import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Class1 {
	
	public static void main(String[] args) {
		
		
		//page loading 
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		System.out.println("before page starts loading at  "+ new Date());

		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(3)); --timeout exception
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		System.out.println("after URL page loading at  "+ new Date());
	}

}
