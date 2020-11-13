package steps;

import cucumber.api.java.en.*;
//import io.cucumber.java.en.*;

public class Login {
	
@Given("^User is on login page$")	
public void login_page()
{
	System.out.println("In login page");}

@When("^User enters username and password$")	
public void u_p()
{
	System.out.println("In login password username");}

@Then("^Clicks on login button$")	
public void login_clicks()
{
	System.out.println("In login click");}
}
