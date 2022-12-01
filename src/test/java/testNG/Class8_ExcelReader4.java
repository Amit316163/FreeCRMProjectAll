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

public class Class8_ExcelReader4 {
	

	
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
		
		String[][] data=new String[noOfRow][noOfCell];
		
		for(int i=1;i<noOfRow;i++) {
			for(int j=0;j<noOfCell;j++) {
				DataFormatter df=new DataFormatter();
				data[i][j]=df.formatCellValue(sheet.getRow(i).getCell(j));
				//System.out.println(data);
			}
			
		}
		for(String[] arrayData:data)
		System.out.println(Arrays.toString(arrayData));
		
		
		wb.close();
		fis.close();
		
	}

}
