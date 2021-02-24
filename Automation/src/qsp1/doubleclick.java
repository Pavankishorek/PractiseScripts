package qsp1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleclick {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://demo.guru99.com/test/simple_context_menu.html");
	Thread.sleep(1000);
	WebElement dclick = driver.findElement(By.xpath("//button[.='Double-Click Me To See Alert']"));
	Thread.sleep(1000);
	Actions act=new Actions(driver);
	act.doubleClick(dclick).perform();
}
}
