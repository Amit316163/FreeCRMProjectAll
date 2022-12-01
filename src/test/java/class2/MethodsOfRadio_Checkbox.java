package class2;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MethodsOfRadio_Checkbox {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//launch the url 
		driver.get("https://jqueryui.com/checkboxradio/");
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		List<WebElement> radioButtons=driver.findElements(By.xpath("//div[@class='widget']//label"));
	
	for(int i=0;i<radioButtons.size();i++) {
		
		System.out.println(radioButtons.get(i).getText());
		if(radioButtons.get(i).getText().equalsIgnoreCase("Paris")) {
			radioButtons.get(i).click();
			Thread.sleep(3000);
		}else if (radioButtons.get(i).getText().equalsIgnoreCase("4 Star")) {
			
			if(radioButtons.get(i).isSelected()) {
				System.out.println("Already slected");
			}else {
				radioButtons.get(i).click();
			}
		}
	}
	
	
	}

}
