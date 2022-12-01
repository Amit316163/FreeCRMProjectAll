package class4_dropdownHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropdown2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Online_Selenium_Class\\OnlineBatch\\SeleniumJars\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		
		driver.findElement(By.xpath("//button[@type='button']")).click();
		
		//it will give 14 options including header 
//		List<WebElement> bootstrapValues=driver.findElements(By.xpath("//ul[contains(@class,'multiselect-container')]//label"));
//		System.out.println(bootstrapValues.size());
		
		
		//it will correct checkbox value without header
		List<WebElement> bootstrapValues=driver.findElements(By.xpath("//ul[contains(@class,'multiselect-container')]//li[not(@class='multiselect-item multiselect-group')]//a/label"));
		System.out.println(bootstrapValues.size());
		
		//print all the value and select the checkbox
		//Question-- if it is selected dont check it --need to perform 
//		for (WebElement value:bootstrapValues) {
//			System.out.println(value.getText());
//			value.click();
//			}
//		
//		for (WebElement value:bootstrapValues) {
//			System.out.println(value.getText());
//			if(value.getText().equals("MySQL")) {
//				value.click();
//				break;
//			}
//		}
		
		//print only checked checkboxs value
//		for (WebElement value:bootstrapValues) {
//			if(value.findElement(By.tagName("input")).isSelected()) {
//				System.out.println(value.getText());
//			}
//			
//			}
		
		
		for (WebElement value:bootstrapValues) {
			if(!(value.findElement(By.tagName("input")).isSelected())) {
				System.out.println(value.getText());
				value.click();
			}
			
			
			}
	
	}

}
