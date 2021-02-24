package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fbcss {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	driver.findElement(By.cssSelector("input[id='email']")).sendKeys("pavan");
	Thread.sleep(1000);
	driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("abcd");
	Thread.sleep(1000);
	driver.findElement(By.cssSelector("button[id='u_0_b']")).click();
	Thread.sleep(3000);
	driver.close();
}
}
