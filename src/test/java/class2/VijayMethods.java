package class2;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VijayMethods {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.get("https://rbi.org.in/Scripts/HolidayMatrixDisplay.aspx");
		driver.manage().window().maximize();
		
		WebElement city=driver.findElement(By.xpath("//div[@id='example-one']/select[1]"));
		Select select=new Select(city);
		select.selectByVisibleText("Mumbai");
		WebElement month=driver.findElement(By.xpath("//div[@id='example-one']/select[2]"));
		Select select1=new Select(month);
		select1.selectByIndex(0);
		driver.findElement(By.xpath("//input[@id='btnGo']")).click();
		
		List<WebElement> allHeader=driver.findElements(By.xpath("(//table[@class='tablebg'])[3]/tbody/tr/td[@class='tableheader']"));
		List<WebElement> all = 	driver.findElements(By.xpath("(//table[@class='tablebg'])[3]/tbody/tr/td[not(@align='center') and not(@class='tableheader')]"));

//		for(WebElement head:allHeader) {
//			all=head.findElements(By.xpath("(//table[@class='tablebg'])[3]/tbody/tr/td[not(@align='center') and not(@class='tableheader')]"));
//		}
		for(int i=1;i<=allHeader.size();i++) {
			
		WebElement header=	driver.findElement(By.xpath("(//td[@class='tableheader'])["+i+"]"));
		System.out.print(header.getText()+" ");
		
	//	for(int j=1;j<=5;j++) {
			List<WebElement> hd=header.findElements(By.xpath("(//table[@class='tablebg'])[3]/tbody/tr/td[not(@align='center')]"));
			//WebElement values=	driver.findElement(By.xpath("(//td[@class='tableheader'])["+i+"]/following::td["+j+"]"));
	for(WebElement values:hd) {
		
			System.out.print(values.getText()+" ");
			if(!header.getText().equals(values.getText())) {
				break;
			}
		System.out.println();
		}
		
		
		//(//table[@class='tablebg'])[3]/tbody/tr[1]/td[@class='tableheader']/following::td[2]
//		List<WebElement> allHeader=driver.findElements(By.xpath("(//table[@class='tablebg'])[3]/tbody/tr/td[@class='tableheader']"));
//		for(WebElement header:allHeader) {
//			System.out.print(header.getText());//jan
//			List<WebElement> allColValues=header.findElements(By.xpath("(//table[@class='tablebg'])[3]/tbody/tr/td[@class='tableheader']/following::td"));
//		
//			for(WebElement colValue:allColValues) {
//				
//				System.out.print(colValue.getText());//1 and 2 row
//				if(header.getText().) {
//					System.out.println();
//				}
//				
//			}
//			
//		}
		
		
		
		
		
		
		
		
		
//		int rowData=driver.findElements(By.xpath("(//table[@class='tablebg'])[3]/tbody/tr/td[@class='tableheader']/b")).size();
//		System.out.println(rowData);//8
//		//[not(@align='center') and not(@class='tableheader')]
//		int colData=driver.findElements(By.xpath("(//table[@class='tablebg'])[3]/tbody/tr/td[not(@align='center') and not(@class='tableheader')]")).size();
//		System.out.println(colData);
//		
//		String firstPart="(//table[@class='tablebg'])[3]/tbody/tr[";
//		String secondPart="]/td[";
//		String thirdPart="]";
		
//		for(int i=0;i<=rowData;i++) {
//			List<WebElement> data=driver.findElements(By.xpath("(//table[@class='tablebg'])[3]/tbody/tr/td[@class='tableheader']/b"));
//
//
//			for(WebElement first:data) {
//				System.out.println(first.getText());
//			}
//			
//			for(int j=0;j<=colData;j++) {
//				List<WebElement> data1=driver.findElements(By.xpath("(//table[@class='tablebg'])[3]/tbody/tr/td[not(@align='center') and not(@class='tableheader')]"));
//
//				for(WebElement sec:data1) {
//					System.out.println(sec.getText());
//				}
//			if(first.getText())
//				System.out.println();
//			}
//		}
		
	//	(//table[@class='tablebg'])[3]/tbody/tr/td[@class='tableheader']//8
		
	//	(//table[@class='tablebg'])[3]/tbody/tr/td[not(@align='center') and not(@class='tableheader')] //38
		
		
//		String firstPart="(//table[@class='tablebg'])[3]/tbody/tr[";
//		String secondPart="]/td[";
//		String thirdPart="]";
//
//		for(int i=2;i<=rowData;i++) {
//			
//			for(int j=1;j<=2;j++) {
//				
//				String finalPart=firstPart+i+secondPart+j+thirdPart;
//				String data=driver.findElement(By.xpath(finalPart)).getText();
//				System.out.print(data+" ");
//				
//			}
//			System.out.println();
//			
//		}
		}
		
}}