package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class netflix {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.netflix.com");
	driver.findElement(By.xpath("//label[@for='id_email_hero_fuji']")).click();
	driver.findElement(By.xpath("//input[@type='email']")).sendKeys("abcd@gmail.com");
	driver.findElement(By.xpath("//span[@class='cta-btn-txt']")).click();
}
}
