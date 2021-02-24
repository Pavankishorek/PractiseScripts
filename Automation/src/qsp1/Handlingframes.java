package qsp1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingframes {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/pavan/Desktop/ADV.SELENIUM/frame3.html");
	Thread.sleep(1000);
	driver.findElement(By.id("t1")).sendKeys("pavan");
	Thread.sleep(1000);
	driver.switchTo().frame(0);
	driver.findElement(By.id("t2")).sendKeys("kishore");
	Thread.sleep(1000);
	driver.switchTo().frame(0);
	driver.findElement(By.id("t3")).sendKeys("naidu");
	Thread.sleep(1000);
	driver.switchTo().defaultContent();
	Thread.sleep(1000);
	driver.findElement(By.id("t1")).clear();
	Thread.sleep(1000);
	driver.close();
}
}
