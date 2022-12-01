package class3_framesHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class frame1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/overview-summary.html");
		driver.findElement(By.xpath("(//a[text()='Frames'])[1]")).click();
		
		driver.switchTo().frame("packageFrame");
		driver.findElement(By.xpath("//a[text()='AbstractAnnotations']")).click();
		
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.switchTo().frame("packageListFrame");
		driver.findElement(By.xpath("(//ul[@title='Packages']/li/a)[1]")).click();
		Thread.sleep(2000);
		
		
	}
}
