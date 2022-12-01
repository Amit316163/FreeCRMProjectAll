package class12_waitsHandling;

import java.time.Duration;
import java.util.Date;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.DiscoveryStrategy.Explicit;

public class Class6 {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		//Fluent wait 
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		System.out.println("before page starts loading at  "+ new Date());

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://omayo.blogspot.com/");
		
		System.out.println("after url loading at  "+ new Date());
		
		driver.findElement(By.className("dropbtn")).click();
		
		FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(1))
				//.pollingEvery(Duration.ofSeconds(2))
				.ignoring(NoSuchElementException.class);
		
	WebElement link=	wait.until(new Function<WebDriver, WebElement>(){
			
			public WebElement apply(WebDriver driver) {
				System.out.println("loading at  "+ new Date());
				return driver.findElement(By.linkText("Facebook"));
			}
			
		});
	link.click();
				
		System.out.println("after url loading at  "+ new Date());
		
		
	}
}
