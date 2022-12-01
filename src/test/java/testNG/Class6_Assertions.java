package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Class6_Assertions {
	
//	assertEquals
//	assertNotEquals
//	assertTrue
//	assertFalse
//	assertNull
//	assertNotNull
	
	@Test
	public void loginValidation() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		String homePageTitle=driver.getTitle();
		
		//Assert.assertEquals(homePageTitle, "OrangeHRM");
		Assert.assertEquals(homePageTitle, "OrangeHRM","Verify the title of the page");
	//	Assert.assertNotEquals(homePageTitle, "OrangeHRM");
		Thread.sleep(3000);
		boolean userNameLink=driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).isDisplayed();
		Assert.assertTrue(userNameLink);
		//Assert.assertFalse(userNameLink);
		
		String dashboardText=driver.findElement(By.xpath("//h6[text()='Dashboard']")).getText();
		Assert.assertNotNull(dashboardText);
		//Assert.assertNull(dashboardText);
		
	}

}
