package qsp;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo3 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://www.google.com");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.navigate().to("https://www.facebook.com");
	Thread.sleep(1000);
	driver.navigate().back();
	Thread.sleep(1000);
	driver.navigate().forward();
	Thread.sleep(2000);
	driver.navigate().refresh();
	Thread.sleep(2000);
	Dimension d=new Dimension(200,300);
	driver.manage().window().setSize(d);
	Thread.sleep(2000);
	Point p=new Point(200,300);
	driver.manage().window().setPosition(p);
	
	driver.manage().deleteAllCookies();
	}
}
