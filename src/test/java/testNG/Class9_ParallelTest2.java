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




public class Class9_ParallelTest2 {
	
	////parallelTestLevelTesting
	//parallel="classes" thread-count="2"> -->it will create 2 threads and all classes will run at this 2 threads only
	//if any other Test are present and not define with any parallel execution then that will run sequential(seperate thread)
	
	//parallelTestLevelTesting2
	//parallel="methods" thread-count="2"> ->Inside test if we have multiple classes and inside classes we have multiple methods then all will run at 2 threads parallel 
	//parallel="methods" thread-count="5">->Inside test if we have multiple classes and inside classes we have multiple methods then all methods will run at 5 threads parallel
	
	@Test
	public void method6() {
		System.out.println("Class2==>method6==>"+Thread.currentThread().getId());
	}
	@Test
	public void method7() {
		System.out.println("Class2==>method7==>"+Thread.currentThread().getId());
	}
	@Test
	public void method8() {
		System.out.println("Class2==>method8==>"+Thread.currentThread().getId());
	}
	@Test
	public void method9() {
		System.out.println("Class2==>method9==>"+Thread.currentThread().getId());
	}
	
}
