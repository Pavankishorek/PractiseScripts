package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.google.com");
	driver.findElement(By.xpath("//input[@name='q']")).sendKeys("youtube");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//span[.='youtube']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//span[.='YouTube']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@id='search']")).sendKeys("kadhale kadhale 96");
	driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//yt-formatted-string[.='96 Songs| Kaathalae Kaathalae Song | Vijay Sethupathi, Trisha | Govind Vasantha | C. Prem Kumar']")).click();
}
}
