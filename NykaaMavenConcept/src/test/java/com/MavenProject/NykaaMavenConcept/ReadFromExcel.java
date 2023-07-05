package com.MavenProject.NykaaMavenConcept;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadFromExcel {

	public static void main(String[] args) throws IOException {
		//Enter File location
		File f = new File("C:\\Users\\User\\eclipse-workspace\\NykaaMavenConcept\\src\\excel\\WriteinExcel.xlsx");
		//To open Excel file
		FileInputStream fis = new FileInputStream(f);
		//To open the workbook
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		//The above step is common for both write and read
        Sheet sheet = wb.getSheetAt(0);
        Row row = sheet.getRow(0);
        Cell cell = row.getCell(0);
        System.out.println(cell);
        wb.close();
	}

}
