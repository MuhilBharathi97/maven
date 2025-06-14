package Generic_Library;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Select_Utility {
	
	
	Select s;
	
	public Select_Utility(WebElement element) {
		
		s= new Select(element);
		
	}
	
	public void select_by_index(int index) {
		
		s.selectByIndex(index);
	}
	
	public void select_by_value(String value) {
		s.selectByValue(value);
	}
	
	public void select_by_visibleText(String Vtext) {
		s.selectByVisibleText(Vtext);
	}

}
