package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Class6_SoftAssertions {


	WebDriver driver;
	@Test
	public void loginValidation() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		 driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		//scenario 1--Validate the title of the oage
			SoftAssert sa=new SoftAssert();
		String homePageTitle=driver.getTitle();
		sa.assertEquals(homePageTitle, "OrangeHRM","Verify the title of the page");
		Thread.sleep(3000);
		//Scenario 2-- verify username should be as ajay Chaudary
		String userName=driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).getText();
		//Assert.assertEquals(userName,"ajay Chaudary");
		sa.assertEquals(userName,"ajay Singh");
		//soft assertion -next link code should get executed 

		//Scenario 3--Validate the dashboard text displayed on home page screen 
		boolean dashboardText=driver.findElement(By.xpath("//h6[text()='Dashboard']")).isDisplayed();
		sa.assertTrue(dashboardText);
		System.out.println(dashboardText);
		//driver.close();
		sa.assertAll();//at the last if any assertion failed then it will capture and display on console

	}
	@Test
	public void logout() throws InterruptedException {
		
	driver.close();


	}

}
