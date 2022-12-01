package class11_DesiredCapabilities;


import java.util.Arrays;
import java.util.Collection;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Class3 {


	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();


		//disbled the application notification

		options.addArguments("disable-notifications");

		WebDriver driver =new ChromeDriver(options);
		driver.get("https://spicejet.com/");
	}

}
