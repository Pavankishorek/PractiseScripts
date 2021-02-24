package qsp1;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.browserstack.com/guide/maximize-chrome-window-in-selenium");
	Thread.sleep(1000);
	driver.manage().window().maximize();
	Actions act=new Actions(driver);
	WebElement ele = driver.findElement(By.id("product-menu-toggle"));
	act.moveToElement(ele).perform();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@href='/speedlab']")).click();
	Thread.sleep(1000);
	//driver.findElement(By.xpath("//img[@src='/images/web-performance/netflix.png']")).click();
	//Thread.sleep(1000);
	Dimension d=new Dimension(300,300);
	driver.manage().window().setSize(d);
	Thread.sleep(3000);
	Point p =new Point(450,500);
	driver.manage().window().setPosition(p);
	Thread.sleep(2000);
	driver.close();
}
}