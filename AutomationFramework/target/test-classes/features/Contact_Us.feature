@contact-us @regression

Feature: WebDriver University - Contact Us Page


  Scenario: Validate Successful Submission - Unique Data
    Given access the webdriwer university contact us page
    When enter a unique first name
    And enter a unique last name
    And enter a unique email aqdress
    And enter a unique comment
    And click on the submit button
    Then should be presented with a successful contact us submission message

  Scenario: Validate Successful Submission - Specific Data
    Given access the webdriwer university contact us page
    When enter a unique specific name joe
    And enter a specific last name blogs
    And enter a specific email aqdress joe_blogs123@mail.com
    And enter a specific comment "A specific comment"
    And click on the submit button
    Then should be presented with a successful contact us submission message