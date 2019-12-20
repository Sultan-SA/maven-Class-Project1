package SeleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
       
        
       
        
        driver.get("http://www.londonfreelance.org/courses/frames/index.html/");
        driver.switchTo().frame("main");
        
        WebElement header = driver.findElement(By.xpath("//h2[contains(text(),Title bar')]"));
		System.out.println(header.getText());
		driver.switchTo().defaultContent();
		
      driver.switchTo().frame("bot");
      WebElement footer = driver.findElement(By.xpath("//h2[contains(text(),'Footer')]"));
      System.out.println(footer.getText());
      driver.switchTo().defaultContent();
      
		

	}

}
