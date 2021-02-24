package qsp1;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rightclk {
public static void main(String[] args) throws InterruptedException, AWTException {
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://demo.guru99.com/test/simple_context_menu.html");
	Thread.sleep(1000);
	WebElement rclk = driver.findElement(By.xpath("//span[.='right click me']"));
	Actions act=new Actions(driver);
	Thread.sleep(1000);
	act.contextClick(rclk).perform();
	
	/*Robot r=new Robot();
	r.keyPress(KeyEvent.);
	r.keyRelease(KeyEvent.KEY_FIRST);*/
}
}
