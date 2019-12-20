package SeleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bottle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// i am setting my property I will declare that my webdriver is a chrome driver and then
		// i will give the address of chrome driver execution file.
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.dell.com/");
		
		//driver.close();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		

	}

}
