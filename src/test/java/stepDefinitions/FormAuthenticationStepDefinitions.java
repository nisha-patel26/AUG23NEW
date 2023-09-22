package stepDefinitions;

import browserControl.WebConnector;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;
import pageObjects.FormAuthenticationPage;
import utilities.ConstantUtils;

public class FormAuthenticationStepDefinitions extends WebConnector {
    FormAuthenticationPage page = new FormAuthenticationPage();

    @Given("user navigates to saucedemo Website")
    public void user_navigates_to_saucedemo_website() {
        driver.get(ConstantUtils.BASE_URL);
    }

    @When("I enter correct username as {string} & password as {string}")
    public void i_enter_correct_username_as_password_as(String userName, String password) {
        page.setLoginPageXpath(userName);
        page.setPasswordXpath(password);

    }

    @Then("login should be successful")
    public void login_should_be_successful() {

        page.clickLogin();
    }

    @When("the user can see {string} in username  And the user enter {string} in the password field")
    public void the_user_can_see_in_username_and_the_user_enter_in_the_password_field(String username, String password) {
        page.setLoginPageXpath(username);
        page.setPasswordXpath(password);

    }

    @When("the user click on login button")
    public void the_user_click_on_login_button() {
        page.clickLogin();

    }

    @Then("the user can see {string} text on the page")
    public void the_user_can_see_text_on_the_page(String expectedResult) {
        Assert.assertTrue(driver.getPageSource().contains(expectedResult));

    }




}
