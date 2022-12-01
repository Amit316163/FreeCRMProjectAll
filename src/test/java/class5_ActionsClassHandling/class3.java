package class5_ActionsClassHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class class3 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://text-compare.com/");
		driver.manage().window().maximize();


		WebElement textArea1=driver.findElement(By.xpath("//textarea[@id='inputText1']"));
		WebElement textArea2=driver.findElement(By.xpath("//textarea[@id='inputText2']"));

		textArea1.sendKeys("Selenium testing");

		//Using WebElement method
//				textArea1.sendKeys(Keys.chord(Keys.CONTROL,"a"));
//				textArea1.sendKeys(Keys.chord(Keys.CONTROL,"c"));
//				textArea1.sendKeys(Keys.TAB);
//				textArea2.sendKeys(Keys.chord(Keys.CONTROL,"v"));
			
				//Using Actions class method 1st way
		Actions action=new Actions(driver);
		action.keyDown(Keys.CONTROL).sendKeys("a").perform();
		action.keyDown(Keys.CONTROL).sendKeys("c").perform();
		action.keyUp(Keys.CONTROL).perform();
		action.sendKeys(Keys.TAB).perform();
		action.keyDown(Keys.CONTROL).sendKeys("v").perform();
		
		
	

		







	}

}
