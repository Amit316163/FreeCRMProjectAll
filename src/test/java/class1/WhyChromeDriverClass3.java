package class1;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class WhyChromeDriverClass3 {
	
	public static void main(String[] args) {
		SearchContext driver=null;
		String browserName="Chrome";
		RemoteWebDriver driver1=null;
		
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
	//	driver.get("");
		
		driver.findElement(null);
		
	}

}
