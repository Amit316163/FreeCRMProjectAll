package class4_dropdownHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleDropdownSelection3 {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Online_Selenium_Class\\OnlineBatch\\SeleniumJars\\chromedriver_win32\\chromedriver.exe");

		driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();

		driver.findElement(By.id("msdd")).click();

		Thread.sleep(2000);
		List<WebElement> dropdownValues=driver.findElements(By.xpath("//ul[contains(@class,'ui-autocomplete')]//li//a"));

		String [] language= {"Catalan","Turkish","Greek"};
		for(int i=0;i<language.length;i++) {
			String value=language[i];
			dropdownHandles(dropdownValues, value);
		}

		driver.findElement(By.id("basicBootstrapForm")).click();

	}

	//create a list of string and pass one by one
	public static void dropdownHandles(List<WebElement> dropdownValues,String value) {

		for(WebElement dropdownValue:dropdownValues) {
			System.out.println(dropdownValue.getText());
			if(dropdownValue.getText().equalsIgnoreCase(value)) {
				dropdownValue.click();
			}
		}

	}

}
