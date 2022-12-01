package class3_windowHandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window2WithWindowValidation {
	
	public static void switchWindow(WebDriver driver, String firstWindow, String secondWindow)
	{
		Set<String> windowHandles = driver.getWindowHandles();
		for(String windows : windowHandles)
		{
			if(!(windows.equals(firstWindow) && windows.equals(secondWindow)))
			{
				driver.switchTo().window(windows);
			}}}
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Online_Selenium_Class\\OnlineBatch\\SeleniumJars\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		String window1=driver.getWindowHandle();
		driver.findElement(By.id("newWindowBtn")).click();
		switchWindow(driver, window1, window1);
		driver.manage().window().maximize();
		driver.findElement(By.id("navigateHome")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Selenium Practice']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Window Handles']")).click();
		driver.findElement(By.id("newWindowBtn")).click();
		String window2=driver.getWindowHandle();
		switchWindow(driver, window1, window2);
		driver.manage().window().maximize();
		driver.findElement(By.id("navigateHome")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Selenium Practice']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Window Handles']")).click();
		driver.findElement(By.id("newWindowBtn")).click();
		switchWindow(driver, window1, window1);
		driver.manage().window().maximize();
		driver.findElement(By.id("navigateHome")).click();
		System.out.println("345");
		driver.switchTo().window(window1);
		System.out.println("345");

		
		

	}
		
		
	}

