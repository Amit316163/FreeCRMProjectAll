package class3_windowHandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window2WithTabValidation {
	
	public static void switchWindow(WebDriver driver, String firstWindow, String secondWindow)
	{
		Set<String> windowHandles = driver.getWindowHandles();
		for(String windows : windowHandles)
		{
			if(!(windows.equals(firstWindow) && windows.equals(secondWindow)))
			{
				driver.switchTo().window(windows);
			}
		}
	}


	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Online_Selenium_Class\\OnlineBatch\\SeleniumJars\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		String window1=driver.getWindowHandle();
		System.out.println(window1);
		driver.findElement(By.id("newTabBtn")).click();
		switchWindow(driver, window1, window1);
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Selenium Practice']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Window Handles']")).click();
		driver.findElement(By.id("newTabBtn")).click();
		String window2=driver.getWindowHandle();
		System.out.println(window2);
		switchWindow(driver, window1, window2);
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Selenium Practice']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Window Handles']")).click();
		driver.findElement(By.id("newTabBtn")).click();
		String window3=driver.getWindowHandle();
		switchWindow(driver, window2, window3);
		System.out.println(driver.getTitle());
		System.out.println("last page");
		driver.switchTo().window(window1);
		System.out.println("current page");

		
		

	}
		
		
	}

