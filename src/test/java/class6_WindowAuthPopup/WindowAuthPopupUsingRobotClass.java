package class6_WindowAuthPopup;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowAuthPopupUsingRobotClass {
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://the-internet.herokuapp.com/basic_auth");
		Thread.sleep(2000);
		driver.switchTo().activeElement().sendKeys("admin");
		
		Robot robot=new Robot();
		
		/*
		 * robot.keyPress(KeyEvent.VK_A); robot.keyPress(KeyEvent.VK_D);
		 * robot.keyPress(KeyEvent.VK_M); robot.keyPress(KeyEvent.VK_I);
		 * robot.keyPress(KeyEvent.VK_N);
		 */
		
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		driver.switchTo().activeElement().sendKeys("admin");
		
		/*
		 * robot.keyPress(KeyEvent.VK_A); robot.keyPress(KeyEvent.VK_D);
		 * robot.keyPress(KeyEvent.VK_M); robot.keyPress(KeyEvent.VK_I);
		 * robot.keyPress(KeyEvent.VK_N);
		 */
		
		robot.keyPress(KeyEvent.VK_ENTER);
		

		
	}

}
