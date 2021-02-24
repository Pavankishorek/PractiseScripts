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

public class Handlingexcel2 {
public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
	FileInputStream fis=new  FileInputStream("./excel/demo.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	Sheet s = wb.getSheet("sheet1");
	System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(1000);
	
	List<WebElement> links = driver.findElements(By.xpath("//a"));
	for(int i=0;i<links.size();i++)
	{
		
		Row r = s.createRow(i);
		Cell c = r.createCell(0);
		c.setCellValue(links.get(i).getAttribute("href"));
		
	}
	FileOutputStream fout=new FileOutputStream("./excel/demo.xlsx");
	wb.write(fout);
}
}
