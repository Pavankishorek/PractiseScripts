package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Trial5 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	 driver.get("file:///C:/Users/pavan/Desktop/ADV.SELENIUM/page10.html");
	 Thread.sleep(1000);
	 List<WebElement> links = driver.findElements(By.tagName("input"));
	 int count = links.size();
	 System.out.println(count);
	 for( WebElement b:links)
	 {
		b.click(); 
		Thread.sleep(1000);
	 }
	 for (int i = count-1; i >=0; i--) {
		WebElement we = links.get(i);
		we.click();
		Thread.sleep(1000);
	}
}
}
