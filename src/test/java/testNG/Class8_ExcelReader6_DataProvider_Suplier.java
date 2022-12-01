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
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Class8_ExcelReader6_DataProvider_Suplier {
	
@DataProvider(name="login")
	@Test
	public  String[][]  excelReader()throws IOException {
		
		File file=new File ("C:\\Users\\Amit Singh\\OneDrive\\Desktop\\myExcelData.xlsx");
		System.out.println(file.exists());
		FileInputStream fis=new FileInputStream(file);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);	
		XSSFSheet sheet= wb.getSheet("sheet1");
		
		int noOfRow=sheet.getPhysicalNumberOfRows();
		System.out.println(noOfRow);//all row num 
		System.out.println(noOfRow-1);
		int noOfCell=sheet.getRow(0).getLastCellNum();
		System.out.println(noOfCell);
		
		//noOfRow-1 once you make the changes then exception thrown Index 2 out of bounds for length 2
		String[][] data=new String[noOfRow-1][noOfCell];
		
		//now changes required to run the loop fro
		for(int i=0;i<noOfRow-1;i++) {
			for(int j=0;j<noOfCell;j++) {
				DataFormatter df=new DataFormatter();
				//start the row after header
				data[i][j]=df.formatCellValue(sheet.getRow(i+1).getCell(j));
				//System.out.println(data);
			}
			
		}
		
		wb.close();
		fis.close();
		
		return data;
	}

}
