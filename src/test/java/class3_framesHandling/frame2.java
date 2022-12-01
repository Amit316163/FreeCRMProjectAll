package class3_framesHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class frame2 {
	
	public static void main(String[] args) {
		
		String systemLocation=  System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", systemLocation+"\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("name")).sendKeys("Amit main page");
		
		driver.switchTo().frame("frm1");
		
		Select s=new Select(driver.findElement(By.id("selectnav1")));
		s.selectByVisibleText("- Dot Net");
		
		
		System.out.println(driver.findElement(By.name("\r\n"
				+ "Core Java - English")).getText());
		Select s1=new Select(driver.findElement(By.id("selectnav1")));
		s1.selectByVisibleText("Tech News");
		
	}

}
