package class5_ActionsClassHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassMethods2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Online_Selenium_Class\\OnlineBatch\\SeleniumJars\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(2000);
		//frame switch
		WebElement frameElement=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frameElement);
		Actions act=new Actions(driver);

		//drag and drop operation by 1
		act.clickAndHold(driver.findElement(By.xpath("//div[@id='draggable']")))
		.moveToElement(driver.findElement(By.xpath("//div[@id='droppable']"))).release().build().perform();
		Thread.sleep(2000);

		//drag and drop operation by 2
		act.dragAndDrop(driver.findElement(By.xpath("//div[@id='draggable']")), 
		driver.findElement(By.xpath("//div[@id='droppable']"))).build().perform();

		//Perform  click operation
		driver.switchTo().defaultContent();
		WebElement performClick=driver.findElement(By.xpath("//a[text()='Demos']"));
		//1st way
		act.moveToElement(performClick).click().perform();
		//2nd way
		act.click(performClick).perform();
		Thread.sleep(2000);

	}

}
