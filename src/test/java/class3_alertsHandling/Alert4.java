package class3_alertsHandling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert4 {
	
	public static void main(String[] args) throws InterruptedException {
		
		//Not working code --on browser stack for Alert 
		WebDriverManager.chromedriver().setup();

		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//if we dont pass the full url then get exception 
		driver.get("https://www.browserstack.com/users/sign_up");
		driver.findElement(By.id("user_full_name")).sendKeys("dfd");
		driver.findElement(By.id("user_email_login")).sendKeys("dfd");
		driver.findElement(By.id("user_password")).sendKeys("dfd");
		driver.findElement(By.id("accept-cookie-notification")).click();
		driver.findElement(By.id("user_submit")).click();
		Alert alt=driver.switchTo().alert();
		Thread.sleep(2000);
		System.out.println(alt.getText());
		Thread.sleep(5000);
		alt.accept();
	}

}
