package SeleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CanvasLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//0 set property for chrome driver
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
	// open chrome broweser
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.canvas.instructure.com/login/canvas");
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	String actualTitle=driver.getTitle();
	driver.findElement(By.id("email")).sendKeys("test@123");
	driver.findElement(By.id("pass")).sendKeys("234");
	//driver.findElement(By.xpath()).click();
		
		
		
		
		
		
		

	}

}
