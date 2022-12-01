package class3_windowHandling;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabType4Handling2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Online_Selenium_Class\\OnlineBatch\\SeleniumJars\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		Set<String> handler=driver.getWindowHandles();
		Iterator<String> it=handler.iterator();
		String parentWindowId=it.next();
		String childWindowId=it.next();
		
		driver.get("https://www.rediff.com/");
		Thread.sleep(3000);
		String text=driver.findElement(By.xpath("//a[text()='Indian team touch down in Trivandrum for SA duel']")).getText();
		System.out.println(text);
		System.out.println(driver.getTitle());
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.name("email")).sendKeys("amitsingh32@dd.com");
		System.out.println(driver.getTitle());
		driver.switchTo().window(childWindowId);
		System.out.println(driver.getTitle());
//		driver.findElement(By.name("q")).sendKeys(text);
//		Thread.sleep(3000);
		
		
	
	}

}
