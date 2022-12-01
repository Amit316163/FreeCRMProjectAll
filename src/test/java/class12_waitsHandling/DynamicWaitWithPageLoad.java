package class12_waitsHandling;

import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicWaitWithPageLoad {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		System.out.println("before page starts loading at  "+ new Date());
		//In selenium, by default it is set to 0 (which equates to an infinite timeout)

//		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(1));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		
		System.out.println("page stops loading  at "+ new Date());
		
		
		//for define time if page loaded then it is okay 
		//if page not loaded successfully then get an TimeoutException




	}

}
