package SeleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFilePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		
		WebElement chooseFile =driver.findElement(By.xpath("/html/body/form/input[1]"));
		chooseFile.click();
		chooseFile.sendKeys("C:\\Users\\sultan\\Desktop\\Script.txt");
		driver.findElement(By.xpath("/html/body/form/input[3]")).click();
		
		
		
		
	}

}
