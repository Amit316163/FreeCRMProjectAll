package testNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;




public class Class9_ParallelTest4 {
	
	@Test
	public void method13() {
		System.out.println("Class4==>method13==>"+Thread.currentThread().getId());
	}
	@Test
	public void method14() {
		System.out.println("Class4==>method14==>"+Thread.currentThread().getId());
	}
	
}
