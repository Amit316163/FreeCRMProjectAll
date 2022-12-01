package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Class6_HardAssertions {


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

		String homePageTitle=driver.getTitle();
		Assert.assertEquals(homePageTitle, "OrangeHRM","Verify the title of the page");

		Thread.sleep(3000);

		//Scenario 2-- verify username should be as ajay Chaudary
		
		String userName=driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).getText();
		//Assert.assertEquals(userName,"ajay Chaudary");
		Assert.assertEquals(userName,"ajay Singh");
		//hard assertion -next link code will not get execute it will move to next test 

		//Scenario 3--Validate the dashboard text displayed on home page screen 
		
		boolean dashboardText=driver.findElement(By.xpath("//h6[text()='Dashboard']")).isDisplayed();
		Assert.assertTrue(dashboardText);



	}
	@Test
	public void logout() throws InterruptedException {
		
	driver.close();


	}

}
