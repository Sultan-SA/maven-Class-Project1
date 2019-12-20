package SeleniumBasics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// . to delete AllCockies method will delete cookies or data sent from browser.
		driver.manage().deleteAllCookies();
		String url = "https://tekschoolofamerica.com/test-environment/";
		driver.get(url);
		String actualTitle = driver.getTitle();
		String expectedTitle = "Tek SCHOOL";
		if (actualTitle.equals(expectedTitle)) {
			System.out.println(actualTitle);

		} else
			System.out.println("Title is not Correct");

		// WebElement logo =driver.findElement(By.xpath("//a[text(='TEK SCHOOL']"));
		WebElement logo = driver.findElement(By.xpath("//a[text()='TEK SCHOOL']"));
		System.out.println(logo.getText());
		System.out.println(logo.isDisplayed());

		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());

		for (WebElement WebLinks : links) {
			String elementText = WebLinks.getText();
			System.out.println(elementText);

			if (elementText.equals("Phones & PDAs")) {
				WebLinks.click();
				break;

			}

		}
		
		
		

	}
}
