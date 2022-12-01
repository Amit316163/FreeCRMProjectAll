package class8_JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JSValidation {
	
//	Using WebDriver :-
//	driver.findElement(By.xpath("")).sendKeys("dfdgd");
//	Two we can send the data in text box: -
//	1.JavascriptExecutor ==>> locators with JavascriptExecutor + without argument  
//	2.(JavascriptExecutor) WebDriver ==>> locators with JavascriptExecutor + with argument 
	

	static WebDriver driver=null;
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.sentrifugo.com/index.php/");
		//get the title of the page
		System.out.println(driver.getTitle());
		getTitleUsingJS();
		//		elementHighlighter();
		//		waitForPageLoadUsingJS();
		//		clickAnElementUsingJS();
		//		sendDataUsingJS();
		//		pageRefreshUsingJS();
		//pageScrollUsingJS();
		pageScrollTillWebElementUsingJS();
		displayAlertUsingJS();
	}

	public static void getTitleUsingJS() {

		JavascriptExecutor js=(JavascriptExecutor)driver;
		String title=js.executeScript("return document.title").toString();
		System.out.println(title);
	}
	public static void waitForPageLoadUsingJS() {

		JavascriptExecutor js=(JavascriptExecutor)driver;
		String title=js.executeScript("return document.readyState").toString();
		if(title.equals("complete")) {
			System.out.println("loaded successfully");
		}else {
			System.out.println("not loaded successfully");
		}

	}
	public static void clickAnElementUsingJS() {

		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", driver.findElement(By.id("loginsubmit")));
	}

	public static void sendDataUsingJS() {

		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='Amit'", driver.findElement(By.id("username")));
	}

	public static void elementHighlighter() {

		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].style.border='4px solid red'",driver.findElement(By.id("loginsubmit")));
	}

	public static void pageScrollTillWebElementUsingJS() {

		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)",driver.findElement(By.xpath("//h2[text()='Commonly Asked Questions']")));
	}


	public static void pageScrollUsingJS() {

		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,6516)");
	}
	
	public static void displayAlertUsingJS() {

		JavascriptExecutor js=(JavascriptExecutor)driver;
	//	js.executeScript("window.alert('W3scholl')");
		js.executeScript("window.confirm('W3scholl')");
		//js.executeScript("window.prompt('W3scholl')");
	}
	
	public static void pageRefreshUsingJS() {

		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("history.go(0)");
	}

 

}
