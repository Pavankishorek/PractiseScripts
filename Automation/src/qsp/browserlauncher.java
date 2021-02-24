package qsp;

import org.openqa.selenium.firefox.FirefoxDriver;

public class browserlauncher {

	public static void main(String[] args) {
		
		String key="webdriver.gecko.driver";
		String value="./Software/geckodriver.exe";
		System.setProperty(key, value);

		FirefoxDriver driver=new FirefoxDriver();
	}

}
