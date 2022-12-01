package class5_ActionsClassHandling;

import java.awt.RenderingHints.Key;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassMethods5 {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "D:\\Online_Selenium_Class\\OnlineBatch\\SeleniumJars\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(2000);

		Actions act=new Actions(driver);
		
		//Fill up the form
		WebElement firstName=driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		
		firstName.sendKeys("Amit");
		
		act.sendKeys(Keys.TAB).sendKeys("Singh")
		.pause(Duration.ofSeconds(2))
		.sendKeys(Keys.TAB).sendKeys("Banaras")
		.pause(Duration.ofSeconds(2))
		.sendKeys(Keys.TAB).sendKeys("ahd@hdd.com").build().perform();
		
		//just copy paste functionality
		act.keyDown(Keys.CONTROL).sendKeys("a").perform();
		act.keyDown(Keys.CONTROL).sendKeys("c").perform();
		act.keyDown(Keys.TAB).sendKeys(Keys.ENTER).perform();
		act.keyDown(Keys.CONTROL).sendKeys("v").perform();
		act.keyUp(Keys.TAB).keyUp(Keys.CONTROL).perform();
		act.keyDown(Keys.TAB).sendKeys(Keys.ENTER).sendKeys("Varanasi").perform();

		act.keyDown(Keys.TAB).keyDown(Keys.SHIFT).sendKeys("singh").perform();
	}

}
