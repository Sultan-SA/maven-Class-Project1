package SeleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeBrowserHeadless {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		
		
	// create obj of chrome options 
		ChromeOptions chromeOptions = new ChromeOptions();
		
		//add headless argument of chromeOprions
		chromeOptions.addArguments("--headless");
		
		//instantiate chrome browser and this will maek chrome browser headless
		WebDriver driver = new ChromeDriver(chromeOptions);
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		
		// go to tekschool page and printouttitle.
		driver.get("https://tekschoolofamerica.com/");
		System.out.println(driver.getTitle());
		
		
		
		
		

	}

}
