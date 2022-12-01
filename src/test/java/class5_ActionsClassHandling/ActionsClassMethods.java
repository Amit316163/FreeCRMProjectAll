package class5_ActionsClassHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassMethods {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "D:\\Online_Selenium_Class\\OnlineBatch\\SeleniumJars\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.vistra.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		Thread.sleep(5000);
		Actions act=new Actions(driver);

		//Perform moveToElement and then click on option

		act.moveToElement(driver.findElement(By.xpath("(//a[text()='About us'])[1]"))).build().perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Board Governance']")).click();

		//Perform moveToElement and again moveToElement then click on option


		act.moveToElement(driver.findElement(By.xpath("//span[text()='Services']")))
		.moveToElement(driver.findElement(By.xpath("//a[text()='Establishment']"))).
		build().perform(); Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Directorship Services']")).click();



		//perform right click 
		Thread.sleep(5000);
		WebElement rightClick=	driver.findElement(By.xpath("//a[text()='Client portal']"));

		//1st way
		act.moveToElement(rightClick).contextClick().perform();
		//2nd way
		act.contextClick(rightClick).perform();

		//it will perform right on  left top of the page
		act.contextClick().perform();
		Thread.sleep(2000);

		//Perform double click 
		WebElement doubleClick=	driver.findElement(By.xpath("//a[text()='Client portal']"));

		//1st way
		act.moveToElement(doubleClick).doubleClick().perform();
		//2nd way
		act.doubleClick(doubleClick).perform();

		//it will perform double click on left top of the page
		act.doubleClick().perform();
		Thread.sleep(2000);
	}

}
