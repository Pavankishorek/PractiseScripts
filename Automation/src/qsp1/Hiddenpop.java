package qsp1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Hiddenpop {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.cleartrip.com");
	Thread.sleep(5000);
	driver.findElement(By.xpath("(//i[.='Cal'])[1]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//a[.='17']")).click();
	Thread.sleep(3000);
	driver.close();
}
}
