package class3_alertsHandling;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Alert2 {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver=new ChromeDriver();
		//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//if we dont pass the full url then get exception 
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");


		/* Simple Alert */


		//	driver.findElement(By.id("alertBox")).click();
		//	
		//	Alert alt=driver.switchTo().alert();
		//	System.out.println(alt.getText());
		//	alt.accept();


		/* confirmation Alert */

//		driver.findElement(By.id("confirmBox")).click();
//
//		Alert alt=driver.switchTo().alert();
//		System.out.println(alt.getText());
//		alt.accept();
//		System.out.println(driver.findElement(By.id("output")).getText());
//		Thread.sleep(2000);
		
		
		/* prompt alert */
		
		driver.findElement(By.id("promptBox")).click();

		Alert alt=driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.sendKeys("Amit alert");
		alt.accept();
		System.out.println(driver.findElement(By.id("output")).getText());
		Thread.sleep(2000);
		
	}}
