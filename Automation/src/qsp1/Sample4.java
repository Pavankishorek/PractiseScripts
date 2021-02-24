package qsp1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample4 {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.naukri.com");
		Thread.sleep(6000);
		//String parent_id = driver.getWindowHandle();
		Set<String> allwh = driver.getWindowHandles();
		Thread.sleep(1000);
		int count = allwh.size();
		System.out.println(count);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		for (String wh: allwh) {
			driver.switchTo().window(wh);
			Thread.sleep(1000);
			driver.manage().window().maximize();
			Thread.sleep(1000);
			String title = driver.getTitle();
			System.out.println(title);
			Thread.sleep(2000);
			if (title.equals("LNT")) {
				Robot r=new Robot();
				r.keyPress(KeyEvent.VK_ALT);
				r.keyPress(KeyEvent.VK_SPACE);
				r.keyPress(KeyEvent.VK_N);
				r.keyRelease(KeyEvent.VK_ALT);
				r.keyRelease(KeyEvent.VK_SPACE);
				r.keyRelease(KeyEvent.VK_N);
			}
			Robot r1=new Robot();
			r1.keyPress(KeyEvent.VK_ALT);
			r1.keyPress(KeyEvent.VK_SPACE);
			r1.keyPress(KeyEvent.VK_C);
			r1.keyRelease(KeyEvent.VK_ALT);
			r1.keyRelease(KeyEvent.VK_SPACE);
			r1.keyRelease(KeyEvent.VK_C);
		}
	}
}
