
@feature2
Feature:Verify add to cart feature

  Background:
    Given user navigates to saucedemo Website
    And I enter correct username as "standard_user" & password as "secret_sauce"
    Then login should be successful
@addToCart
  Scenario:
    Then the user add sauce labs backpack to cart
    And the user click on cart
    Then the user can see the "Sauce Labs Backpack" in the cart page

