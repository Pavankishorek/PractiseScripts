package qsp1;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Chilspop1 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.naukri.com");
	Thread.sleep(5000);
	/*System.out.println(driver.getWindowHandle());
	driver.quit();*/
	Set<String> wh = driver.getWindowHandles();
	System.out.println(wh.size());
	for (String w1 : wh) {
		System.out.println(w1);
	}
	driver.quit();
}
}
