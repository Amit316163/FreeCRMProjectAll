package class3_windowHandling;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowException {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Windows.html");
		
		driver.findElement(By.xpath("(//button[@class='btn btn-info'])[1]")).click();
		
		System.out.println(driver.getWindowHandle());
		System.out.println(driver.getWindowHandles());
		
		Set <String> multipleWindow=driver.getWindowHandles();
		
		Iterator<String> it= multipleWindow.iterator();
		String window=it.next();
		System.out.println(window);
		String window2=it.next();
		System.out.println(window2);
		
		driver.switchTo().window(window2);
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//span[text()='Downloads']")).click();
		driver.close();
		driver.switchTo().window(window2);
		
		
	}

}
