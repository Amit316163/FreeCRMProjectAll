package class4_dropdownHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownWithoutSelectClass {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", "D:\\Online_Selenium_Class\\OnlineBatch\\SeleniumJars\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		
		//Get the multiple options 
		List<WebElement> skills=driver.findElements(By.xpath("//select[@id='Skills']/option"));
		
		for(WebElement skill:skills) {
			
			if(skill.getText().equals("Android")) {
				skill.click();
			}
		}
		
	}

}
