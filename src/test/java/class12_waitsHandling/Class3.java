package class12_waitsHandling;

import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.DiscoveryStrategy.Explicit;

public class Class3 {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		//explicit wait
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		System.out.println("before page starts loading at  "+ new Date());

//		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		
		System.out.println("after url loading at  "+ new Date());
		
		//Without explicit wait we are getting false 
//		driver.findElement(By.id("display-other-button")).click();
//		boolean enabledButton=driver.findElement(By.xpath("//button[text()='Enabled']")).isDisplayed();
//		System.out.println(enabledButton);
		
		//With explicit wait
		driver.findElement(By.id("display-other-button")).click();
		driver.findElement(By.xpath("//button[text()='Enabled']")).click();
		//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
		//it will wait for element to be loaded within given amount of time 
		//wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//button[text()='Enabled']"))));
		//within time if it loaded successfully then you will get true output
		//boolean enabledButton=driver.findElement(By.xpath("//button[text()='Enabled']")).isDisplayed();
		//System.out.println(enabledButton);
		
		
		System.out.println("after click page loaded  "+ new Date());
	}

}
