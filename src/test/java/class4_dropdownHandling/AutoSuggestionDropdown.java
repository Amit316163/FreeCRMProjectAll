package class4_dropdownHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AutoSuggestionDropdown {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "D:\\Online_Selenium_Class\\OnlineBatch\\SeleniumJars\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.goibibo.com/flights/");
		driver.findElement(By.xpath("//span[text()='From']/following-sibling::p")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Pune");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//input[@type='text']")).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(Keys.ENTER);
	}

}
