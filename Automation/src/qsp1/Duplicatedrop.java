package qsp1;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Duplicatedrop {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/pavan/Desktop/ADV.SELENIUM/Table.html");
	WebElement ele = driver.findElement(By.id("Paradise briyani"));
	Select s=new Select(ele);
	List<WebElement> options = s.getOptions();
	int count =options.size();
	ArrayList<String> l1=new ArrayList<String>();
	for (WebElement str : options) {
		String text = str.getText();
		l1.add(text);
		}
	System.out.println(l1);
	TreeSet<String> t1=new TreeSet<String>(l1);
	System.out.println(t1);
	
	boolean val = l1.equals(t1);
	System.out.println(val);
	
	driver.close();
}
}
