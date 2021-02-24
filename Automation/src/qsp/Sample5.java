package qsp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample5 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://www.google.com");
	Thread.sleep(1000);
	driver.manage().window().maximize();
	WebElement ele = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
	Thread.sleep(1000);
	ele.sendKeys("amazon");
	ele.sendKeys(Keys.ENTER);
	driver.findElement(By.xpath("//h3[@class='LC20lb DKV0Md']")).click();
	WebElement ele1 = driver.findElement(By.id("searchDropdownBox"));
	Select s=new Select(ele1);
	List<WebElement> options = s.getOptions();
	System.out.println(options.size());
	ArrayList<String> l=new ArrayList<String>();
	for (WebElement we : options) {
	String text = we.getText();	
	l.add(text);
	}
	Collections.sort(l);
	for (String we1 : l) {
		System.out.println(we1);
	}
	driver.close();
}
}
