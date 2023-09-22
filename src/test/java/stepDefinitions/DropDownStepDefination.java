package stepDefinitions;


import io.cucumber.java.en.Then;
import browserControl.WebConnector;
import pageObjects.DropDownPage;

public class DropDownStepDefination extends WebConnector {


    DropDownPage page = new DropDownPage();

    @Then("the user select {string} option from the dropdown list")
    public void the_user_select_option_from_the_dropdown_list(String selectoption) {
        page.setDropdownoptionselectedXpath(selectoption);
    }

}
