package class3_alertsHandling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert1 {

	public static void main(String[] args) throws InterruptedException {


		WebDriverManager.chromedriver().setup();

		WebDriver driver=new ChromeDriver();

		//if we dont pass the full url then get exception 
		driver.get("https://demoqa.com/alerts");

		driver.findElement(By.id("alertButton")).click();
		Thread.sleep(2000);
		Alert alt=driver.switchTo().alert();
		alt.accept();
		Thread.sleep(2000);
	}

}
