package class4_dropdownHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleDropdownSelection {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Online_Selenium_Class\\OnlineBatch\\SeleniumJars\\chromedriver_win32\\chromedriver.exe");

		 driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.findElement(By.id("msdd")).click();
		Thread.sleep(2000);
		List<WebElement> dropdownValues=driver.findElements(By.xpath("//ul[contains(@class,'ui-autocomplete')]//li//a"));
		
		for(WebElement value:dropdownValues) {
			
			System.out.println(value.getText());
			if(value.getText().equalsIgnoreCase("Catalan")) {
				value.click();
			}else if (value.getText().equalsIgnoreCase("Turkish")) {
				value.click();
			}
		}
		
		
		
	}

}
