package POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testscript {
	@Test
	public void login(){
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("file:///C:/Users/pavan/Desktop/ADV.SELENIUM/page01.html");
		LoginScript l1=new LoginScript(driver);
		l1.setuname("pavan");
		l1.setpwd("kishore");
		l1.clicklogin();
		
	}
}
