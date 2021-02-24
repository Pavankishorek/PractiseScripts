package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtrials {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	
	driver.get("file:///C:/Users/pavan/Desktop/ADV.SELENIUM/page8.html");
	WebElement ele = driver.findElement(By.xpath("//input[@type='text']"));
	Thread.sleep(2000);
    String url = driver.getCurrentUrl();
    System.out.println(url);
    if (url.contains("file")) {
		System.out.println("url matching");
	}else {
		System.out.println("url not matching");
	}
    String title = driver.getTitle();
    System.out.println(title);
    
    if (title.equals("Trial")) {
    	System.out.println("title matches");
	}else
	{
		System.out.println("title not matching");
	}
    
    boolean y = ele.isDisplayed();
    if (y) {
		System.out.println("textbod is displayed");
	}
    else {
		System.out.println("textbox is not displayed");
	}
    
    /*boolean b=ele.clear();
	if(b){
    	System.out.println("value cleared");
    }else{
    	System.out.println("value not cleared");
    }*/
}
}
