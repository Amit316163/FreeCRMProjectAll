package class3_alertsHandling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert3 {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();

		WebDriver driver=new ChromeDriver();
		//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//if we dont pass the full url then get exception 
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Forgot Customer ID']")).click();
		//click on conitnue 
	}

}
