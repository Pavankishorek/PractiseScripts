package qsp1;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Datadrifetch {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream("./excel/demo.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sh = wb.getSheet("sheet2");
	int rowcount=sh.getLastRowNum()-sh.getFirstRowNum();
	for(int i=0;i<rowcount+1;i++){
		Row r = sh.getRow(i);
		for (int j = 0; j <r.getLastCellNum(); j++) {
			System.out.println(r.getCell(j).getStringCellValue()+"  ");
	}
		System.out.println();
}
}}