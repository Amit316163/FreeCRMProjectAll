package class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WhyChromeDriverClass2 {
	
	public static void main(String[] args) {
		WebDriver driver=null;
		String browserName="Chrome";
		
		if(browserName.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\Online_Selenium_Class\\OnlineBatch\\SeleniumJars\\chromedriver_win32\\chromedriver.exe");
			 driver =new ChromeDriver();
			//driver.get("");
			
		}else if(browserName.equalsIgnoreCase("Edge")){
			System.setProperty("webdriver.chrome.driver", "D:\\Online_Selenium_Class\\OnlineBatch\\SeleniumJars\\chromedriver_win32\\chromedriver.exe");
			 driver =new EdgeDriver();
			//driver.get("");
			
		}else if(browserName.equalsIgnoreCase("Firefox")){
			
			System.setProperty("webdriver.chrome.driver", "D:\\Online_Selenium_Class\\OnlineBatch\\SeleniumJars\\chromedriver_win32\\chromedriver.exe");
			 driver =new FirefoxDriver();
			//driver.get("");
		} else {
			System.out.println("Please define the browser name");
		}
		driver.get("");
		driver.get("");
		driver.get("");
		
		//below method will not present in webdriver
		// driver.executeScript(null, args)
		// driver.getScreenshotAs(null)
		
	}

}
