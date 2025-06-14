package com.facebook;

import org.testng.annotations.Test;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Generic_Library.BaseClass;
import Generic_Library.Listener_Utility;
import POM.LoginPage;
import POM.Loginlink;
@Listeners(Listener_Utility.class)
public class Program2Test extends BaseClass{

	@Test
	public void TestCase() throws InterruptedException {
		
		Loginlink log= new Loginlink(driver);
		log.login().click();
		Thread.sleep(5000);
	}
	
	@Test
	public void TestCase2() {
		LoginPage lp = new LoginPage(driver);
		lp.getUserName().sendKeys("muhilbharathi1997@gmail.com");
		lp.getPassword().sendKeys("MuhilM");
		lp.LoginButton().click();
	}

}
