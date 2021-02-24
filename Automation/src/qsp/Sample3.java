package qsp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample3 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/r.php");
	WebElement ele = driver.findElement(By.id("month"));
	Select s =new Select(ele);
	List<WebElement> options = s.getOptions();
	int count = options.size();
	System.out.println(count);
	ArrayList<String> l=new ArrayList<String>();
	for (WebElement we : options) {
		String text = we.getText();
		l.add(text);
	}
	Collections.sort(l);
	//Collections.sort(l,Collections.reverseOrder());
	for (String we1 : l) {
		System.out.println(we1);
	}
	driver.manage().window().maximize();
	Thread.sleep(1000);
	driver.close();
}
}
