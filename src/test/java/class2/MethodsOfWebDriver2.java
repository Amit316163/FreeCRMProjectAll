package class2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MethodsOfWebDriver2 {


	public static void main(String[] args) throws InterruptedException {


		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//How to launch the url
				driver.get("https://google.com");
		
		Options option=driver.manage();
		
		//Pageload timeouts and implicit wait 
		option.deleteAllCookies();
		Timeouts time=option.timeouts();
		time.pageLoadTimeout(Duration.ofSeconds(2000));
		time.implicitlyWait(Duration.ofSeconds(2000));
		
		//Browser window handle lime maximize,fullscreen and so on
		
		Window win=option.window();//default (1050, 652)
		win.maximize();
		Thread.sleep(2000);
		win.fullscreen();
		Thread.sleep(2000);
		win.minimize();
		Thread.sleep(2000);
		
		
	
		
		

		

		

	}

}
