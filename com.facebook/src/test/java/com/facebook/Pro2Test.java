package com.facebook;

import java.io.IOException;
import java.util.Arrays;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Generic_Library.Exccel_Utility;

public class Pro2Test {

	
	
	@Test
	public void TestCase() throws EncryptedDocumentException, IOException {
		
		WebDriver driver= new ChromeDriver();
	String values = Exccel_Utility.getSelectedData("Sheet1",1,0);
	System.out.println(values);
	}
	
	@Test	
	public void testcase2() throws EncryptedDocumentException, IOException {
		
	
	String[][] valus = Exccel_Utility.getAllData("Sheet1");
     System.out.println(Arrays.deepToString(valus));  
		
	}
	}
