package testNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Class8_ExcelReader {
	
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
		
		int noOfRowData=sheet.getLastRowNum();
		System.out.println(noOfRowData);//all row num by index
		
		
		int noOfCell=sheet.getRow(0).getLastCellNum();
		System.out.println(noOfCell);
		
		
		wb.close();
		fis.close();
		
	}

}
