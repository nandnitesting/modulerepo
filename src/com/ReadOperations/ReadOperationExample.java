package com.ReadOperations;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadOperationExample {

	public static void main(String[] args) throws IOException {

		FileInputStream excelTestDataFile=new FileInputStream("C:\\Users\\M RAMA CHENNAREDDY\\Desktop\\10-30 Batch\\CoreJava\\src\\com\\ReadOperations\\Data.xlsx");	
		//Identify the workbook in the excel

		XSSFWorkbook excelWorkbook=new XSSFWorkbook(excelTestDataFile);
		//Identify the sheets in the workbook
		XSSFSheet workbookSheet=excelWorkbook.getSheet("Sheet1");
		//Identify the rows in the sheet	
		XSSFRow sheetOfRow=workbookSheet.getRow(9);
		//Identify the cells in the row
		XSSFCell rowOfCell=sheetOfRow.getCell(6);
		//To read the text in the call
		String testData=rowOfCell.getStringCellValue();
		System.out.println(testData);

	}

}
