package com.facebook;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;



import Generic_Library.BaseClass;
import Generic_Library.POM_Utility;

public class Pro3Test extends BaseClass {
	
	@Test
	public void TestCase() {
		
		POM_Utility pom = new POM_Utility(driver);
		pom.register().click();
		pom.login().click();
		pom.getWishlist_link().click();
		pom.getShopCart().click();
	}

}
