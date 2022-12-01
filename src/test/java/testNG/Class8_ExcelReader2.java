package testNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Class8_ExcelReader2 {
	
	// excel file ext  --xls(HSSF) and xlsx(XSSF)
	//apache poi and JXL
	//need to download- apache POI and apache ooxml
	
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
		
		for(int i=0;i<noOfRow;i++) {
			
			for(int j=0;j<noOfCell;j++) {
				
				System.out.println(sheet.getRow(i).getCell(j).getStringCellValue());
			}
			System.out.println();
		}
		
		
		wb.close();
		fis.close();
		
	}

}
