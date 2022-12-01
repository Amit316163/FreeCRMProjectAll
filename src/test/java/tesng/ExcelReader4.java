package tesng;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ExcelReader4 {
	
	@DataProvider(name="login")
	public  String[][] getDataFromExcel() throws IOException {
		
		File file=new File("./src/test/resources/data/myExcelData.xlsx");
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		//number of row
		int noOfRows=sheet.getPhysicalNumberOfRows();		//3
		System.out.println(noOfRows);
		//no of cell
		int noOfColumns=sheet.getRow(0).getLastCellNum();
		System.out.println(noOfColumns);//2
		
		String[][] data=new String[noOfRows-1][noOfColumns];
		
		//if you write i =0 then it will print username and password so start index from 1
		for(int i=0;i<noOfRows-1;i++) {
			for(int j=0;j<noOfColumns;j++) {
				
				//we use this to print our data in String --even you pass integer in excel
				DataFormatter df=new DataFormatter();
				data[i][j]=df.formatCellValue(sheet.getRow(i+1).getCell(j));
			}
		}
	
		
		workbook.close();
		fis.close();
		
		return data;
		
	}

}
