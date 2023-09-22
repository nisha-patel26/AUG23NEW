
@feature1
Feature: Verify the DropDown option

  Background:
    Given user navigates to saucedemo Website
    And I enter correct username as "standard_user" & password as "secret_sauce"
    Then login should be successful

  @demo
  Scenario Outline: Verify the user can select an option from dropdown list
    Then the user select "<option>" option from the dropdown list
    Examples:
      | option              |
      | Name (A to Z)       |
      | Name (Z to A)       |
      | Price (low to high) |
      | Price (high to low) |