package qsp1;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.naukri.com");
		Thread.sleep(6000);
		//String parent_id = driver.getWindowHandle();
		Set<String> allwh = driver.getWindowHandles();
		Thread.sleep(1000);
		int count = allwh.size();
		System.out.println(count);
		for (String wh : allwh) {
			driver.switchTo().window(wh);
			String title = driver.getTitle();
			System.out.println(title);
			if(title.equals("Apisero"))
			{
			driver.close();	
		}
	}
	}}
