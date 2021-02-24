package qsp1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Handlingexcel1 {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream("./excel/FT scenarios.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	Sheet s = wb.getSheet("sheet2");
	Row r = s.createRow(0);
	Cell c = r.createCell(0);
	c.setCellValue("kishore");
	FileOutputStream fout=new FileOutputStream("./excel/FT scenarios.xlsx");
	wb.write(fout);
	}
}
