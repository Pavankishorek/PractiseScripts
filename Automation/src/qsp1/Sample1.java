package qsp1;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample1 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.naukri.com");
	Thread.sleep(6000);
	String parent_id = driver.getWindowHandle();
	Set<String> allwh = driver.getWindowHandles();
	Thread.sleep(1000);
	int count = allwh.size();
	System.out.println(count);
	Thread.sleep(1000);
	for (String wh : allwh) {
		driver.switchTo().window(wh);
		System.out.println(driver.getTitle());
		if(wh.equals(parent_id))
		{
			driver.close();
		}
	}
	
}
}
