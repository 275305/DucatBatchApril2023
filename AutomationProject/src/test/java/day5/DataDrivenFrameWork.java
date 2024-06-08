package day5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class DataDrivenFrameWork {

	
	@Test
	public static void readExcelFile() throws IOException, InterruptedException {

		String excelFilePath = ".\\ExcelFile\\DataExcelFile.xlsx";

		FileInputStream inputStream = new FileInputStream(excelFilePath);

		XSSFWorkbook workBook = new XSSFWorkbook(inputStream);
		// XSSFSheet sheet = workBook.getSheet("sheet1");
		XSSFSheet sheet = workBook.getSheetAt(0);

		int rows = sheet.getLastRowNum();
		int cols = sheet.getRow(1).getLastCellNum();
		
		for(int r=0;r<=rows;r++) {
			  XSSFRow row = sheet.getRow(r);
			
			for(int c=0;c<cols;c++) {
				
				XSSFCell cell = row.getCell(c);
				
				switch (cell.getCellType()) {
				case STRING: System.out.print(cell.getStringCellValue());break;
				case NUMERIC: System.out.println(cell.getNumericCellValue()); break;
				case BOOLEAN: System.out.println(cell.getBooleanCellValue());break;
				
						 }
				System.out.print("  | ");
				
				
			      }
			System.out.println();
		}

	}

	
	
}
