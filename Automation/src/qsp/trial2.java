package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class trial2 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.google.com");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("youtube");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@class='gNO89b']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//span[.='YouTube']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@id='search']")).sendKeys("a short advertisement-cocacola");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
	Thread.sleep(2000);
	/*driver.findElement(By.xpath("//yt-formatted-string[.='KGF Trailer Tamil | Yash | Srinidhi Shetty | Prashanth Neel | Vijay Kiragandur']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@aria-label='like this video along with 160,526 other people']")).click();*/
}
}
