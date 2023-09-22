
@feature
Feature: Swag Labs login


  @smokeTest
  Scenario: 1 Verify if a user will be able to login with a valid username and valid password

    Given user navigates to saucedemo Website
    And I enter correct username as "standard_user" & password as "secret_sauce"
    Then login should be successful

  @userTest
  Scenario Outline: Verify login page with locked out user
    Given user navigates to saucedemo Website
    When the user can see "<username>" in username  And the user enter "<password>" in the password field
    And the user click on login button
    Then the user can see "<expectedResult>" text on the page
    Examples:
      | username        | password     | expectedResult                                                            |
      | locked_out_user | secret_sauce | Epic sadface: Sorry, this user has been locked out.                       |
      | locked_out_user | secretSauca  | Epic sadface: Username and password do not match any user in this service |




