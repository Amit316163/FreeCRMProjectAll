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

public class ActionsClassMethods4 {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "D:\\Online_Selenium_Class\\OnlineBatch\\SeleniumJars\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(2000);

		Actions act=new Actions(driver);

		//Right click on the link and then open in new tab

		WebElement demo=driver.findElement(By.xpath("//a[text()='Demos']"));
		act.contextClick(demo).perform();

		act.keyDown(Keys.LEFT_CONTROL).click().perform();





	}

}
