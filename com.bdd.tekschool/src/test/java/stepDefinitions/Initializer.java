package stepDefinitions;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import core.Base;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Initializer extends Base{
	
	// this method will run before each scenario
	
	@Before
	public void beforeHooks() {
		
		
		if(Base.browserName().equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		
		}else if (Base.browserName().equals("FF")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new InternetExplorerDriver();
			
		}else if (Base.browserName().equals("IE")) {
			WebDriverManager.iedriver().setup();
			driver=new InternetExplorerDriver();	
	
	}
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(getPageLoadTimeOut(),TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(getImplicitlyWait(), TimeUnit.SECONDS);
	}
	// this method will run after each scenario
	@After
	public void afterHooks() {
		
		
		driver.close();
		driver.quit();
	}
	
	
}
