package testproj;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Scenario1 {

	@Test
	public void test() throws AWTException
	{
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.selenium.dev/");
		int count=0;
		int counts=0;
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
			List<WebElement> links = driver.findElements(By.xpath("//a"));
			int count1 = links.size();
			count=count+count1;
			List<WebElement> image = driver.findElements(By.xpath("//img"));
			int count2=image.size();
			counts=counts+count2;
		}
		System.out.println("links count is"+" "+count);
		System.out.println("Images count is"+" "+counts);
		
	}
}
