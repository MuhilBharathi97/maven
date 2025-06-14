package Generic_Library;


import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;


public class BaseClass extends WebDriver_Utility{

	
	@BeforeSuite
	public void OpenServer() {
		Reporter.log("OPening server");
	}
	@AfterSuite
	public void ClosingServer() {
		Reporter.log("closing server");
	}
	@BeforeTest
	public void OpeningDB() {
		Reporter.log("Opening DB");
	}
	@AfterTest
	public void ClosingDB() {
		Reporter.log("closing DB");
	}
	

	@BeforeClass
	public void openBrowser() {
		driver = new ChromeDriver();
		maximize_browser();
		implicitwait(15);
		navigateapplication("https://demowebshop.tricentis.com");
	}
	
	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}
	
}

