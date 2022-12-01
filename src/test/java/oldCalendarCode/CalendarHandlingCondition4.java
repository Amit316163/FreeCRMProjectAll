package oldCalendarCode;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalendarHandlingCondition4 {
	
	static WebDriver driver;
	
	// this is old code but new created for this CalendarHandlingCondition1_2 class 
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		
		driver.get("https://www.goibibo.com/flights/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		
		WebElement calendarOption=driver.findElement(By.xpath("(//div[@class='sc-hiCibw elvOMS'])[3]"));
		calendarOption.click();
		calendarHandling("2023", "Sept", "30");	
		
		
	}
	
	//Condition 1
	public static void calendarHandling(String year,String month,String date) throws InterruptedException {
		
		WebElement displayYearAndMonth1=driver.findElement(By.xpath("(//div[@class='DayPicker-Caption'])[1]"));
		
		if(displayYearAndMonth1.getText().contains(year)) {
			
			System.out.println("Year is same as entered year ");
			
			
			if(displayYearAndMonth1.getText().contains(month)) {
				
				System.out.println("Default Month is same as entered month ");
				List <WebElement> currentMonthDates=driver.findElements(By.xpath("(//div[@class='DayPicker-Body'])[1]//div[@aria-disabled='false']/p"));
				
				for(WebElement dates:currentMonthDates) {
					
					if(dates.getText().equals(date)) {
						
						JavascriptExecutor js=(JavascriptExecutor)driver;
						js.executeScript("arguments[0].click()", dates);
						//dates.click();
						driver.findElement(By.xpath("//span[text()='Done']")).click();
						break;
					}
				}
			}
		
			
			else if (!displayYearAndMonth1.getText().contains(month)) {
				System.out.println("Default Month is not same as entered month ");
				//WebElement displayYearAndMonth2=driver.findElement(By.xpath("(//div[@class='DayPicker-Caption'])[2]"));

				List <WebElement> currentMonthDates=driver.findElements(By.xpath("(//div[@class='DayPicker-Body'])[2]//div[@aria-disabled='false']/p"));
				
				for(WebElement dates:currentMonthDates) {
					
					if(dates.getText().equals(date)) {
						
						JavascriptExecutor js=(JavascriptExecutor)driver;
						js.executeScript("arguments[0].click()", dates);
						//dates.click();
						driver.findElement(By.xpath("//span[text()='Done']")).click();
						break;
					}
				}
			}
			
			
			
		}else {

			
			System.out.println("Year is not same as entered year ");
			while (!displayYearAndMonth1.getText().contains(year)) {
				WebElement rightClick=driver.findElement(By.xpath("//span[@aria-label='Next Month']"));
				rightClick.click();
				Thread.sleep(200);
			}
			System.out.println("======");
			
			while(!displayYearAndMonth1.getText().contains(month)) {
				WebElement rightClick=driver.findElement(By.xpath("//span[@aria-label='Next Month']"));
				rightClick.click();
				Thread.sleep(200);
			}
			if(displayYearAndMonth1.getText().contains(month)) {
				
				System.out.println("Default Month is same as entered month ");
				List <WebElement> currentMonthDates=driver.findElements(By.xpath("(//div[@class='DayPicker-Body'])[1]//div[@aria-disabled='false']/p"));
				
				for(WebElement dates:currentMonthDates) {
					
					if(dates.getText().equals(date)) {
						
						JavascriptExecutor js=(JavascriptExecutor)driver;
						js.executeScript("arguments[0].click()", dates);
						//dates.click();
						driver.findElement(By.xpath("//span[text()='Done']")).click();
						break;
					}
				}
			}
		
			
			else if (!displayYearAndMonth1.getText().contains(month)) {
				System.out.println("Default Month is not same as entered month ");
				//WebElement displayYearAndMonth2=driver.findElement(By.xpath("(//div[@class='DayPicker-Caption'])[2]"));

				List <WebElement> currentMonthDates=driver.findElements(By.xpath("(//div[@class='DayPicker-Body'])[2]//div[@aria-disabled='false']/p"));
				
				for(WebElement dates:currentMonthDates) {
					
					if(dates.getText().equals(date)) {
						
						JavascriptExecutor js=(JavascriptExecutor)driver;
						js.executeScript("arguments[0].click()", dates);
						//dates.click();
						driver.findElement(By.xpath("//span[text()='Done']")).click();
						break;
					}
				}
			}
			
			
			
		
		}
		
		
		
		
	}

}
