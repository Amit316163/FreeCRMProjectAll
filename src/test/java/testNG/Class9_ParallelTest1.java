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

//Sequential - run one by one
//Parallel -- run side by side

//1  ==> 5 min
//2  ==> 3 min
//3  ==> 10 min
//4  ==> 15 min
//5  ==> 5 min
//===============
//Seq --> 38 min to run all test cases one by one
//Parellel --> it will take 15 min to run side by side(saved 23 mint )

//parallel="false" thread-count="5"  ==> it will run sequential one by one
// parallel="none" thread-count="5"> ==> it will also run sequential one by one
//parallel="tests" thread-count="1"> ==> it will also run sequential one by one

//parallelSuiteLevelTesting
//<suite name="Suite" parallel="tests" thread-count="2"> -- two thread will be created Test1 will execute @20 thread
//Test2 will be execute @21 thread,If we have another test to run then once execution complete on any one of the thread then it will run Test3 -Note-Test3 can not run parallel with Test1 and Test2 since have only 2 threads.
//parallel="tests" thread-count="5"> --> here 3 Test run parallel on 3 threads but 2 thread will be remain ideal.

//parallelSuiteLevelTesting2
// parallel="classes" thread-count="2"> -->inside every Test it will create 2 threads-every thread one class will run
//parallel="classes" thread-count="10"> -- inside every test it will create 10 thread.- every thread one class will execute and remaning threads will remain ideal

//If you not define the thread-counts then it will consider default thread as 5

//parallelSuiteLevelTesting3
//parallel="methods" thread-count="2">--> it will go inside Test then inside class--> it will create 2 thread--> if you have 5 methods then it will run on 2 threads all test methods
//if you have multiple classes in Test -- then also it will create 2 threads. All classed methods will on 2 threads only

public class Class9_ParallelTest1 {
	
	@Test
	public void method1() {
		System.out.println("Class1==>method1==>"+Thread.currentThread().getId());
	}
	@Test
	public void method2() {
		System.out.println("Class1==>method2==>"+Thread.currentThread().getId());
	}
	@Test
	public void method3() {
		System.out.println("Class1==>method3==>"+Thread.currentThread().getId());
	}
	@Test
	public void method4() {
		System.out.println("Class1==>method4==>"+Thread.currentThread().getId());
	}
	@Test
	public void method5() {
		System.out.println("Class1==>method5==>"+Thread.currentThread().getId());
	}
}
