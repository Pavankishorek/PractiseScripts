package qsp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample4 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.calculator.net/age-calculator.html");
	WebElement ele = driver.findElement(By.id("today_Day_ID"));
	Select s =new Select(ele);
	List<WebElement> options = s.getOptions();
    TreeSet<String> l=new TreeSet<String>();
	//ArrayList<String> l=new ArrayList<String>();
	for (WebElement we : options) {
		String text = we.getText();
		l.add(text);
	}
	//Collections.sort(l);
	for (String we1 : l) {
		System.out.println(we1);
	}
}
}
