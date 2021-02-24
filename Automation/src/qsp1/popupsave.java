package qsp1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class popupsave {
public static void main(String[] args) throws InterruptedException, AWTException {
	System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.selenium.dev/downloads/");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//a[.='3.141.59']")).click();

	Robot r=new Robot();
	Thread.sleep(1000);
	r.keyPress(KeyEvent.VK_LEFT);
	r.keyRelease(KeyEvent.VK_LEFT);
	Thread.sleep(4000);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	
	/*r.keyPress(KeyEvent.VK_TAB);
	Thread.sleep(1000);
	r.keyPress(KeyEvent.VK_TAB);
	r.keyRelease(KeyEvent.VK_TAB);
	Thread.sleep(1000);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);*/
	
}
}
