package oldCalendarCode;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CurrentYearCalenderHandling {
	static WebDriver driver =null;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.vroomvroomvroom.com/");
		Thread.sleep(5000);
		selectBookingdate("2022", "Dec", "30");
	}


	public static void selectBookingdate(String givenYear,String gievnMonth,String gievnDate ) throws InterruptedException {

		WebElement calendarOption=driver.findElement(By.xpath("//input[@id='vvv-pickup-date']"));
		calendarOption.click();

		WebElement yearValue=driver.findElement(By.xpath("//div[@class='vsf-flex vsf-items-center']/div[2]"));

		if(yearValue.getText().contains(givenYear)) {

			WebElement monthValue=driver.findElement(By.xpath("//div[@class='vsf-flex vsf-items-center']/div[2]"));

			while(!monthValue.getText().contains(gievnMonth)) {

				WebElement nextButton=driver.findElement(By.xpath("//div[@class='vsf-flex vsf-items-center']/div[3]/button"));
				nextButton.click();
				Thread.sleep(3000);


			}
			
			List<WebElement> allDates=	driver.findElements(By.xpath("//div[@role='presentation']/span/button[not(@disabled)]"));
			
			for(WebElement date:allDates) {
				String dateText=	date.getAttribute("data-date");
				System.out.println(dateText);
				if(dateText.contains(gievnMonth)) {
					System.out.println("sdfd");
				}
				if(dateText.equalsIgnoreCase(gievnDate)) {
					date.click();
					break;
//			String firstXpath="//div[@role='presentation']/span/button[not(@disabled) and @data-date='";
//				String secondXpath=	"']";   //"2022-10-09']";
//			System.out.println(givenYear );
//			System.out.println(gievnMonth );
//			System.out.println(gievnDate);
//				String fullXpath=firstXpath+givenYear+"-"+gievnMonth+"-"+gievnDate+secondXpath;
//					////div[@role='presentation']/span/button[not(@disabled) and @data-date='
//					
//				WebElement date=	driver.findElement(By.xpath(fullXpath));
//				
//						date.click();
					}}
		

		}}

	}




//List<WebElement> allDates=	driver.findElements(By.xpath("//div[@role='presentation']/span/button[not(@disabled)]"));
//
//for(WebElement date:allDates) {
//	String dateText=	date.getText();
//	if(dateText.equalsIgnoreCase(gievnDate)) {
//		date.click();
//		break;