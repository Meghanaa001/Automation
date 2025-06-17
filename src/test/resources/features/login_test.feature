Feature: Login

  1. Verify login with valid credentials and verify number of products and heading
  2. Verify login with valid credentials - parameters and verify number of products and heading

  @LT1 @Smoke
  Scenario: Verify login with valid credentials and verify number of products and heading
    Given user is on login screen
    When user enter valid credentials
    And user click on login button
    Then user verify number of products on the products screen
    Then user verify heading of the screen


  @LT2 @Smoke @Regression
  Scenario: Verify login with valid credentials - parameters and verify number of products and heading
    Given user is on login screen
    When user enter valid credentials "standard_user" and "secret_sauce"
    And user click on login button
    Then user verify number of products on the products screen
    Then user verify heading of the screen


  @LT3 @Smoke @Regression
  Scenario Outline: Verify login with valid credentials - with examples and verify number of products and heading
    Given user is on login screen
    When user enter valid credentials "<username>" and "<password>"
    And user click on login button
    Then user verify number of products on the products screen
    Then user verify heading of the screen

    Examples:
      | username      | password     |
      | standard_user | secret_sauce |
      | visual_user   | secret_sauce |
      | error_user    | secret_sauce |