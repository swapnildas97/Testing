package cucumber_demo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class tagdemo_1 {
	@Given("User is open the application")
	public void user_is_open_the_application() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("User click on to signin link")
	public void user_click_on_to_signin_link() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("User enters {string} and {string}")
	public void user_enters_and(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("Message displayed Login Successfully")
	public void message_displayed_Login_Successfully() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

}
