package class9_Screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenshotForEntirePage {

	
	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File screenshotFile=ts.getScreenshotAs(OutputType.FILE);
		
//		File fileLication=new File("./CaptureScreenshot/screenShot1.png");
//		FileUtils.copyFile(screenshotFile, fileLication);
		
		// we can write like this as well
		FileUtils.copyFile(screenshotFile, new File("./CaptureScreenshot/screenShot2.png"));
		
		
	}
}
