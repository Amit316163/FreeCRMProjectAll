package class9_Screenshot;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.bouncycastle.util.encoders.Base64;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenshotForEntirePage2 {

	
	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		takesScreenshot(driver);
	
		
		
		
	}
	
	public static void takesScreenshot(WebDriver driver) throws IOException {
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		//file 
		File screenshotFile=ts.getScreenshotAs(OutputType.FILE);
		
		//byte
		byte[] snapshot=ts.getScreenshotAs(OutputType.BYTES);
		FileOutputStream fos=new FileOutputStream(new File("./CaptureScreenshot/Screenshot.png"));
		fos.write(snapshot);
		
		//base64
		String base64Snap=ts.getScreenshotAs(OutputType.BASE64);
		byte[] snapshot1=Base64.decode(base64Snap);
		FileOutputStream fos1=new FileOutputStream(new File("./CaptureScreenshot/Screenshot.png"));
		fos1.write(snapshot1);
		
		
		
		SimpleDateFormat simple=new SimpleDateFormat("yyMMddHHmmss");
		String dateFormat=simple.format(new Date());
		
		FileUtils.copyFile(screenshotFile, new File("./CaptureScreenshot/Screenshot_"+dateFormat+".png"));
		
		
	}
}
