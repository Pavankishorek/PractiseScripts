package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtrials3 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/pavan/Desktop/ADV.SELENIUM/page9.html");
	Thread.sleep(2000);
	
	WebElement ele = driver.findElement(By.xpath("//input[@value='hello']"));
	Thread.sleep(2000);
	WebElement ele1 = driver.findElement(By.xpath("//input[@value='world']"));
	Thread.sleep(2000);
	ele.sendKeys(Keys.CONTROL+"ax");
	Thread.sleep(2000);
	 ele1.sendKeys(Keys.CONTROL+"av");
	 
}
}
