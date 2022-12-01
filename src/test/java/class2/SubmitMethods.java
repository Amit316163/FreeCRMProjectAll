package class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SubmitMethods {
	
	public static void main(String[] args) throws InterruptedException {
		
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();

driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");

driver.findElement(By.id("txtUsername")).sendKeys("gdf");
Thread.sleep(2000);
driver.findElement(By.id("txtPassword")).sendKeys("sdf");
Thread.sleep(2000);
driver.findElement(By.id("txtPassword")).submit();

		
		
	}

}
