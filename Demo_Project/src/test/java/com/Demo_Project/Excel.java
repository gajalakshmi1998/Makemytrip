package com.Demo_Project;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class Excel {
	
	public static void particular() throws IOException {
		
	
		
File f = new File("C:\\Users\\God\\eclipse-workspace\\Demo_Project\\src\\xel\\work.xlsx");
		FileInputStream fi = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fi);
		org.apache.poi.ss.usermodel.Sheet sheetAt = wb.getSheetAt(0);
		Row row = sheetAt.getRow(0);
		Cell cell = row.getCell(0);
		  
		
		org.apache.poi.ss.usermodel.CellType cellData = cell.getCellType();
		
		
		if(cellData.equals(CellType.STRING)) {
			String value = cell.getStringCellValue();
			System.out.println(value);
			
		} else {
			
			double originalValue = cell.getNumericCellValue();
			int value = (int) originalValue;
			System.out.println(value);
		}}
		
		private static void entire() throws IOException {
			
			File f = new File("C:\\Users\\God\\eclipse-workspace\\Demo_Project\\src\\xel\\work.xlsx");
			FileInputStream fi = new FileInputStream(f);
			Workbook wb = new XSSFWorkbook(fi);
			
			org.apache.poi.ss.usermodel.Sheet sheetAt = wb.getSheetAt(0);
			
			int physicalNumberOfRows = sheetAt.getPhysicalNumberOfRows();
			for (int i = 0; i < physicalNumberOfRows; i++) {
				Row row = sheetAt.getRow(i);
				
				int physicalNumberOfCells = row.getPhysicalNumberOfCells();
				
				for (int j = 0; j <physicalNumberOfCells ; j++) {
					
					Cell cell = row.getCell(j);
					org.apache.poi.ss.usermodel.CellType cellData = cell.getCellType();
					
					
					if(cellData.equals(CellType.STRING)) {
						String value = cell.getStringCellValue();
						System.out.println(value);
						
					} else {
						
						double originalValue = cell.getNumericCellValue();
						int value = (int) originalValue;
						System.out.println(value);
					}}}}
		
		public static void main(String[] args) throws IOException {
			
			particular();
			
			System.out.println("================================");
			entire();
		}

}
