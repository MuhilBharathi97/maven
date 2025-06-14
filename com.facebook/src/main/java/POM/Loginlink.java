package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginlink extends BasePage {

	public Loginlink(WebDriver driver) {
		
		super(driver);
	}
	
	@FindBy(xpath="(//div[@class='header-links']/ul/li/a)[2]")
	private WebElement Login;
	
	public WebElement login() {
	return Login;
	
}

}