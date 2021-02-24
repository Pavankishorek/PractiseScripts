package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class url {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
	
	WebDriver driver=new FirefoxDriver();
	
	driver.get("https://www.google.com");
	Thread.sleep(2000);
	
	String url = driver.getCurrentUrl();
	System.out.println(url);
	
	String title = driver.getTitle();
	System.out.println(title);
	
	String src = driver.getPageSource();
	System.out.println(src);
	
	driver.close();
}

}
