package SeleniumBasics;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Utility {

// how to create to take screen shots
	public static void screenshot(WebDriver driver,String LocationOfFile, String FileName) throws IOException {
		//take screenshot method of selenium and store as a file
		// give location path file name file type ".png"
		
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File(LocationOfFile+FileName+".png"));	
		
	}
	// this method captures date from calendar using JavaScript executer.
	public static void selectDateByJS(WebDriver driver, WebElement element, String date) {
		
		// create object of java script executer class 
		// 
		JavascriptExecutor js= ((JavascriptExecutor) driver);
		
		js.executeScript("arguments[0].setAttribute('value','"+date+"');", element);
		
		
		
		
	}
	
	
	
	
	
	
	
	

}
