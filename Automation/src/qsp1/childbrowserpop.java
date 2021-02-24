package qsp1;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class childbrowserpop {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.naukri.com");
	Thread.sleep(3000);
	Set<String> allwh = driver.getWindowHandles();
	for (String wh : allwh) {
		driver.switchTo().window(wh);
		Thread.sleep(1000);
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.close();
	}
}
}
