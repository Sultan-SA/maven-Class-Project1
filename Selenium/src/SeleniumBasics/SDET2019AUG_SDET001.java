package SeleniumBasics;

import java.io.IOException;
import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SDET2019AUG_SDET001 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		String url ="https://tekschoolofamerica.com/test-environment/";
		driver.get(url);
		
		
		driver.getTitle();
		String tecSchoolPageTitle=driver.getTitle();
		System.out.println(tecSchoolPageTitle);
		
		//driver.findElement(By.xpath("//a[text()='Test Environment']")).click();
		//driver.findElement(By.xpath("//a[text()='Test Environment']")).sendKeys(Keys.ENTER);
		String testEnvPageTitle=driver.getTitle();
		System.out.println(testEnvPageTitle);
		
		Utility.screenshot(driver, "C:\\Users\\sulta\\eclipse-workspace\\Selenium\\output", "SDET001");
		
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		//driver.findElement(By.xpath(xpathExpression))
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		//driver.findElements(By.name("firstname")).
		driver.findElement(By.name("firstname")).sendKeys("Sultan");
		driver.findElement(By.name("lastname")).sendKeys("Amin");
		driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("Sultan_amin@yahoo.com");
		driver.findElement(By.xpath("//*[@id=\"input-telephone\"]")).sendKeys("7034752121");
		driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("1234Hob");
		driver.findElement(By.xpath("//*[@id=\"input-confirm\"]")).sendKeys("1234Hob");
		driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input")).click();


		
		

	}

}
