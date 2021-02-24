package qsp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample2 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/pavan/Desktop/ADV.SELENIUM/page12.html");
	WebElement ele = driver.findElement(By.id("Paradise briyani"));
	Select s=new Select(ele);
	List<WebElement> options = s.getOptions();
	ArrayList<String> t=new ArrayList<String>();
	for (WebElement we: options) {
		String text = we.getText();
		t.add(text);
	}
	Collections.sort(t);
	for (String t1 : t) {
		System.out.println(t1);
	}
}
}
