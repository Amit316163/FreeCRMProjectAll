package oldCalendarCode;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalendarHandling4 {

	static WebDriver driver=null;
	public static void main(String[] args) throws Exception {


		//Validate the given input (31-Oct-2022)
		//Select the date of current month and current year 
		//Select the date of future month and future year
		//Select the date of past month and past year
		
		
		WebDriverManager.chromedriver().setup();
		 driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.vroomvroomvroom.com/rv-rentals/");
		Thread.sleep(5000);
		calendarDateSelection("22-oct-2022", "dd-MMM-yyyy");
		Thread.sleep(2000);
		calendarDateSelection("22-oct-2023", "dd-MMM-yyyy");

	}
	
	public static void calendarDateSelection(String userInputDate,String dateFormat) throws Exception {
		
		SimpleDateFormat simpleDateFormat=new SimpleDateFormat(dateFormat);
		Calendar calendar=	Calendar.getInstance();
		Date formattedGivenDate;
		try {
			simpleDateFormat.setLenient(false);
			formattedGivenDate = simpleDateFormat.parse(userInputDate);
			
			calendar.setTime(formattedGivenDate);
			int givenDay=	calendar.get(Calendar.DAY_OF_MONTH);
			int givenMonth=	calendar.get(Calendar.MONTH);
			int givenYear=	calendar.get(Calendar.YEAR);
			
			scrollDown();
			WebElement calendarOption=driver.findElement(By.xpath("//input[@name='start_date_display']"));
			calendarOption.click();

			//now we want to select the future month
			//so first get the text through webElement (October 2022)
			String actualMonthYearData=driver.findElement(By.xpath("//table[@class=' table-condensed']//th[@class='datepicker-switch']")).getText();
			System.out.println(actualMonthYearData);
			//cant use below line since it is duplicate but we want format as mmm yyyy
			
			SimpleDateFormat actualFormat=new SimpleDateFormat("MMM yyyy");
			Date formattedActualData=actualFormat.parse(actualMonthYearData);
			calendar.setTime(formattedActualData);
			//calendar.setTime(new SimpleDateFormat("MMM yyyy").parse(actualMonthYearData));
			int actualMonth=calendar.get(Calendar.MONTH);
			int actualYear=calendar.get(Calendar.YEAR);
			
			
			while (givenMonth>actualMonth || givenYear>actualYear) {
				
				WebElement nextButton=driver.findElement(By.xpath("(//th[@class='next'])[1]"));
				nextButton.click();
				 actualMonthYearData=driver.findElement(By.xpath("//table[@class=' table-condensed']//th[@class='datepicker-switch']")).getText();
				 actualFormat=new SimpleDateFormat("MMM yyyy");
				 formattedActualData=actualFormat.parse(actualMonthYearData);
				calendar.setTime(formattedActualData);
				//calendar.setTime(new SimpleDateFormat("MMM yyyy").parse(actualMonthYearData));
				 actualMonth=calendar.get(Calendar.MONTH);
				 actualYear=calendar.get(Calendar.YEAR);
			}
		//	Current month and year--Date selction
			driver.findElement(By.xpath("//table[@class=' table-condensed']//td[text()='"+givenDay+"']")).click();
			
		} catch (ParseException e) {
			throw new Exception("Given date is invalid...Please provide the correct date ");
		}
	}
	

	public static void scrollDown() {
		
		Actions act=new Actions(driver);
		act.scrollToElement(driver.findElement(By.id("campervanBanner"))).perform();
	}
}
