package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("file:///C:/Users/pavan/Desktop/ADV.SELENIUM/page11.html");
	List<WebElement> ele = driver.findElements(By.tagName("input"));
	System.out.println(ele.size());
	for (WebElement we : ele) {
		we.sendKeys("pavan");
		Thread.sleep(1000);
	}
	
	for (int i =ele.size()-1; i>=0; i--)
	{
		WebElement we1 = ele.get(i);
		we1.clear();
		Thread.sleep(1000);
	}
	driver.close();
}
}
