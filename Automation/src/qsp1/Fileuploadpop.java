package qsp1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Fileuploadpop {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.freshersworld.com/user/register?src=homeregblock");
	Thread.sleep(3000);
	WebElement ele = driver.findElement(By.xpath("//input[@name='qqfile']"));
	Thread.sleep(2000);
	ele.sendKeys("C:\\Users\\pavan\\Desktop\\Doc1.docx");
	Thread.sleep(3000);
	driver.close();
}
}
