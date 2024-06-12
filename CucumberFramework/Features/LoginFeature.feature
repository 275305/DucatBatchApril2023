Feature: Login

  Scenario: Check Login with valid Credentials
    Given User Launch the chrome browser
    When User open the URL "https://www.saucedemo.com/"
    And User enter userid "standard_user"and password "secret_sauce"
    And Click on Login
    Then Page title should be "Swag Labs"
    And close browse
