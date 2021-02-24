package qsp1;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Handlingexcel {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream("./excel/FT scenarios.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	Sheet s = wb.getSheet("sheet2");	
	Row r = s.getRow(0);
	Cell c = r.getCell(0);
	String value = c.getStringCellValue();
	System.out.println(value);
}
}
