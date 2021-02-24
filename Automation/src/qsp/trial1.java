package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class trial1 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.google.com");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("googlemaps");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@class='gNO89b']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//span[.='Google Maps']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//img[@class='searchbox-directions-icon']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//input[@placeholder='Choose starting point, or click on the map...']")).sendKeys("banagalore");
	Thread.sleep(4000);
	driver.findElement(By.xpath("//input[@placeholder='Choose destination, or click on the map...']")).sendKeys("vellore");
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//img[@class='directions-travel-mode-icon'])[1]")).click();
}
}
