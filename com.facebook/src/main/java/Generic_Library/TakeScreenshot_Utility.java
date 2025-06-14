package Generic_Library;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class TakeScreenshot_Utility {
	public static void Screenshot(WebDriver driver ,String fileName) throws IOException {
	
	
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\divya\\eclipse-workspace\\com.facebook\\screenpic\\"+fileName+"img.png");
		Files.copy(source, dest);

}

}