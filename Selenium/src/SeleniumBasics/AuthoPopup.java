package SeleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthoPopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		String userName= "admin";
		String passWord="admin";		
				
				//http://the-internet.herokuapp.com/basic_auth
				 // sytax for bypassing aothoPopups
		        // https://username:password@the-internet.herokuapp.com/basic_auth
		String url = "http://"+userName+":"+passWord+"@"+"the-internet.herokuapp.com/basic_auth";
			
			driver.get(url);
	System.out.println(driver.getTitle());
		
		
		

	}

}
