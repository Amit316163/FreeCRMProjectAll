package class12_waitsHandling;

import java.time.Duration;
import java.util.Date;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.DiscoveryStrategy.Explicit;

public class Class5 {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		//polling system in fluent wait
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		System.out.println("before page starts loading at  "+ new Date());

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		
		System.out.println("after url loading at  "+ new Date());
		
		//just to show the polling time as 500 ms in every 1 sec
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(2));
//		T: denotes the type of the input argument
//		V: denotes the return type of the function
		wait.until(new Function<WebDriver, WebElement> (){

			public WebElement apply(WebDriver driver) {

				System.out.println("every loading at  "+ new Date());
				return driver.findElement(By.xpath(""));
			}
			
		
			
		});
		
	}
}
