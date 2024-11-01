package com.project.testData;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;


public class ReadExcelWithSelenium {
	
	@Test
	public int readExcelNumricValue() {
        
        // Specify the path of the Excel file
		String path = System.getProperty("user.dir");
		String excelFilePath = path + "\\lib\\test_data_KrispyKreme.xlsx";
        
        // Read mobile numbers from the Excel file
        try {
            FileInputStream file = new FileInputStream(new File(excelFilePath));
            Workbook workbook = new XSSFWorkbook(file);
            Sheet sheet = workbook.getSheetAt(0);  // Assuming mobile numbers are in the first sheet

            Iterator<Row> rowIterator = sheet.iterator();
            while (rowIterator.hasNext()) {
                Row row = rowIterator.next();
                
                Cell cell = row.getCell(0);  // Assuming mobile numbers are in the first column

                switch (cell.getCellType()) {
                   
                        
                    case NUMERIC:
                        return (int) cell.getNumericCellValue();
                       
                    default:
                        System.out.println("Invalid data type");
                        break;
                }
            }
            workbook.close();
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
		return 0;
		

        
    }

	

}
