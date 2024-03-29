package SeleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chorome","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		String url ="https://tekschoolofamerica.com/test-environment/";
		driver.get(url);
		
		WebElement phone_PDAS=driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[6]/a"));
        phone_PDAS.click();
        
        //WebElement sortByElement = driver.findElement(By.xpath("//select[@id='input-sort']"));
      //  Select select = new Select(sortByElement);
      // select.selectByIndex(7);
       // select.selectByVisibleText("Price (High > Low)");
        
		
       WebElement showByElement = driver.findElement(By.xpath("//select[@id=\"input-limit\"]"));
       Select select = new Select(showByElement);
      select.selectByIndex(2);
		
		
		//driver.close it closses only curent window
      driver.close();
      //driver.quit it closses all opened windows which are opened by webdriver
		driver.quit();
		//thread.sleep: is used to give sometime before you it opens a list. 
		
		
		driver.close();
		

	}

}
