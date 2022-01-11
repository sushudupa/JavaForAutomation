Feature: Parabank login functionality

  Scenario: Login using valid credentials
    Given user is navigating to the parabank url
    When username and password are entered
    And click on login button
    Then display the user home page
    And close the application

  Scenario: Login using invalid credentials
    Given user is navigating to the parabank url
    When invalid username and password are entered
    And click on login button
    Then unable to login
    And close the application
