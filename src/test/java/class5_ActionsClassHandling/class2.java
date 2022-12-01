package class5_ActionsClassHandling;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class class2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/key_presses");
		driver.manage().window().maximize();

		//directly using WebElement method sendKeys
		driver.findElement(By.id("target")).sendKeys("A");	

		//directly using WebElement method sendKeys with enum Keys--BACK_SPACE
		driver.findElement(By.id("target")).sendKeys(Keys.BACK_SPACE);

		//directly using WebElement method sendKeys with enum Keys--Enter
		driver.findElement(By.id("target")).sendKeys(Keys.ENTER);

		//	Using Actions class using 1st way

		Actions act=new Actions(driver);

		act.sendKeys(Keys.CANCEL).perform();

		act.sendKeys(Keys.ARROW_LEFT).perform();

		//		Using Actions class using 2nd way

		act.keyDown(Keys.CANCEL).perform();
		act.pause(2000);
		act.keyDown(Keys.ARROW_LEFT).perform();

	}

}
