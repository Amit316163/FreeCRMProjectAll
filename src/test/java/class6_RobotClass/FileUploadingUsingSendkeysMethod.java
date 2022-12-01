package class6_RobotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadingUsingSendkeysMethod {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//span[text()='Add Files']")).click();

		String path="D:\\Anurag\\Test.java";
		driver.findElement(By.name("upfile")).sendKeys(path);
		Thread.sleep(2000);
		
	}

}
