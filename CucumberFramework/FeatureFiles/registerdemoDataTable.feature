Feature: Register Demo functionality

  Scenario: Launch the register demo site
    Given navigated to demo site
    When user gives the credential
      | John |
    And last name is entered
      | Doe |
    Then user selects the gender
    Then email id credential
      | johndoe@gmail.com |
    And code to verify
      | 84 |
    Then user enters submit button
    And application closed by the user
