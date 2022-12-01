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

public class CalendarHandling2 {

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

		String userInput="31-October-2022";
		SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd-MMM-yyyy");
		Date formattedGivenDate;
		try {
			simpleDateFormat.setLenient(false);
			formattedGivenDate = simpleDateFormat.parse(userInput);
			System.out.println(formattedGivenDate);

			Calendar calendar=	Calendar.getInstance();
			calendar.setTime(formattedGivenDate);
			int givenDay=	calendar.get(Calendar.DAY_OF_MONTH);
			int givenMonth=	calendar.get(Calendar.MONTH);
			int givenYear=	calendar.get(Calendar.YEAR);
			scrollDown();
			
			WebElement calendarOption=driver.findElement(By.xpath("//input[@name='start_date_display']"));
			calendarOption.click();
			//Current month and year--Date selction
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
