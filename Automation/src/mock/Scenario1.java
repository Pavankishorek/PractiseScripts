package mock;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario1 {
public static void main(String[] args) throws AWTException, InterruptedException {
	System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://www.selenium.dev/");
	Thread.sleep(1000);
	WebElement ele = driver.findElement(By.xpath("(//a[.='Downloads'])[1]"));
	WebElement ele1 = driver.findElement(By.xpath("(//a[.='Projects'])[1]"));
	WebElement ele2 = driver.findElement(By.xpath("(//a[.='Documentation'])[1]"));
	WebElement ele3 = driver.findElement(By.xpath("(//a[.='Support'])[1]"));
	ArrayList<WebElement> l1=new ArrayList<WebElement>();
	l1.add(ele);
	l1.add(ele1);
	l1.add(ele2);
	l1.add(ele3);
	int count=0;
	Actions act=new Actions(driver);
	Robot r=new Robot();
	for (WebElement we : l1) {
		act.contextClick(we).perform();
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
		Thread.sleep(1000);
		List<WebElement> links = driver.findElements(By.xpath("//img"));
		Thread.sleep(1000);
		int count1=links.size();
		count=count+count1;
	}
	System.out.println(count);
	
	
	Set<String> allwh = driver.getWindowHandles();
	ArrayList<String> l2=new ArrayList<String>(allwh);
		String wh = l2.get(1);
		driver.switchTo().window(wh);
		Thread.sleep(1000);
		String wh1 = l2.get(3);
		driver.switchTo().window(wh1);
		Thread.sleep(1000);
		driver.quit();
	}
	
}

