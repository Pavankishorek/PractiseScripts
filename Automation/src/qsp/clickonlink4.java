package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class clickonlink4 {

public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("file:///C:/Users/pavan/Desktop/page4.html");
	Thread.sleep(1000);
	driver.findElement(By.cssSelector("a[id='a1']")).click();
	Thread.sleep(1000);
    driver.close();

}
}
