package testproj;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Testscript extends Generic_test 
{

	@Test
	public void Login() throws InterruptedException
	{
		
		driver.findElement(By.xpath("((//a[@class='h-c-header__nav-li-link '])[4])")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("identifierId")).sendKeys("pavankishorebt");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='Next']")).click();
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("blueinkbottle");
		driver.findElement(By.xpath("//span[.='Next']")).click();
		Thread.sleep(5000);
	}
}
