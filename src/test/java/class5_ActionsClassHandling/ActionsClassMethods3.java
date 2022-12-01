package class5_ActionsClassHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsClassMethods3 {

	public static void main(String[] args) throws InterruptedException {


		//		System.setProperty("webdriver.chrome.driver", "D:\\Online_Selenium_Class\\OnlineBatch\\SeleniumJars\\chromedriver_win32\\chromedriver.exe");
		//		WebDriver driver =new ChromeDriver();
		//it will work in chromium only not in other browsers(selenium 4)
		WebDriver driver=	WebDriverManager.chromedriver().create();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/");
		Thread.sleep(2000);

		Actions act=new Actions(driver);

	

		Thread.sleep(2000);
		//scroll down	
		Action action=act.keyDown(Keys.CONTROL).sendKeys(Keys.END).build();
		action.perform();

		Thread.sleep(2000);
		//scroll up
		act.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).perform();
		Thread.sleep(2000);
		
		//scrollToElement 
		act.scrollToElement(driver.findElement(By.xpath("//h2[text()='Java']"))).perform();
		Thread.sleep(2000);



	}

}
