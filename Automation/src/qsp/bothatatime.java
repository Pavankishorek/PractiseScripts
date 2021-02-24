package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class bothatatime 
{
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	
	Thread.sleep(2000);
	//driver.close();
	
	System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
	WebDriver driver2=new ChromeDriver();
	Thread.sleep(2000);
	
	driver2.close();
}	
}
