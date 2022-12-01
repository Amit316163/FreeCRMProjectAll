package tesng;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader1 {
	
	public static void main(String[] args) throws IOException {
		
		File file=new File("C:\\Users\\Amit Singh\\OneDrive\\Desktop\\myExcelData.xlsx");
		System.out.println(file.exists());
		FileInputStream fis=new FileInputStream(file);
		
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		//number of row
		int noOfRows=sheet.getPhysicalNumberOfRows();	//3	
		//no of cell
		int noOfColumns=sheet.getRow(0).getLastCellNum();
		
		//if you write i =0 then it will print username and password so start index from 1
		for(int i=1;i<noOfRows;i++) {
			for(int j=0;j<noOfColumns;j++) {
				
				System.out.println(sheet.getRow(i).getCell(j).getStringCellValue());
			}
		}
		
		
		workbook.close();
		fis.close();
	}

}
