package testNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Class8_ExcelReader3 {
	
	
	
	public static void main(String[] args) throws IOException {
		
		File file=new File ("C:\\Users\\Amit Singh\\OneDrive\\Desktop\\myExcelData.xlsx");
		System.out.println(file.exists());
		FileInputStream fis=new FileInputStream(file);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);	
		XSSFSheet sheet= wb.getSheet("sheet1");
		
		int noOfRow=sheet.getPhysicalNumberOfRows();
		System.out.println(noOfRow);//all row num 
		
		int noOfCell=sheet.getRow(0).getLastCellNum();
		System.out.println(noOfCell);
		
		for(int i=0;i<noOfRow-1;i++) {
			
			for(int j=0;j<noOfCell;j++) {
				
				//System.out.println(sheet.getRow(i).getCell(j).getStringCellValue());
				//Add dataformatter and increase the row num from 0 to 1
				DataFormatter df=new DataFormatter();
				String excelData=df.formatCellValue(sheet.getRow(i+1).getCell(j));
				System.out.println(excelData);
			}
			System.out.println();
		}
		
		
		wb.close();
		fis.close();
		
	}

}
