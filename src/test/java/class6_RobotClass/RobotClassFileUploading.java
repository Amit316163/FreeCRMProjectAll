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

public class RobotClassFileUploading {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.filemail.com/share/upload-file");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Add Files']")).click();

		String path="D:\\Anurag\\Test.java";
		// package of java.awt.datatransfer..under this we have a class called "StringSelection"
		StringSelection uploadFilePath=new StringSelection(path);
		//"StringSelection" has one constructor ,
		//which is used to Creates a Transferable capable of transferring the specified String.
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(uploadFilePath, null);
		//Now transferable uploadFilePath needs to copied  to clipboard
		Robot robot=new Robot();
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
	}

}
