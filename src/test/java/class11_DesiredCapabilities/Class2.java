package class11_DesiredCapabilities;


import java.util.Arrays;
import java.util.Collection;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Class2 {


	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();


		//Chrome beign used by
		//options.addArguments("disable-infobars");
		options.setAcceptInsecureCerts(true);
		options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});

		WebDriver driver =new ChromeDriver(options);
		driver.get("https://cacert.com/");
	}

}
