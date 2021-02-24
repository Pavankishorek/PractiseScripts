package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.com");
	List<WebElement> images = driver.findElements(By.xpath("//img"));
    System.out.println(images.size());
    for (WebElement we : images) {
		String links = we.getAttribute("src");
		System.out.println(links);
	}
	
}
}
