package class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validation_isSelected2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Online_Selenium_Class\\OnlineBatch\\SeleniumJars\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("https://netportal.hdfcbank.com/login#/openMarketLoginCC");
		driver.manage().window().maximize();
		
		
		
		
		//isSelected
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//a[text()='Sign in']")).click();
		WebElement checkbox=driver.findElement(By.xpath("//input[@type='checkbox']"));
		if(checkbox.isSelected()) {
			System.out.println("checkbox is already selected");
		}else {
			System.out.println("Checlbox is not selected and i am selecting checkbox now");
			checkbox.click();
			checkbox.click();
		}
		
		
		
		
	}

}
