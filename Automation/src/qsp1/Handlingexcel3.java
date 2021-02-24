package qsp1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingexcel3 {
public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
	FileInputStream fis=new FileInputStream("./excel/demo.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	Sheet s = wb.getSheet("sheet2");
	
	System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.com/");
	Thread.sleep(1000);
	List<WebElement> images = driver.findElements(By.xpath("//img"));
	
	for(int i=0; i<images.size();i++)
	{
		Row r = s.createRow(i);
		Cell c = r.createCell(0);
		c.setCellValue(images.get(i).getAttribute("src"));
	}
	FileOutputStream fout=new FileOutputStream("./excel/demo.xlsx");
	wb.write(fout);
}
}
