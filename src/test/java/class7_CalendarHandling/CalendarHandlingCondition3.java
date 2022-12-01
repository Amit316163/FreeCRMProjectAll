package class7_CalendarHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalendarHandlingCondition3 {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();

		driver.get("https://www.goibibo.com/bus/");
		driver.manage().window().maximize();

		Thread.sleep(4000);

		WebElement calendarOption=driver.findElement(By.xpath("//input[@placeholder='Pick a date']"));
		calendarOption.click();
		calendarHandling("2023", "Jan", "30");	
	}
	//Condition 3
	public static void calendarHandling(String year,String month,String date) throws InterruptedException {

		WebElement displayYearAndMonth=driver.findElement(By.xpath("//p[contains(@class,'dcalendarstyles__MonthName')]"));

		if(displayYearAndMonth.getText().contains(year)) {

			System.out.println("Year is same as entered year ");


			if(displayYearAndMonth.getText().contains(month)) {

				System.out.println("Month is same as entered month ");
			}
			System.out.println("Month is not same as entered month ");
			while(!displayYearAndMonth.getText().contains(month)) {
				WebElement rightArrow=driver.findElement(By.xpath("//div[contains(@class,'dcalendarstyles__MonthChangeRightArrow')]"));
				rightArrow.click();
				Thread.sleep(200);

			}
			List <WebElement> currentMonthDates=driver.findElements(By.xpath("//li[@style='color: black;']"));

			for(WebElement dates:currentMonthDates) {

				if(dates.getText().equals(date)) {
					dates.click();
					break;
				}
			}
		}
		else {
			System.out.println("Year is not same as entered year ");
			while (!displayYearAndMonth.getText().contains(year)) {
				WebElement rightArrow=driver.findElement(By.xpath("//div[contains(@class,'dcalendarstyles__MonthChangeRightArrow')]"));
				rightArrow.click();
				Thread.sleep(200);
			}
			if(displayYearAndMonth.getText().contains(month)) {

				System.out.println("Month is same as entered month ");
			}

			System.out.println("Month is not same as entered month ");
			while(!displayYearAndMonth.getText().contains(month)) {
				WebElement rightArrow=driver.findElement(By.xpath("//div[contains(@class,'dcalendarstyles__MonthChangeRightArrow')]"));
				rightArrow.click();
				Thread.sleep(200);

			}
			List <WebElement> currentMonthDates=driver.findElements(By.xpath("//li[@style='color: black;']"));

			for(WebElement dates:currentMonthDates) {

				if(dates.getText().equals(date)) {
					dates.click();
					break;
				}
			}
		}




	}

}
