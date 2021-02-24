package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtrials1 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.google.com/");
	Thread.sleep(2000);
	WebElement ele = driver.findElement(By.xpath("//a[.='हिन्दी']"));
	Thread.sleep(2000);
	System.out.println(ele.getAttribute("href"));
	System.out.println(ele.getCssValue("font-size"));
	System.out.println(ele.getLocation());
}
}
