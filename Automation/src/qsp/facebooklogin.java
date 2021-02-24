package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebooklogin {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys("xyz@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.name("pass")).sendKeys("zbc");
		Thread.sleep(1000);
		driver.findElement(By.id("u_0_b")).click();
		Thread.sleep(3000);
		driver.close();
	}

}
