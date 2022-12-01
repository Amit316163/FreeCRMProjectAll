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




public class Class9_ParallelTest3 {
	
	@Test
	public void method10() {
		System.out.println("Class3==>method10==>"+Thread.currentThread().getId());
	}
	@Test
	public void method11() {
		System.out.println("Class3==>method11==>"+Thread.currentThread().getId());
	}
	@Test
	public void method12() {
		System.out.println("Class3==>method12==>"+Thread.currentThread().getId());
	}
	
}
