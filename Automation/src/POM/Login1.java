package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login1 {

	@FindBy(xpath="//div[@class='VfPpkd-RLmnJb']")
	private WebElement login_button;
	
	
	public Login1(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void clicklogin()
	{
		login_button.click();
	}
}
