package qsp1;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpop {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(1000);
	driver.navigate().to("https://www.flipkart.com");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[.='✕']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("Samsung Galaxy Note10 Lite");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	Thread.sleep(2000);
	
	Dimension d=new Dimension(500,500);
	driver.manage().window().setSize(d);
	Thread.sleep(2000);
	
	WebElement ele = driver.findElement(By.xpath("((//div[@class='_30jeq3 _1_WHN1'])[2])"));
	String b = ele.getText();
	System.out.println(b);
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.navigate().to("https://www.amazon.in");
	Thread.sleep(1000);
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Samsung Galaxy Note10 Lite");
	Thread.sleep(1000);
	driver.findElement(By.id("nav-search-submit-button")).click();
	Thread.sleep(1000);
	WebElement ele1 = driver.findElement(By.xpath("((//span[@class='a-price-whole'])[5])"));
	String a = ele1.getText();
	System.out.println(a);
	driver.close();
	
	int text=Integer.parseInt(a);
	int text1=Integer.parseInt(b);
	if (text>text1) {
		System.out.println("buy in flipkart");
	} else {
		System.out.println("buy in amazon ");
	}
		
	}
}

