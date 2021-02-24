package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.com");
	List<WebElement> links = driver.findElements(By.xpath("//a"));
	int count = links.size();
	System.out.println(count);
	for (WebElement we : links) {
		String url = we.getAttribute("href");
		System.out.println(url);
	}
}
}
