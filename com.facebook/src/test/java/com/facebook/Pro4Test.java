package com.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Generic_Library.Action_Utility;
import Generic_Library.BaseClass;
import Generic_Library.JavaScriptUtility;
import Generic_Library.Select_Utility;


public class Pro4Test extends BaseClass {
	
	
	@Test
	 public void testCase() throws InterruptedException {
		
		
//		JavaScriptUtility j = new JavaScriptUtility(driver);
//		
//		j.ScrollUp(1000);
//		Thread.sleep(1000);
//		j.ScrollDown(1000);
		
		//JavaScriptUtility.ScrollUp(1000, driver);
		//Thread.sleep(1000);
		
	//	Action_Utility a = new Action_Utility(driver);
		//a.MoveCursor(driver.findElement(By.xpath("//a[contains(text(),'Jewelry')]")));
		//a.doubleclick(driver.findElement(By.xpath("")));
driver.findElement(By.xpath("//a[contains(text(),'Apparel & Shoes')]")).click();
		Select_Utility s = new Select_Utility(driver.findElement(By.xpath("//select [@name='products-orderby']")));
		Thread.sleep(2000);
		s.select_by_index(3);
	}

}
