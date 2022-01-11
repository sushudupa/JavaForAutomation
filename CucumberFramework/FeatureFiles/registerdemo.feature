Feature: Register Demo functionality

  Scenario: Launch the register demo site
    Given user is navigated to the demo site
    When user first name is entered
    And and last name if filled
    Then user select the gender
    Then email id is entered by user
    And enter verification code
    Then submit button entered
    And closed application
