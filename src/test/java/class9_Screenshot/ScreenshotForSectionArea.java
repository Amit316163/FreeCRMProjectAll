package class9_Screenshot;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenshotForSectionArea {
	
	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		
		WebElement google=driver.findElement(By.xpath("//header[@id='header']"));
		
		File screenshotFile=google.getScreenshotAs(OutputType.FILE);
		
		SimpleDateFormat simple=new SimpleDateFormat("yyMMddHHmmss");
		String dateFormat=simple.format(new Date());
		FileUtils.copyFile(screenshotFile, new File("./CaptureScreenshot/Screenshot_"+dateFormat+".png"));
		
	
		
	}

}
