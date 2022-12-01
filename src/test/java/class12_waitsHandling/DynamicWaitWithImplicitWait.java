package class12_waitsHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicWaitWithImplicitWait {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();

		//Due following reasons application element may take a while to load.

		//		Poor Server Response time
		//		Ajax Loading
		//		Size of the page
		//		Internet Speed
		//		System hardware
		//		Browser slowness / less responsiveness
		//		Element created using javascript

		//The default wait time of the selenium is 500 milliseconds,
		//implicitly wait overrides the default wait time of the selenium


		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");



		//below scenario will not work for implicit wait since we are trying to for particular element 
		//		driver.findElement(By.id("display-other-button")).click();
		//		boolean enabledButton=driver.findElement(By.xpath("//button[text()='Enabled']")).isDisplayed();
		//		System.out.println(enabledButton);


		//We can put implicit wait for all element present on the page after website page is loaded
		//for specific element which gets loaded after page loaded successfully for thoese element we have to use 
		//explicit wait and fluent wait 




	}

}
