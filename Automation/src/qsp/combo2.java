package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class combo2 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("file:///C:/Users/pavan/Desktop/page3.html");
	Thread.sleep(1000);
	driver.findElement(By.id("a2")).clear();
	Thread.sleep(2000);
	driver.findElement(By.name("n2")).sendKeys("kishore");
	Thread.sleep(2000);

	driver.close();
}
}
