package class8_JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollUsingActions_Selenium4 {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Online_Selenium_Class\\OnlineBatch\\SeleniumJars\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/");
		
		WebElement element=driver.findElement(By.xpath("//h2[text()='Learning Speed']"));
		
		Actions act=new Actions(driver);
		act.scrollToElement(element).perform();
	}

}
