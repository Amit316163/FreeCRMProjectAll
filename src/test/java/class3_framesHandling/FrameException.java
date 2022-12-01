package class3_framesHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameException {
	
	public static void main(String[] args) {
		
		
WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/overview-summary.html");
		driver.findElement(By.xpath("(//a[text()='Frames'])[1]")).click();
		
		driver.switchTo().frame("fdgfd");
		driver.findElement(By.xpath("//a[text()='AbstractAnnotations']")).click();
	}

}
