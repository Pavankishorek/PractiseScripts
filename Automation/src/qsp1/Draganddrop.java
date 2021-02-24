package qsp1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	Thread.sleep(1000);
	driver.manage().window().maximize();
	Thread.sleep(1000);
	WebElement b1 = driver.findElement(By.xpath("//div[@id='box2']"));
	WebElement b2 = driver.findElement(By.id("box102"));
	
	//Thread.sleep(1000);
	Actions act=new Actions(driver);
	act.dragAndDrop(b1, b2).perform();

}
}
