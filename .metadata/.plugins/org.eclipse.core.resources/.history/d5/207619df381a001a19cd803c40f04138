package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class TekSchoolScenariosPageObject extends Base {

	public TekSchoolScenariosPageObject() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//span[text()='My Account']")
	private WebElement myAccountWebelement;

	@FindBy(how = How.XPATH, using = "//a[text()='Register']")
	private WebElement registerWebElement;

	@FindBy(how = How.XPATH, using = "//a[text()='Login']")
	private WebElement loginWebElement;

	@FindBy(how = How.ID, using = "input-email")
	private WebElement emailAddressFieldWebElement;

	@FindBy(how = How.ID, using = "input-password")
	private WebElement passwordFieldWebElement;

	@FindBy(how = How.XPATH, using = "//input[@type='submit']")
	private WebElement loginButtonWebElement;

	@FindBy(how = How.XPATH, using = "//h2[text()='My Account']")
	private WebElement myAccountTextWebElement;

	// Writing action methods for WebElements we store in this obj repository class

	public void clickOnMyAccount() {
		try {
			Assert.assertEquals(true, myAccountWebelement.isDisplayed());

			myAccountWebelement.click();

		} catch (ElementNotInteractableException e) {

			myAccountWebelement.sendKeys(Keys.ENTER);

		}
	}

	public void clickonRegister() {
		try {
			registerWebElement.click();
		} catch (ElementNotInteractableException e) {

			registerWebElement.sendKeys(Keys.ENTER);

		}
	}

	public void clickOnLogin() {
		try {
			loginWebElement.click();
		} catch (ElementNotInteractableException e) {
			loginWebElement.sendKeys(Keys.ENTER);
		}

	}

	public void enterEmailAddress(String emailValue) {

		emailAddressFieldWebElement.sendKeys(emailValue.trim());
	}

	public void enterPassword(String passwordValue) {
		passwordFieldWebElement.sendKeys(passwordValue.trim());
	}

	public void clickOnLoginButton() {
		loginButtonWebElement.click();
	}

	public boolean verifyLoginToMyAccount() {

		boolean verificationPoint = myAccountTextWebElement.isDisplayed();
		return verificationPoint;

	}

}
