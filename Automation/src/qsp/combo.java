package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class combo {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	
	driver.get("file:///C:/Users/pavan/Desktop/page2.html");
	Thread.sleep(1000);
	driver.findElement(By.id("a1")).sendKeys("Pavan kishore");
	Thread.sleep(1000);
	driver.findElement(By.name("n2")).clear();
	Thread.sleep(1000);
	driver.findElement(By.className("c3")).click();
	Thread.sleep(1000);
	driver.close();
}
}
