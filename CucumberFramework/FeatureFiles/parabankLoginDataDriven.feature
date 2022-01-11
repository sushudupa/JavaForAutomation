Feature: Parabank login functionality

  Scenario Outline: parabank login scenario
    Given user launch parabank page
    When user enter credentials "<UserName>" and "<Password>"
    And click login button
    Then user should view home page
    And user should close the application

    Examples: 
      | UserName  | Password  |
      | johndoe1  | johndoe1  |
      | sample123 | sample123 |
