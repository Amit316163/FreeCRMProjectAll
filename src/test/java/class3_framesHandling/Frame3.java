package class3_framesHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frame3 {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/TAgs/tryit.asp?filename=tryhtml_iframe_frameborder_css");
		driver.manage().window().maximize();
		driver.switchTo().frame("iframeResult");
		System.out.println(driver.findElement(By.xpath("//h1[text()='The iframe element + CSS']")).getText());
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='/default.asp']")));
		driver.findElement(By.xpath("//a[@id='w3loginbtn']")).click();
		System.out.println("log in button clicked");
		
		driver.switchTo().parentFrame();
		System.out.println(driver.findElement(By.xpath("//p[text()='An iframe with default borders:']")).getText());
	}

}
