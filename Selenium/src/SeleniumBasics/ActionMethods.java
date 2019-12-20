package SeleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
        
        String baseUrl = "https://tekschoolofamerica.com/test-environment/";
        driver.get(baseUrl);
        
        //create object of ACtion Class  in order to use its methods
        
        Actions actions = new Actions(driver);    
        
        WebElement component = driver.findElement(By.xpath("//a[text()='Components']"));
        actions.moveToElement(component).build().perform();
        
        Thread.sleep(5000);
        // double click on element 
        actions.doubleClick(component).build().perform();
        
        // how to do a right click
        
          actions.contextClick(component).build().perform();
        
        
        // navigate this to this page
        driver.navigate().to("http://jqueryui.com/resources/demos/droppable/default.html");
        Thread.sleep(3000);
        WebElement source =driver.findElement(By.id("draggable"));
        
        WebElement target = driver.findElement(By.id("droppable"));
        
        actions.dragAndDrop(source, target).build().perform();
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
	}

}
