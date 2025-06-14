package Generic_Library;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
/**
 * @author Muhil
 */
public class Action_Utility {

	public Actions A;
	
	public Action_Utility(WebDriver driver) {
		A= new Actions(driver);
		
	}
	public void MoveCursor(WebElement element) {
		A.moveToElement(element).perform();
	}
	public void rightclick(WebElement element) {
		A.contextClick(element).perform();
	}
	public void doubleclick(WebElement element) {                              
		A.doubleClick(element).perform();
	}
	public void dragdrop(WebElement source,WebElement destination) {
		A.dragAndDrop(source, destination).perform();
	}
	public void cursorClick(WebElement element) {
		A.click(element).perform();
	}
	public void sendData(WebElement element  ,String text) {
		A.sendKeys(element,text).perform();
	}
}

