package oldCalendarCode;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalendarHandlingCondition_2 {
	
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.get("https://www.goibibo.com/bus/");
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		
		WebElement calendarOption=driver.findElement(By.xpath("//input[@placeholder='Pick a date']"));
		calendarOption.click();
		calendarHandling("2022","Dec","31");
	}
	
	public static void calendarHandling(String enteredYear,String enteredMonth,String enteredDate) {
		
		WebElement year=driver.findElement(By.xpath("//p[contains(@class,'dcalendarstyles__MonthNamePara')]"));
		
		if(year.getText().contains(enteredYear)) {
			System.out.println("year is same as entered year");
			WebElement month=driver.findElement(By.xpath("//p[contains(@class,'dcalendarstyles__MonthNamePara')]"));
		
			if(month.getText().contains(enteredMonth)) {
				System.out.println("year is same as entered year");
				List<WebElement> multipleDates=driver.findElements(By.xpath("//ul[contains(@class,'dcalendarstyles__DateWrapDiv')]//li[@style='color: black;']"));
			
			for(WebElement date:multipleDates) {
				
				if(date.getText().contains(enteredDate)) {
					date.click();
					break;
				}
			}
			}else {
				
				System.out.println("month  is not same as entered month");
				while(!month.getText().contains(enteredMonth)) {
					
					WebElement rightNavigationArrow=driver.findElement(By.xpath("(//div[contains(@class,'dcalendarstyles__SliderArrow')])[2]"));
					rightNavigationArrow.click();
				}
				System.out.println("Dec mil gya");
				List<WebElement> multipleDates=driver.findElements(By.xpath("//ul[contains(@class,'dcalendarstyles__DateWrapDiv')]//li[@style='color: black;']"));
				
				for(WebElement date:multipleDates) {
					
					if(date.getText().contains(enteredDate)) {
						date.click();
						break;
					}
				}
			}
		}
		
	}
	
	
		
		
	}

