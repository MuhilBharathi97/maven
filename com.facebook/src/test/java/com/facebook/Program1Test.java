package com.facebook;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Generic_Library.BaseClass;
import Generic_Library.Listener_Utility;



@Listeners(Listener_Utility.class)
public class Program1Test extends BaseClass{

	@Test
	public void TestCase(){
		
		driver.findElement(By.xpath("//a[@class='ico-login']")).click();
		driver.findElement(By.xpath("//input[@class='Email']")).sendKeys("muhilbharathi1997@gmai.com");
		
		
	}
}
