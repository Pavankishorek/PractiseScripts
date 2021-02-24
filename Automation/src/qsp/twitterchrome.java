package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class twitterchrome {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.twitter.com");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@data-testid='loginButton']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("pavan");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("kishore");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//div[@role='button']")).click();	
	}
}
