package class12_waitsHandling;

import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicWaitWithExplicitWait {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");

		//wait is an interface which has 2 implementing classes WebDriverWait FluentWait
		System.out.println("start at "+new Date());

		//condition 1
		//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
		//condition 2
		//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		//condition 3
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));

		driver.findElement(By.id("display-other-button")).click();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//button[text()='Enabled']"))));
		boolean enabledButton=driver.findElement(By.xpath("//button[text()='Enabled']")).isDisplayed();
		System.out.println(enabledButton);
		System.out.println("stop at "+new Date());
		
		
		
		//Expected Conditions for alert 
//		driver.findElement(By.id("alert")).click();
//		wait.until(ExpectedConditions.alertIsPresent());
//		driver.switchTo().alert().accept();
//		System.out.println("stop at "+new Date());
		
		//Can we merge implict and explicit together 
	
		//created a picture with theory and saved into offline batch and desktop folders




	}

}
