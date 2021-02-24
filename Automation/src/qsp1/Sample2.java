package qsp1;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample2 {
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
		allwh.remove(parent_id);
		System.out.println(allwh.size());
		for (String wh : allwh) {
			driver.switchTo().window(wh);
			System.out.println(driver.getTitle());
			driver.close();
		}
}
}
