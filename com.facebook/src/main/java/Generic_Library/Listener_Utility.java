package Generic_Library;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listener_Utility implements ITestListener{
	
	@Override
	public void onTestStart(ITestResult result) {
		
		Reporter.log(result.getName()+"testCase excevution starts",true);
		
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		
		String name = result.getName();
		Reporter.log(result.getName()+"testCase excevution failed",true);
		try {
			
		
			TakeScreenshot_Utility.Screenshot(WebDriver_Utility.driver,name);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log(result.getName()+"testCase excevution Suceeded",true);
	}
}
