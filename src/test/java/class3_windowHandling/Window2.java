package class3_windowHandling;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window2 {

	public static void main(String[] args) {
		String systemLocation=  System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", systemLocation+"\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Windows.html");

		driver.findElement(By.xpath("(//button[@class='btn btn-info'])[1]")).click();

		String parentWindow=driver.getWindowHandle();
		System.out.println(parentWindow);


		Set <String> multipleWindow=driver.getWindowHandles();
		Iterator<String> it= multipleWindow.iterator();

		while(it.hasNext()) {

			String windowHandleID=it.next();
			System.out.println(windowHandleID);

			if(!windowHandleID.equalsIgnoreCase(parentWindow)) {

				driver.switchTo().window(windowHandleID);

			}
		}
		System.out.println(driver.getTitle());

		driver.findElement(By.xpath("//span[text()='Downloads']")).click();
	}

}
