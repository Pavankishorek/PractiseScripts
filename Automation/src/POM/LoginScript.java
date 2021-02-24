package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginScript {

	@FindBy(id="a1")
	private WebElement uname;
	
	@FindBy(id="b1")
	private WebElement pwd;
	
	@FindBy(xpath="//input[@value='clickme']")
	private WebElement loginbtn;
	
	public LoginScript(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
    
    public void setuname(String un){
    	uname.sendKeys(un);
    }

	public void setpwd(String pd){
		pwd.sendKeys(pd);
	}
		
	public void clicklogin(){
		loginbtn.click();
	}
}
