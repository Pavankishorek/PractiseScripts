package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class clkonlink3 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
	System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("file:///C:/Users/pavan/Desktop/page1.html");
	Thread.sleep(1000);
	driver.findElement(By.name("n1")).click();
	driver.close();
	
	WebDriver driver1 =new FirefoxDriver();
	driver1.get("file:///C:/Users/pavan/Desktop/page1.html");
	Thread.sleep(2000);
	driver1.findElement(By.id("a1")).click();
	driver1.quit();
	
}
}
