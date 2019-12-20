package SeleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.get("http://xndev.com/display-image/");
		
		
		//store choose file element in a web lement
		
		WebElement uploadfile =driver.findElement(By.xpath("//*[@id=\"post-2554\"]/div/input"));
		uploadfile.sendKeys("C:\\Users\\sulta\\Pictures\\prime.jpg");
		
		

	
	// create a method perform uploading a file 
	// this method has two arguments(webelment string path)
	
		
	}
	// create a method perform uploading a file 
		// this method has two arguments(webelment string path
	
	public static void uploadFileMethod(WebElement element, String path) {
		element.sendKeys("path");
	}
	
	
	
	
	
	
	
	
}
