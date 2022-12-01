package class2;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodsOfWebElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Online_Selenium_Class\\OnlineBatch\\SeleniumJars\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		
		//For text field --first clear it and then enter text 
		WebElement firstName=driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		firstName.clear();
		firstName.sendKeys("Amit");
		
		WebElement lastName=driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		lastName.clear();
		lastName.sendKeys("Singh");
				
		WebElement address=driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
		address.clear();
		address.sendKeys("Tingre Nagar");
		
		WebElement emailId=	driver.findElement(By.xpath("//input[@type='email']"));
		emailId.clear();
		emailId.sendKeys("amitsingh76788@hdg.com");
		
		WebElement phoneNumber=driver.findElement(By.xpath("//input[@type='tel']"));
		phoneNumber.clear();
		phoneNumber.sendKeys("676576678");
		
		WebElement selectMaleRadioButton=driver.findElement(By.xpath("//input[@value='Male']"));
		selectMaleRadioButton.click();
		
		WebElement selectCriketRadioButton=driver.findElement(By.xpath("//input[@value='Cricket']"));
		selectCriketRadioButton.click();
		
		WebElement submitButton=driver.findElement(By.xpath("//button[@type='submit']"));
		submitButton.click();
		
		Thread.sleep(2000);
		WebElement refreshButton=driver.findElement(By.xpath("//button[text()='Refresh']"));
		refreshButton.sendKeys("fgfg");
		//refreshButton.click();
		//File src=refreshButton.getScreenshotAs(OutputType.FILE);
		
		
	}

}
