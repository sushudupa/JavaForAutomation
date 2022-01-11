Feature: Register Demo functionality

  Scenario: Launch the register demo site
    Given demo site is navigated
    When first name entered "John"
    And user enter last name "Doe"
    Then gender is selected by user
    Then user entered email id "johndoe@gmail.com"
    And verification code "84"
    Then enter submit button
    And application is closed
