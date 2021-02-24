package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Trial6 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/pavan/Desktop/ADV.SELENIUM/page12.html");
	WebElement ele = driver.findElement(By.id("Paradise briyani"));
	
	Select s=new Select(ele);
	Thread.sleep(1000);
	s.selectByIndex(0);
	Thread.sleep(1000);
	s.selectByValue("j");
	Thread.sleep(1000);
	s.selectByVisibleText("mutton chops");
	Thread.sleep(1000);
	s.deselectByIndex(1);
	boolean we = s.isMultiple();
	if (we) {
		System.out.println("dropdown is multiseleced");
	}else {
		System.out.println("dropdown is single selected");
	}
	Thread.sleep(1000);
	s.deselectAll();
}
}
