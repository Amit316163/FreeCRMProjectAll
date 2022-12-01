package class4_dropdownHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Online_Selenium_Class\\OnlineBatch\\SeleniumJars\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.automationtestinginsider.com/2019/12/bootstrap-dropdown-example_12.html");
		
		driver.findElement(By.xpath("//button[@id='bootstrapmenu']")).click();
		Thread.sleep(2000);
		List<WebElement> bootstapValues=driver.findElements(By.xpath("//ul[@class='dropdown-menu']/li"));
		
		for (WebElement value:bootstapValues) {
			System.out.println(value.getText());
			if(value.getText().equals("ABOUT US")) {
				value.click();
				System.out.println("dds");
			}
		}

	}

}
