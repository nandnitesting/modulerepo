package com.ReadOperations;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteOperationExample {

	public static void main(String[] args) throws IOException {

		FileInputStream excelTestDataFile=new FileInputStream("C:\\Users\\M RAMA CHENNAREDDY\\Desktop\\10-30 Batch\\CoreJava\\src\\com\\ReadOperations\\Data.xlsx");

		XSSFWorkbook excelWorkbook=new XSSFWorkbook(excelTestDataFile);
		XSSFSheet workbookSheet=excelWorkbook.createSheet("Automation");
		XSSFRow sheetOfRow=workbookSheet.createRow(5);
		XSSFCell rowOfCell=sheetOfRow.createCell(6);
		rowOfCell.setCellValue("Testing");

		FileOutputStream saveExcelFile=new FileOutputStream("C:\\Users\\M RAMA CHENNAREDDY\\Desktop\\10-30 Batch\\CoreJava\\src\\com\\ReadOperations\\Data.xlsx");
		excelWorkbook.write(saveExcelFile);
	}

}
