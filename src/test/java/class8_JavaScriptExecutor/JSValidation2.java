package class8_JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JSValidation2 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("http://demo.sentrifugo.com/index.php/");
		driver.get("https://www.w3schools.com/js/");

		getTitleUsingJS(driver);
		//waitForPageLoadUsingJS(driver);
//		WebElement submitButton=driver.findElement(By.id("loginsubmit"));
//		clickAnElementUsingJS(driver, submitButton);
//		WebElement userName=driver.findElement(By.id("username"));
//		sendDataUsingJS(driver, userName);
//		elementHighlighter(driver, userName);
		
		//WebElement text=driver.findElement(By.xpath("//h2[text()='Commonly Asked Questions']"));
		//pageScrollTillWebElementUsingJS(driver, text);
		//pageScrollUsingJS(driver);
		//displayAlertUsingJS(driver);
		pageRefreshUsingJS(driver);
	}

	//Get the title of page using jS
	public static void getTitleUsingJS(WebDriver driver) {

		JavascriptExecutor js=(JavascriptExecutor)driver;
		String title=js.executeScript("return document.title").toString();
		System.out.println(title);
	}

	//Wait for the page to be loaded using JS
	public static void waitForPageLoadUsingJS(WebDriver driver) {

		JavascriptExecutor js=(JavascriptExecutor)driver;
		String title=js.executeScript("return document.readyState").toString();
		if(title.equals("complete")) {
			System.out.println("loaded successfully");
		}else {
			System.out.println("not loaded successfully");
		}

	}

	//Perform a click operation using JS
	public static void clickAnElementUsingJS(WebDriver driver,WebElement element ) {

		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", element);
	}

	//Send a data to textbox using JS
	public static void sendDataUsingJS(WebDriver driver,WebElement element ) {

		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='Amit'", element);
	}

	//Highlight an element using JS
	public static void elementHighlighter(WebDriver driver,WebElement element ) {

		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].style.border='4px solid red'",element);
	}

	//using w3schools
	//scroll the page till the element is visiable using JS
	public static void pageScrollTillWebElementUsingJS(WebDriver driver,WebElement element ) {

		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)",element);
	}

	//Scroll the page directly giving the height
	public static void pageScrollUsingJS(WebDriver driver) {

		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,5000)");
	}
	//display the alert
	public static void displayAlertUsingJS(WebDriver driver) {

		JavascriptExecutor js=(JavascriptExecutor)driver;
		//	js.executeScript("window.alert('W3scholl')");
		js.executeScript("window.confirm('W3scholl')");
		//js.executeScript("window.prompt('W3scholl')");
	}

	//refresh the page 
	public static void pageRefreshUsingJS(WebDriver driver) {

		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.history.go(0)");
	}



}
