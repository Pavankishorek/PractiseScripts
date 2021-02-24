package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/pavan/Desktop/ADV.SELENIUM/page11.html");
	List<WebElement> ele = driver.findElements(By.tagName("input"));
	int count = ele.size();
	System.out.println(count);
	for (int i = 0; i <=count; i++) {
		String arr[]={"pavan","kishore","Test","Engineer"};
		WebElement we = ele.get(i);
			we.sendKeys(arr[i]);
	}
	for (int i = count-1; i>=0; i--) {
		WebElement we1 = ele.get(i);
		we1.clear();
	}
}
}
