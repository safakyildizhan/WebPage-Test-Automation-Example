@login @regression

Feature: WebDriver University - Login Page

  Background:
    Given access the webdriwer university login page


  Scenario: Validate Successful Login - Valid Data
    When enter a username webdriver
    And enter a password webdriver123
    And click on the login button
    Then should be presented with a successful login message "validation succeeded"

  Scenario: Validate Unsuccessful Login - Invalid Data
    When enter a username webdriver
    And enter a password password123
    And click on the login button
    Then should be presented with an unsuccessful message "validation failed"

  Scenario Outline: Validate - Successful and Unsuccessful login
    When enter a username <username>
    When enter a password <password>
    And click on the login button
    Then should be presented with a login message <loginValidationMessage>


    Examples:
      | username  | password     | loginValidationMessage |
      | webdriver | webdriver123 | validation succeeded   |
      | webdriver | password123  | validation failed      |
      | username  | webdriver123 | validation failed      |
      | username  | password123  | validation failed      |



