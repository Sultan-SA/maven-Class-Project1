package SeleniumBasics;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsandWindowHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// browser alerts are used to handle alerts in a page 
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        
		driver.get("https://ksrtc.in/oprs-web/");
		WebElement searchButton =driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg btn-block btn-booking']"));
		searchButton.click();
		
		// to handle windeo popups
		
		
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		WebElement crm =driver.findElement(By.xpath("//p[text()='CRM']"));
		crm.click();
		
		//in order to switch from parent window to child winow we need to bellow actions 
		//1. get all window handles and store in a set
		 Set<String>WindowHandles=driver.getWindowHandles();
		
		//2.use iterator to iterate in window handlers list
		Iterator<String>it=WindowHandles.iterator();
		//3.store parent window handler in a string
		String parentWindow = it.next();
		
		//4. store child window handler in a string
	     String childWindow=it.next();
		//5. use swichTo.window method for switching from parent to child 
		  driver.switchTo().window(childWindow);
		
		// now lets do a verification and get the title of the page'
		System.out.println(driver.getTitle());
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
			
		}
		
		driver.close();
		driver.switchTo().window(parentWindow);

	}

}
