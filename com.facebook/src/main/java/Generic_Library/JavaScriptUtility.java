package Generic_Library;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptUtility {
	
	public static JavascriptExecutor js;
	
	public JavaScriptUtility(WebDriver driver) {
		js=(JavascriptExecutor)driver;
	}
	public  void ScrollUp(int Yaxis) {
		js.executeScript("window.scrollBy(0,"+Yaxis+")");
	}
	public  void ScrollDown(int Yaxis) {
		js.executeScript("window.scrollBy(0,"+-Yaxis+")");
	}

	public  void ScrolltoWebElement(WebElement element) {
		js.executeScript("arguments[0].scrollIntoView(true);",element);
	}
	public  void ScrollExtremeDown() {
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
	public  void ScrollExtremeTop() {
		js.executeScript("window.scrollTo(0,document.body.scrollTop)");
	}
	public  void removeDisable(WebElement element) {
		js.executeAsyncScript("arguments[0].removeAttribute('disabled')",element);
	}
}

