package class2;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodsOfcheckbox {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Online_Selenium_Class\\OnlineBatch\\SeleniumJars\\chromedriver_win32\\chromedriver.exe");

		 driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
	//Select a single checkbox using locators and validate it is selected or not
	
//		WebElement selectCriketRadioButton=driver.findElement(By.xpath("//input[@value='Cricket']"));
//		selectCriketRadioButton.click();
//		System.out.println(selectCriketRadioButton.isSelected());
		
		//select all the checkbox and get their values
		
//	
//		List<WebElement> checkboxList=driver.findElements(By.xpath("//input[@type='checkbox']"));
//		
//		for(int i=0;i<checkboxList.size();i++) {
//			checkboxList.get(i).click();
//			System.out.println(checkboxList.get(i).getAttribute("value"));
//		}
		

		//Select the value by given checkbox name and attrubute name
		//selectCheckboxUsingValue("Movies", "value");
		selectCheckbox("Movies", "value");
		
		
		
	}
	
//	public static void selectCheckboxUsingValue(String checkboxFieldName,String attributeName) {
//		List<WebElement> checkboxList=driver.findElements(By.xpath("//input[@type='checkbox']"));
//
//		for(int i=0;i<checkboxList.size();i++) {
//			
//			if(checkboxList.get(i).getAttribute(attributeName).equals(checkboxFieldName)) {
//			checkboxList.get(i).click();
//			System.out.println(checkboxList.get(i).getAttribute(attributeName));
//			break;
//			}
//		}
//		
//	}
	public static void selectCheckbox(String checkboxFieldName,String attributeName) {
		List<WebElement> checkboxList=driver.findElements(By.xpath("//input[@type='checkbox']"));

		for(int i=0;i<checkboxList.size();i++) {
			
			if(checkboxList.get(i).getAttribute(attributeName).equals(checkboxFieldName)) {
				
				if(checkboxList.get(i).isSelected()) {
					System.out.println("Already selected");
				}else {
					System.out.println("Checkbox is not selected and selecting now");
					checkboxList.get(i).click();
				}
				break;
			
			}
		}
		
	}

}
