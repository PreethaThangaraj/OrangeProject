package com.MavenProject.NykaaMavenConcept;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadAll {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\\\Users\\\\User\\\\eclipse-workspace\\\\NykaaMavenConcept\\\\src\\\\excel\\\\WriteinExcel.xlsx");
		FileInputStream fis = new FileInputStream(f);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
	XSSFSheet sheet = wb.getSheetAt(0);
	int rows = sheet.getPhysicalNumberOfRows();
	int col = sheet.getRow(0).getPhysicalNumberOfCells();
		for(int i =0;i<=rows;i++)
		{
			XSSFRow row = sheet.getRow(i);
			for(int j=0;j<=col;j++) 
			{
	           XSSFCell cell = row.getCell(j);
	           switch(cell.getCellType())
	           {
	           case STRING:
	        	   System.out.println(cell.getStringCellValue());
	        	   break;
	           case BOOLEAN:
	        	   System.out.println(cell.getBooleanCellValue());
	        	   break;
	           case NUMERIC :
	        	   System.out.println(cell.getNumericCellValue());
	        	   break;
			default:
				break;
	           }
			}
			System.out.println();
		}
		
		wb.close();
	}

}
