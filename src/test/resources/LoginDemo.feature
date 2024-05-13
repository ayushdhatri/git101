Feature: Test Login Functionality
  Scenario: Check Login is successful with given credentials
    Given browser is open
    And user is on login page
    When user enters username and password
    Then user is navigated to home page

