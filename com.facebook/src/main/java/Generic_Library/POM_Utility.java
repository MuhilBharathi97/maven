package Generic_Library;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_Utility {


	@FindBy(xpath="//div[@class='header-links']/ul/li/a")
	private WebElement Register_Link;

	public WebElement register() {
		return Register_Link;

	}

	@FindBy(xpath="(//div[@class='header-links']/ul/li/a)[2]")
	private WebElement Login;

	public WebElement login() {
		return Login;

	}

	@FindBy(xpath="(//div[@class='header-links']/ul/li/a)[3]")

	private WebElement ShoppingCart;

	public WebElement getShopCart() {
		return ShoppingCart;

	}

	@FindBy(xpath="(//div[@class='header-links']/ul/li/a)[4]")
	private WebElement Wishlist;

	public WebElement getWishlist_link() {
		return Wishlist;

	}

	public POM_Utility(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	
}
