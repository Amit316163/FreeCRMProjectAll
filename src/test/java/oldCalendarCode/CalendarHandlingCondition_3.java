package oldCalendarCode;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalendarHandlingCondition_3 {
	
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.get("https://www.goibibo.com/bus/");
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		
		
		calendarHandling("2022","Oct","31");
		Thread.sleep(2000);
		calendarHandling("2022","Dec","31");
		Thread.sleep(2000);
		calendarHandling("2023","Apr","30");
	}
	
	public static void calendarHandling(String enteredYear,String enteredMonth,String enteredDate) {
		WebElement calendarOption=driver.findElement(By.xpath("//input[@placeholder='Pick a date']"));
		calendarOption.click();
		
		WebElement year=driver.findElement(By.xpath("//p[contains(@class,'dcalendarstyles__MonthNamePara')]"));
		WebElement month=driver.findElement(By.xpath("//p[contains(@class,'dcalendarstyles__MonthNamePara')]"));
		WebElement rightNavigationArrow=driver.findElement(By.xpath("(//div[contains(@class,'dcalendarstyles__SliderArrow')])[2]"));
		
		while(!year.getText().contains(enteredYear)) {
			
			rightNavigationArrow.click();
			
		}
	
		while(!month.getText().contains(enteredMonth)) {
			rightNavigationArrow.click();
			
		}
			
		List<WebElement> multipleDates1=driver.findElements(By.xpath("//ul[contains(@class,'dcalendarstyles__DateWrapDiv')]//li[@style='color: black;']"));
		
		for(WebElement date:multipleDates1) {
			
			if(date.getText().contains(enteredDate)) {
				date.click();
				break;
			}
		
			
		}
		
	}
	
}

