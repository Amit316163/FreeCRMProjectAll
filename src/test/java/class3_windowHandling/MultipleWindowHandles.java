package class3_windowHandling;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowHandles {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Online_Selenium_Class\\OnlineBatch\\SeleniumJars\\chromedriver_win32\\chromedriver.exe");

		 driver=new ChromeDriver();
		
		//when we click on multiple link and multiple window or tab get opned ...
		//we are covering that scenario using new tab option 
		driver.get("https://www.google.com/");
		String parent=driver.getWindowHandle();
		System.out.println(parent);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		Set<String> handler=driver.getWindowHandles();
		System.out.println(handler);
		List<String> listOfElement=new ArrayList<String>(handler);
		if(SwitchToWindowBasedOnTitle("Facebook", listOfElement)) {
			System.out.println(driver.getCurrentUrl() +"&"+ driver.getTitle());
		}
		SwitchToParentWindow(parent);
		System.out.println(driver.getCurrentUrl() +"&"+ driver.getTitle());
		closeAllChildWindow(parent, listOfElement);
		
		
	}
	
	public static void SwitchToParentWindow(String parentWindowID) {
		
		driver.switchTo().window(parentWindowID);
		
	}
	
	public static boolean SwitchToWindowBasedOnTitle(String windowTitle,List<String> listOfElement) {
		
		for(String element:listOfElement ) {
			String title=driver.switchTo().window(element).getTitle();
			if(title.contains(windowTitle)) {
				System.out.println("found title matched window");
				return true;
			}
		}
		return false;
		
	}
	
	public static void closeAllChildWindow(String parentWindowID,List<String> listOfElement) {
		
		for(String element:listOfElement) {
			if(!element.equals(parentWindowID)) {
				driver.switchTo().window(element).close();
			}
		}
		
		
	}

}
