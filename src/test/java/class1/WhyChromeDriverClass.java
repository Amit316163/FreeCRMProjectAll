package class1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WhyChromeDriverClass {
	
	public static void main(String[] args) {
		ChromeDriver driver=null;;
		EdgeDriver driver1=null;;
		FirefoxDriver driver2=null;;
		String browserName="Chrome";
		
		if(browserName.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\Online_Selenium_Class\\OnlineBatch\\SeleniumJars\\chromedriver_win32\\chromedriver.exe");
			 driver =new ChromeDriver();
			
			//driver.get("");
			 //benfits
			// driver.executeScript(null, args)
			// driver.getScreenshotAs(null)
			
		}else if(browserName.equalsIgnoreCase("Edge")){
			System.setProperty("webdriver.chrome.driver", "D:\\Online_Selenium_Class\\OnlineBatch\\SeleniumJars\\chromedriver_win32\\chromedriver.exe");
			 driver1 =new EdgeDriver();
			//driver.get("");
			
		}else if(browserName.equalsIgnoreCase("Firefox")){
			
			System.setProperty("webdriver.chrome.driver", "D:\\Online_Selenium_Class\\OnlineBatch\\SeleniumJars\\chromedriver_win32\\chromedriver.exe");
			 driver2 =new FirefoxDriver();
			//driver.get("");
		} else {
			System.out.println("Please define the browser name");
		}
		driver.get("");;
		driver1.get("");
		driver2.get("");
		
	}

}
