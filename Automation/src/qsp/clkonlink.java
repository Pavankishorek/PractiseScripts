package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class clkonlink {
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	
	driver.get("file:///C:/Users/pavan/Desktop/page1.html");
	/*driver.findElement(By.tagName("a")).click();*/
	
	WebElement name = driver.findElement(By.tagName("a"));
	name.click();
	
	
}
}
