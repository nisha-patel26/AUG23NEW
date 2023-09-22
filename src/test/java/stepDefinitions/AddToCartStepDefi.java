package stepDefinitions;

import browserControl.WebConnector;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pageObjects.AddToCartPage;

public class AddToCartStepDefi extends WebConnector {
    AddToCartPage cartPage=new AddToCartPage();


    @Then("the user add sauce labs backpack to cart")
    public void the_user_add_sauce_labs_backpack_to_cart() {
        cartPage.setAddCartXpath();

        }

        @Then("the user click on cart")
        public void the_user_click_on_cart () {
        cartPage.setCartLinkXpath();
            }

    @Then("the user can see the {string} in the cart page")
    public void the_user_can_see_the_in_the_cart_page(String expectedresult) {
        Assert.assertTrue(driver.getPageSource().contains(expectedresult));

    }

    }




