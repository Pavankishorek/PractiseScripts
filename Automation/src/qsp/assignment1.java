package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class assignment1 {
		public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.gmail.com");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//input[@name='identifier']"));
		Thread.sleep(1000);
		ele.sendKeys("pavankishorepbt@gmail.com");
		Thread.sleep(1000);
		ele.sendKeys(Keys.CONTROL+"a");
		Thread.sleep(1000);
		ele.sendKeys(Keys.DELETE);
		driver.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']")).click();
		}
}
