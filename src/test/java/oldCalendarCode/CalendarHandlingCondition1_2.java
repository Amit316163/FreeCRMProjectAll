package oldCalendarCode;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalendarHandlingCondition1_2 {
	
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		
		driver.get("https://www.goibibo.com/flights/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		
		WebElement calendarOption=driver.findElement(By.xpath("(//div[@class='sc-hiCibw elvOMS'])[3]"));
		calendarOption.click();
		//calendarHandling("October 2022", "31");
		calendarHandling("November 2022", "30");
		//calendarHandling("April 2023", "30");
		
		
	}
	
	public static void calendarHandling(String yearAndMonth,String date) throws InterruptedException {
		
		WebElement displayYearAndMonth1=driver.findElement(By.xpath("(//div[@class='DayPicker-Caption'])[1]"));
		
		//Condition 1
		if(displayYearAndMonth1.getText().contains(yearAndMonth)) {
			
			System.out.println("Year and month is same as entered year ");
			
			
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
		//Condition 2
		else   {
			
				System.out.println("Year and month is not same as entered yearAndMonth ");
				
				while(!displayYearAndMonth1.getText().contains(yearAndMonth)) {
					WebElement rightClick=driver.findElement(By.xpath("//span[@aria-label='Next Month']"));
					rightClick.click();
					Thread.sleep(200);
					
				}
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
			
		}
			
			
		
			
		
		
		
		
		}
	


