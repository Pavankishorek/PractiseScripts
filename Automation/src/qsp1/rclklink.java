package qsp1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class rclklink {
public static void main(String[] args) throws InterruptedException, AWTException {
	System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://demo.guru99.com/test/simple_context_menu.html");
	Thread.sleep(1000);
	WebElement rclk = driver.findElement(By.xpath("//a[.='Agile Project']"));
	Thread.sleep(1000);
	Actions act=new Actions(driver);
	act.contextClick(rclk).perform();
	Thread.sleep(1000);
	
	Robot r1=new Robot();
	r1.keyPress(KeyEvent.VK_T);
	r1.keyRelease(KeyEvent.VK_T);
}
}
