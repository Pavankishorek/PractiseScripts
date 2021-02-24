package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com");
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("amazon");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//span[.='amazon']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//span[.='Amazon.in']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@type='text']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("samsung note 10");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']")).click();
	Thread.sleep(1000);
	//driver.findElement(By.xpath("//input[@id='buy-now-button']")).click();
	}
}
