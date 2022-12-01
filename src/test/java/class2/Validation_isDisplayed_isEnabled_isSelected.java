package class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validation_isDisplayed_isEnabled_isSelected {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Online_Selenium_Class\\OnlineBatch\\SeleniumJars\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
		
		
		//isDisplayed
		boolean logoDisplayed=driver.findElement(By.xpath("//span[@class='hmsprite logo']")).isDisplayed();
		if(logoDisplayed==true) {
			System.out.println("logo is displayed after login");
		}else {
			System.out.println("logo is not displayed after login");
		}
		
		//isEnabled
		
		boolean signLinkEnabled=driver.findElement(By.xpath("//a[text()='Sign in']")).isEnabled();
		if(signLinkEnabled==true) {
			System.out.println("Sign in button is enabled");
		}else {
			System.out.println("Sign in button is not enabled");
		}
		
		//isSelected
		
		driver.findElement(By.xpath("//a[text()='Sign in']")).click();
		boolean checkboxSelection=driver.findElement(By.xpath("//input[@id='remember']")).isSelected();
		if(checkboxSelection==true) {
			System.out.println("Checkbox is alreay checked");
		}else {
			System.out.println("Checlbox is not selected ");
		}
		
		
	}

}
