package SeleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementsPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.aa.com/homePage.do");
		
		//driver.findElement(By.xpath("//*[@id=\"loginLogoutLink\"]")).click();
		//driver.findElement(By.id("loginId")).sendKeys("Sultan");
		//driver.findElement(By.name("lastName")).sendKeys("Amin");
		//driver.findElement(By.name("password")).sendKeys("123455666");
		
		
		
		
	}

}
