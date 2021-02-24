package qsp1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Duplicatedrop2 {

	@Test
	public void test(){
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
		Set<String> s1=new HashSet<>();
		
		for (String str : l1) {
			if(s1.add(str)==false)
			{
				System.out.print(str+" ");
			}
		}
		
	}
}
