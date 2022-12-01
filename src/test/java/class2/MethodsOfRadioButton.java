package class2;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodsOfRadioButton {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Online_Selenium_Class\\OnlineBatch\\SeleniumJars\\chromedriver_win32\\chromedriver.exe");

		 driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
	//select  radio button 
		//driver.findElement(By.xpath("//input[@value='Male']")).click();
		
		//Multiple radio buttons
//		List <WebElement> multipleRadioButtons=driver.findElements(By.xpath("//input[@type='radio']"));
//		for(WebElement radioButton:multipleRadioButtons) {
//			if(radioButton.getText().equals("Male")){
//				radioButton.click();
//			}
//		}
		
		List <WebElement> multipleRadioButtons=driver.findElements(By.xpath("//input[@type='radio']"));
		for(WebElement radioButton:multipleRadioButtons) {
			if(radioButton.getAttribute("value").equalsIgnoreCase("FeMale")){
				radioButton.click();
			}
		}
		
		
		
	}

}
