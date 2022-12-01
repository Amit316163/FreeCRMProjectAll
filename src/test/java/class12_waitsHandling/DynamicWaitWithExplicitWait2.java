package class12_waitsHandling;

import java.time.Duration;
import java.util.Date;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicWaitWithExplicitWait2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();

		

		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");

		


	
		// 1 sec (1000 ms)--for wait it will have 500 ms default polling- in 1 sec- 2 times for polling(500ms and 500ms)\
		// 2 sec - 4 times polling (500ms,500ms,500ms,500ms,)
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(2));
		wait.until(new Function<WebDriver, WebElement>(){
			
			public WebElement apply(WebDriver driver){
				System.out.println("start at "+new Date());
				return driver.findElement(By.xpath(""));
				
				
			}
		});











	}

}
