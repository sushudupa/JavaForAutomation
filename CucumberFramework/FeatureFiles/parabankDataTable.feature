Feature: Parabank login functionality

  Scenario: Login using valid credentials
    Given user on login page
    When user enters the credentials
      | UserName | Password |
      | johndoe1 | johndoe1 |
    And clicks at login button
    Then user views home page
    And application is closed by the user
