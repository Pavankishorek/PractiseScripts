package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class trial4 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("flipkart");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[.='flipkart']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//h3[@class='LC20lb DKV0Md']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("Pavan@xyz.com");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("kishore");
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//span[.='Login'])[3]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
}
}
