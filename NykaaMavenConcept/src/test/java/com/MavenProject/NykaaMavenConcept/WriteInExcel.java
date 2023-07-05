package com.MavenProject.NykaaMavenConcept;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteInExcel {
public static void main(String[] args) throws IOException {
	//Enter File location
	File f = new File("C:\\Users\\User\\eclipse-workspace\\NykaaMavenConcept\\src\\excel\\WriteinExcel.xlsx");
	//To open Excel file
	FileInputStream fis = new FileInputStream(f);
	//To open the workbook
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	//The above step is common for both write and read
	
	//To open the already saved excel sheet
	
    Sheet sheet = wb.getSheet("jan");
    
    //To create a row
    Row createRow = sheet.createRow(0);
   
    //To create/select a cell
    Cell createCell = createRow.createCell(0);
    
    //To set value in the cell 
    createCell.setCellValue("NAME");
    wb.getSheet("jan").getRow(0).createCell(1).setCellValue("DEPARTMENT");
    wb.getSheet("jan").getRow(0).createCell(2).setCellValue("EMAIL");
    wb.getSheet("jan").getRow(0).createCell(3).setCellValue("CONTACT NO");
    
    //To write a data into excel
    
    FileOutputStream fos = new FileOutputStream(f);
    wb.write(fos);
    
    wb.close();
    
}
}
