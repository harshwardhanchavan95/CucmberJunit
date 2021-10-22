package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ValidateLoginHRM {
	
	@Given("user Open Url")
	public void user_open_url() {
	    System.out.println("open url");
	}
	
	@When("enter Username")
	public void enter_username() {
	   System.out.println("enter username");
	}
	@When("enter Password")
	public void enter_password() {
	  System.out.println("enter password");
	}

	
	@Then("click On Login")
	public void click_on_login() {
	   System.out.println("click on Login");
	}



}
