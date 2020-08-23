package stepDefinition;



import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.trellocucumber.pages.DriverFactory;
import org.trellocucumber.pages.LoginPage;



public class TestTrelloMobile extends LoginPage  {
    DriverFactory driverFactory = new DriverFactory();
    LoginPage loginPage = new LoginPage();

    @Given("^I navigate to the login page$")
    public void i_navigate_to_the_login_page() throws Throwable {
        loginPage.login();

    }

    @When("^I submit username and password$")
    public void i_submit_username_and_password() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^I should be logged in$")
    public void i_should_be_logged_in() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @Given("^I am in the home screen$")
    public void i_am_in_the_home_screen() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^I create a board with the name \"(.*?)\"$")
    public void i_create_a_board_with_the_name(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

}
