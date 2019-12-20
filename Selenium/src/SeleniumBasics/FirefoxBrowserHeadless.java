package SeleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.GeckoDriverInfo;

public class FirefoxBrowserHeadless {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.geckodriver.driver", "C:\\geckodriver.exe");
		
		//create obj of firfox options
		
		FirefoxOptions fo=new FirefoxOptions();
		
		fo.addArguments("--headless");
		
		WebDriver driver = new FirefoxDriver(fo);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.get("https://tekschoolofamerica.com/");
		System.out.println(driver.getTitle());

	}

}
