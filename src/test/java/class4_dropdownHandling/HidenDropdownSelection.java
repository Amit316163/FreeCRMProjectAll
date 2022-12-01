package class4_dropdownHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HidenDropdownSelection {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Online_Selenium_Class\\OnlineBatch\\SeleniumJars\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		//flipkart and jira ( f12-eventlistener-blur- removeAll)
		
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//div[@class='_2QfC02']/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("laptop");
		Thread.sleep(2000);
		List<WebElement> suggestionList=driver.findElements(By.xpath("//span[@class='r85cly']/parent::div"));
	//	List<WebElement> suggestionList=driver.findElements(By.xpath("//div[contains(@class,'lrtEPN')]"));
		
		for (WebElement list:suggestionList) {
			System.out.println(list.getText());
		}
		
		
		
	}

}
