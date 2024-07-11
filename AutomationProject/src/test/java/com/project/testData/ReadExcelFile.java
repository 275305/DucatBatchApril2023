package com.project.testData;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFile {

	private XSSFWorkbook workbook;
	private XSSFSheet sheet;
	private XSSFCell cell;

	public String readExcel_Files(int row, int column) throws IOException {

		String path = System.getProperty("user.dir");
		String otherFolder = path + "\\lib\\test_data_KrispyKreme.xlsx";

		FileInputStream fileStream = new FileInputStream(new File(otherFolder));
		workbook = new XSSFWorkbook(fileStream);
		sheet = workbook.getSheet("LogIn");

		cell = sheet.getRow(row).getCell(column);
		cell.getStringCellValue();

		DataFormatter df = new DataFormatter();
		String name = df.formatCellValue(cell);

		return name;

	}
}
