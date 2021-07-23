package utils;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExceUtils {
		static XSSFWorkbook workbook;
		static XSSFSheet ExcelWSheet;
				
 public ExceUtils(String excelPath, String sheetName ) {
	
	try {
		workbook = new XSSFWorkbook(excelPath);
		ExcelWSheet = workbook.getSheet(sheetName);
	} catch (IOException e) {
		System.out.println("excel not found");
	}
	
 }
 
 
 public void getCellData(int getRow, int getCol) {
	 DataFormatter formatter = new DataFormatter();
	 formatter.formatCellValue(ExcelWSheet.getRow(getRow).getCell(getCol));
	 
 }
 public void getRowCount() {
	 int rowCount = ExcelWSheet.getPhysicalNumberOfRows();
	 		
	
}
}
 
 
 