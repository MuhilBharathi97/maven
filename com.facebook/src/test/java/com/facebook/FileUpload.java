package com.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Generic_Library.BaseClass;

public class FileUpload extends  BaseClass {

	@Test
	public void TestCase() {
		
		driver = new ChromeDriver();
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\divya\\Downloads\\MuhilBharathi_Testing_Resume.docx");
		
	
	
	
}
}