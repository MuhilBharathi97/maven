package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
		
	}

	@FindBy(xpath="//input[@id='Email']")
	private WebElement username;
	public WebElement getUserName() {
		return username;
		
	}
	@FindBy(xpath="//input[@id='Password']")
	private WebElement password;
	public WebElement getPassword() {
		return password;
		
	}
	@FindBy(xpath="//input[@class='button-1 login-button']")
	private WebElement loginButton;
	public WebElement LoginButton() {
		return loginButton;
		
	}
}
