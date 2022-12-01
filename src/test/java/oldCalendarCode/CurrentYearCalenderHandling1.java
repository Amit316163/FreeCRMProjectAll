package oldCalendarCode;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CurrentYearCalenderHandling1 {
	static WebDriver driver =null;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.vroomvroomvroom.com/rv-rentals/");
		Thread.sleep(5000);
		selectBookingdate("2028", "Dec", "30");
	}


	public static void selectBookingdate(String givenYear,String gievnMonth,String gievnDate ) throws InterruptedException {

		WebElement calendarOption=driver.findElement(By.xpath("//input[@name='start_date_display']"));
		calendarOption.click();

		WebElement yearValue=driver.findElement(By.xpath("(//th[@class='datepicker-switch'])[1]"));
		Actions act=new Actions(driver);
		act.scrollToElement(driver.findElement(By.id("campervanBanner"))).perform();
		if(yearValue.getText().contains(givenYear)) {//year same isliye go for month now

			WebElement monthValue=driver.findElement(By.xpath("(//th[@class='datepicker-switch'])[1]"));

			while(!monthValue.getText().contains(gievnMonth)) { //dec equal dec

				WebElement nextButton=driver.findElement(By.xpath("(//th[@class='next'])[1]"));
				nextButton.click();
				Thread.sleep(3000);


			}
			
			List<WebElement> allDates=	driver.findElements(By.xpath("//table[@class=' table-condensed']/tbody/tr/td[@class='day']"));
			
			for(WebElement date:allDates) {
				String dateText=	date.getText();
				if(dateText.equalsIgnoreCase(gievnDate)) {
					date.click();
					break;
			
		

		}}

	}else {
		
		
		yearValue.click();
		Thread.sleep(2000);
		WebElement yeaSelection=driver.findElement(By.xpath("(//th[@class='datepicker-switch'])[2]"));
		if(!yeaSelection.getText().equals(givenYear)) {
			
			while(!yeaSelection.getText().equals(givenYear)) {
				WebElement nextButton=driver.findElement(By.xpath("(//th[@class='next'])[2]"));
				nextButton.click();
				Thread.sleep(2000);

			}
			List<WebElement> allMonths=	driver.findElements(By.xpath("//table[@class='table-condensed']/tbody/tr/td/span[@class='month']"));
			
			for(WebElement month:allMonths) {
				String monthValue=	month.getText();
				if(monthValue.equalsIgnoreCase(gievnMonth)) {
					month.click();
					break;
		}
			}
	
	List<WebElement> allDates=	driver.findElements(By.xpath("//table[@class=' table-condensed']/tbody/tr/td[@class='day']"));
			
			for(WebElement date:allDates) {
				String dateText=	date.getText();
				if(dateText.equalsIgnoreCase(gievnDate)) {
					date.click();
					break;
			
		

		}}
	
	
	
	}

	}}}



