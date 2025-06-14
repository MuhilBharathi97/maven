package Generic_Library;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class WebDriver_Utility {

	public static WebDriver driver;
	/**
	 * this method is to navigate to the application
	 * @param URL
	 */

	public void navigateapplication(String URL) {
		
		driver.get(URL);
	}
	/**
	 * this method is to maximize the browser
	 */
	public void maximize_browser() {
		driver.manage().window().maximize();
	}
	public void getCurrentURL() {
		String url = driver.getCurrentUrl();
	}
	public void getTitle() {
		String title = driver.getTitle();
	}
	public void implicitwait(int timecount) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timecount));
	}
	public void explicitlywait(int secondscount,WebElement element) {
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(secondscount));
		w.until(ExpectedConditions.visibilityOf(element));
	}
	public void backAction() {
		driver.navigate().back();
	}
	public void forwardAction() {
		driver.navigate().forward();
	}
	public void refreshAction() {
		driver.navigate().refresh();
	}
	public void fetchCurrentWindowAdress() {
		String address = driver.getWindowHandle();
	}
	public Set<String> fetchAllwindow() {
	Set<String> adress = driver.getWindowHandles();
	return adress;
	}
	public void switchToWindow(String url) {
	Set<String> allAddress = driver.getWindowHandles();
	
	for(String S:allAddress) {
		driver.switchTo().window(S);
		if(driver.getCurrentUrl().contains(url)) {
			break;
		}
	}
		
	}
	public void switchtoiframe(int index) {
		driver.switchTo().frame(index);
		
	}
	
	public void switchtofram(String idname) {
		driver.switchTo().frame(idname);
	}
	public void switchtoframe(WebElement element) {
		driver.switchTo().frame(element);
	
	}
	public void switch_back_to_Immediateparentpage() {
		driver.switchTo().parentFrame();
	}
	public void switch_back_to_mainpage() {
		driver.switchTo().defaultContent();
	}
	public void close_window() {
		driver.close();
	}
	public void quitwindow() {
		driver.quit();
	}
	public void alertaccept() {
		Alert a = driver.switchTo().alert();
		a.accept();
	}
	public void alertdismiss() {
		Alert a = driver.switchTo().alert();
		a.dismiss();
		
	}
}
