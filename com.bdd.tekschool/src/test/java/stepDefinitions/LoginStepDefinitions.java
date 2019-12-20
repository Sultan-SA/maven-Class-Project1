package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinitions {
	
	@Given("^User is on TekSchool page$")
	public void user_is_on_TekSchool_page() throws Throwable {
	   System.out.println("test");
	}

	@When("^User click on Test Environment link$")
	public void user_click_on_Test_Environment_link() throws Throwable {
		System.out.println("test");
	}

	@Then("^User should see Test Environment page$")
	public void user_should_see_Test_Environment_page() throws Throwable {
		System.out.println("test");
	}

}
