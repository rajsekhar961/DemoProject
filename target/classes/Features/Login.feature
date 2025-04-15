Feature: Login Functionality

  Scenario: Login with valid credentials
    Given user on the login page
    When user enters username and password
    And user clicks on the login button
    Then user will navigate to home screen
