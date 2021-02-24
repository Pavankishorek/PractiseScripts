package qsp1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario2 {
public static void main(String[] args) throws AWTException {
	System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://www.selenium.dev/");
	WebElement ele1 = driver.findElement(By.xpath("(//a[.='Downloads'])[1]"));
	WebElement ele2 = driver.findElement(By.xpath("(//a[.='Projects'])[1]"));
	WebElement ele3 = driver.findElement(By.xpath("(//a[.='Documentation'])[1]"));
	WebElement ele4 = driver.findElement(By.xpath("(//a[.='Support'])[1]"));
	ArrayList<WebElement> l=new ArrayList<WebElement>();
	l.add(ele1);
	l.add(ele2);
	l.add(ele3);
	l.add(ele4);
	Actions act=new Actions(driver);
	Robot r=new Robot();
	for (WebElement we : l) {
	act.contextClick(we).perform();
	r.keyPress(KeyEvent.VK_T);
	r.keyRelease(KeyEvent.VK_T);
	}
	Set<String> allwh = driver.getWindowHandles();
	ArrayList<String>l1=new ArrayList<String>(allwh);
	String wh = l1.get(2);
	driver.switchTo().window(wh);
	String wh1 = l1.get(4);
	driver.switchTo().window(wh1);
	String wh2 = l1.get(1);
	driver.switchTo().window(wh2);
}
}
