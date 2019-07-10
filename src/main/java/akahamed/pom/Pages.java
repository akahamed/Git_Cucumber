package akahamed.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Pages {

	WebDriver driver;

	public Pages(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(how = How.NAME, using = "userName")
	@CacheLookup
	WebElement username;

	@FindBy(how = How.NAME, using = "password")
	@CacheLookup
	WebElement pass;

	@FindBy(name = "login")
	@CacheLookup
	WebElement btn;
	
	public void login_new(String uid, String pwd) {
		username.sendKeys(uid);
		pass.sendKeys(pwd);
		btn.click();
	}

}
