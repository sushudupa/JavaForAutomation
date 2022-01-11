Feature: Parabank login functionality

  Scenario: Login using valid credentials
    Given user is on login page
    When user enters the "johndoe1" and "johndoe1"
    And clicks on login button
    Then display user home page
    And user will close the application
