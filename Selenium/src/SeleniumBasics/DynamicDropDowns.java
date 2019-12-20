package SeleniumBasics;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DynamicDropDowns {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--headless");
		
		WebDriver driver = new ChromeDriver(chromeOptions);
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        
		driver.get("https://www.aa.com/homePage.do");
		
		//1,grab the departure box xpath
		// store in a WebElement
		//3. clear the box
		//4. send (wash) value
		//5. create a list for stoing webelemnt of dropdowns
		//6. create a for each loop to travel to list indexes
		//7.write an if conditionro click or select value we want
		//8.break from the loop
		
Actions actions = new Actions(driver);
		

		WebElement reqLink = driver
				.findElement(By.xpath("//*[@id=\"reservationFlightSearchForm\"]/div[5]/div[1]/div/p[3]/a"));
		actions.moveToElement(reqLink).build().perform();

		WebElement departure = driver
				.findElement(By.cssSelector("input[id='reservationFlightSearchForm.originAirport']"));
		departure.clear();
		departure.sendKeys("Wash");

		List<WebElement> airports = driver.findElements(By.xpath("//ul[@id='ui-id-3']/li"));

		System.out.println(airports.size());

		for (WebElement element : airports) {

			try {
				if (element.getText().contains("BWI"))
					element.click();
				break;
			} catch (StaleElementReferenceException e) {

				System.out.println("Element is no loger attached to dom");
			}
		}

		

		// arrival dropdown
		WebElement arrival = driver
				.findElement(By.xpath("//input[@id='reservationFlightSearchForm.destinationAirport']"));
		arrival.clear();
		arrival.sendKeys("las");

		List<WebElement> arrivalairports = driver.findElements(By.xpath("//ul[@id='ui-id-4']/li"));
		System.out.println(arrivalairports.size());

		for (WebElement arrivalElments : arrivalairports) {

			try {
				if (arrivalElments.getText().contains("LAS"))
					arrivalElments.click();
				break;
			} catch (StaleElementReferenceException e) {
				System.out.println("Element is no loger attached to dom");
			}

		}
		
		
		// select object to select values from static dropdown
		WebElement numberOfPassengers = driver.findElement(By.cssSelector("select[id='flightSearchForm.adultOrSeniorPassengerCount']"));
		Select select = new Select(numberOfPassengers);
		select.selectByVisibleText("9");
		
		WebElement departureCalendar= driver.findElement(By.xpath("//input[@id='aa-returningForm']"));
		Utility.selectDateByJS(driver, departureCalendar, "11.21.2019");
		
		WebElement returnCalendar=driver.findElement(By.xpath("//input[@id='aa-returningForm']"));
		Utility.selectDateByJS(driver, returnCalendar, "11,30,2019");
		
		
		
		
		
		
		
		
		
		
		
		
		}
	}