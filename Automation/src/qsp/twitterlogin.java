package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class twitterlogin {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.twitter.com");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@href='/login']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@data-focusable='true']")).sendKeys("pavan");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("kishore");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//div[@role='button']")).click();
}
}
