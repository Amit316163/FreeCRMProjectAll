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
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicWaitWithExplicitWait3 {

	//static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();

		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.className("dropbtn")).click();
		
		WebElement link=driver.findElement(By.linkText("Facebook"));
		
		waitForElementToClickable(driver,By.linkText("Facebook"));
		link.click();
		
		
	}
	
	public static void waitForElementToClickable(WebDriver driver,By element) {
		
		 FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver)
				   .withTimeout(Duration.ofSeconds(30))
				   .pollingEvery(Duration.ofSeconds(2))
				   .ignoring(NoSuchElementException.class);
		 
		 wait.until(new Function<WebDriver, WebElement>(){
			  
			   
				 public WebElement apply(WebDriver driver){
					 System.out.println("pollling at "+new Date());
					 return driver.findElement(element);
					   
				   }
				
			   });
	}

}
