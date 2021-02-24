package testproj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Generic_test {
	public WebDriver driver;
	@BeforeMethod
	public void openappln()
	{
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://www.google.com/intl/en-GB/gmail/about/");
	}
	@AfterMethod
	public void closeappln() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.quit();
	}
}
