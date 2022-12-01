package class4_dropdownHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleDropdownWithSelectClass {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Online_Selenium_Class\\OnlineBatch\\SeleniumJars\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");

		WebElement multipleDropdown=driver.findElement(By.id("ide"));

		Select select=new Select(multipleDropdown);

		//isMultiple 		
		System.out.println(select.isMultiple());

		//Select the multiple value 
		select.selectByVisibleText("Eclipse");
		Thread.sleep(2000);
		select.selectByValue("vs");
		Thread.sleep(2000);
		select.selectByIndex(3);
		System.out.println(select.getFirstSelectedOption().getText());



		//DeSelect the multiple value
		select.deselectByVisibleText("Eclipse");
		Thread.sleep(2000);
		select.deselectByValue("vs");
		Thread.sleep(2000);
		select.deselectByIndex(3);

		//DeselectAll
		//select.deselectAll();

	}

}
