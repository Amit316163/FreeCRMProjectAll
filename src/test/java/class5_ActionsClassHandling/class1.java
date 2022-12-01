package class5_ActionsClassHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class class1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.vistra.com/");
		driver.manage().window().maximize();

		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		Thread.sleep(5000);


		//moveToElement
		Actions act=new Actions(driver);
//		act.moveToElement(driver.findElement(By.xpath("(//a[text()='About us'])[1]")))
//		.moveToElement(driver.findElement(By.xpath("//a[text()='Board Governance']"))).click().perform();

		//Perform moveToElement and again moveToElement then click on option


		act.moveToElement(driver.findElement(By.xpath("//span[text()='Services']")))
		.moveToElement(driver.findElement(By.xpath("//a[text()='Establishment']")))
		.perform(); 
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Directorship Services']")).click();


	}

}
