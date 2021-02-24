package qsp1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alconfirmpop {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("http://demo.guru99.com/test/delete_customer.php");
	Thread.sleep(1000);
	WebElement ele = driver.findElement(By.name("cusid"));
	ele.sendKeys("pavan");
	Thread.sleep(1000);
	ele.sendKeys(Keys.ENTER);
	Alert a = driver.switchTo().alert();
	System.out.println(a.getText());
	//a.accept();
	a.dismiss();
}
}
