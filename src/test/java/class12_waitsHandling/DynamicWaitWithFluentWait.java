package class12_waitsHandling;

import java.time.Duration;
import java.util.Date;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicWaitWithFluentWait {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		 driver =new ChromeDriver();

		//not working properly 

		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");

		
		driver.findElement(By.id("display-other-button")).click();
		
		

		  
		   
		 

	}
	
//	public static void waitForElementToDsiplayed(WebDriver driver) {
//		
//		 Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
//				   .withTimeout(Duration.ofSeconds(30))
//				   .pollingEvery(Duration.ofSeconds(2))
//				   .ignoring(NoSuchElementException.class);
//		 
//		 WebElement foo= wait.until(new Function<WebDriver, boolean>(){
//			   
//				 public boolean apply(WebElement e){
//					 System.out.println("pollling at "+new Date());
//					boolean displayButton =driver.findElement(By.xpath("//button[text()='Enabled']")).isDisplayed();
//					 return displayButton;
//					   
//				   }
//			   });
		
	
}
