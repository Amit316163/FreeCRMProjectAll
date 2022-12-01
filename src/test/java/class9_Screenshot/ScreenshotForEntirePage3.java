package class9_Screenshot;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenshotForEntirePage3 {


	public static void main(String[] args) throws IOException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");

		TakesScreenshot ts=(TakesScreenshot)driver;
		File screenshotFile=ts.getScreenshotAs(OutputType.FILE);

		//		File fileLication=new File("./CaptureScreenshot/screenShot1.png");
		//		FileUtils.copyFile(screenshotFile, fileLication);

		//We want to remove the hardcoding for screenshot file name

		SimpleDateFormat simple=new SimpleDateFormat("yyMMddHHmmss");
		String dateFormat=simple.format(new Date());

		FileUtils.copyFile(screenshotFile, new File("./CaptureScreenshot/Screenshot_"+dateFormat+".png"));

		//using bytes
		//		TakesScreenshot ts=(TakesScreenshot)driver;
		//
		//		SimpleDateFormat simple=new SimpleDateFormat("yyMMdd_HHmmss");
		//		String dateFormat=simple.format(new Date());
		//
		//		byte[] screenshot=ts.getScreenshotAs(OutputType.BYTES);
		//		FileOutputStream fos=new FileOutputStream(new File ("./Screenshot/image_"+dateFormat+".png"));
		//		fos.write(screenshot);


		//using base64
//		TakesScreenshot ts=(TakesScreenshot)driver;
//
//		SimpleDateFormat simple=new SimpleDateFormat("yyMMdd_HHmmss");
//		String dateFormat=simple.format(new Date());
//
//		String screenshot=ts.getScreenshotAs(OutputType.BASE64);
//		byte[] snap=Base64.getDecoder().decode(screenshot);
//		FileOutputStream fos=new FileOutputStream(new File ("./Screenshot/image_"+dateFormat+".png"));
//		fos.write(snap);
	}
}
