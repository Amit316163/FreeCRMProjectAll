package class4_dropdownHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleDropdownSelection2 {
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

		dropdownHandles(dropdownValues, "Catalan", "Turkish");
		driver.findElement(By.id("basicBootstrapForm")).click();

	}
	
	//each string we are passing here
	public static void dropdownHandles(List<WebElement> dropdownValues,String value1,String value2) {

		for(WebElement dropdown:dropdownValues) {

			System.out.println(dropdown.getText());
			if(dropdown.getText().equalsIgnoreCase(value1)) {
				dropdown.click();
			}else if (dropdown.getText().equalsIgnoreCase(value2)) {
				dropdown.click();
			}
		}

	}

}
