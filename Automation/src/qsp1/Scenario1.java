package qsp1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario1 {
public static void main(String[] args) throws AWTException {
	System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://www.selenium.dev/");
	int count=0;
	WebElement ele1 = driver.findElement(By.xpath("(//a[.='Downloads'])[1]"));
	WebElement ele2 = driver.findElement(By.xpath("(//a[.='Projects'])[1]"));
	WebElement ele3 = driver.findElement(By.xpath("(//a[.='Documentation'])[1]"));
	WebElement ele4 = driver.findElement(By.xpath("(//a[.='Support'])[1]"));
	ArrayList<WebElement> l1=new ArrayList<WebElement>();
	l1.add(ele1);
	l1.add(ele2);
	l1.add(ele3);
	l1.add(ele4);
	Actions act=new Actions(driver);
	Robot r =new Robot();
	for (WebElement wh : l1) {
		act.contextClick(wh).perform();
		r.keyPress(KeyEvent.VK_T);
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		int count1 = links.size();
		count=count+count1;
	}
	System.out.println(count);
	
	Set<String> we = driver.getWindowHandles();
	int count2 = we.size();
	System.out.println(count2);
	ArrayList<String> l2=new ArrayList<String>(we);
	String w1 = l2.get(2);
	driver.switchTo().window(w1);
	String w2 = l2.get(3);
	driver.switchTo().window(w2);
	String w3 = l2.get(0);
	driver.switchTo().window(w3);
	
}
}
