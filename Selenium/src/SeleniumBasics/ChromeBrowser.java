package SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 01. create object of webdriver
         WebDriver driver = new ChromeDriver();
         
         // 1. set property to webdriver
         //syntax is = System.setproperty("webdriver.chrome.driver","C://chromedriver,exe");
         System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
       driver.get("https://www.google.com/");
         
	}

} 
