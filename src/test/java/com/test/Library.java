package com.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class Library {
	
	public String readXpathFromExcel() {
		Workbook workbook=null;
		try {
			workbook=new HSSFWorkbook(new FileInputStream(new File("C:\\Users\\jhimit\\Downloads\\Locators.xls")));
			Sheet worksheet=workbook.getSheetAt(0);
			return worksheet.getRow(0).getCell(0).getStringCellValue();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
		}
		
		return "";
	}

}
