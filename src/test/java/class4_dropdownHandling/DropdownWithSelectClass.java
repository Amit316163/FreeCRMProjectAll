package class4_dropdownHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownWithSelectClass {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Online_Selenium_Class\\OnlineBatch\\SeleniumJars\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		
		WebElement skills=driver.findElement(By.id("Skills"));
		
		Select select=new Select(skills);
		
		//selectByVisibleText
		select.selectByVisibleText("Android");
		
		Thread.sleep(2000);
		//selectByValue
		select.selectByValue("Analytics");
		Thread.sleep(2000);
		//selectByIndex
		select.selectByIndex(5);
		
		System.out.println(select.isMultiple());
		
	}

}
