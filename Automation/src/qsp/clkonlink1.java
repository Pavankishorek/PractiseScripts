package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class clkonlink1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	
	driver.get("file:///C:/Users/pavan/Desktop/page1.html");
	driver.findElement(By.id("a1")).click();
	
	driver.close();
}
}
