package class11_DesiredCapabilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Class1 {
	
	
	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		
		// this will work before 4 version 
//		DesiredCapabilities capable=new DesiredCapabilities();
//		capable.setAcceptInsecureCerts(true);
		
		//Selenium 4
		ChromeOptions option=new ChromeOptions();
		option.setAcceptInsecureCerts(true);
		
		option.addArguments("--start-maximized ");
		option.addArguments("--incognito");
		
		WebDriver driver =new ChromeDriver(option);
		driver.get("https://cacert.com/");
	}

}
