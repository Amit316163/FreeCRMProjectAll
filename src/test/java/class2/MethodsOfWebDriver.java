package class2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MethodsOfWebDriver {


	public static void main(String[] args) throws InterruptedException {


		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();

		//How to launch the url
		driver.get("https://google.com");

		//Get the title
		String googleTitle=driver.getTitle();
		System.out.println(googleTitle);

		//Get the current page url
		String googleUrl=driver.getCurrentUrl();
		System.out.println(googleUrl);

		//Get the page source
		//String googlePageSource=driver.getPageSource();
		//System.out.println(googlePageSource);


		//Get the page source
		Navigation nav=driver.navigate();
		nav.to("https://facebook.com");
		nav.back();
		nav.forward();
		nav.refresh();
		
		//close the browser
		driver.close();



	}

}
