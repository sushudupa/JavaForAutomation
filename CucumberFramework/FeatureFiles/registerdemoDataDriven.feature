Feature: Register Demo functionality

  Scenario: Launch the register demo site
    Given user navigates to demo site
    When user enters the credential "<firstName>"
    And user entered last name credential "<lastName>"
    Then user choose the gender
    Then email id entered by the user "<emailID>"
    And user verify the code "<verificationCode>"
    Then click on submit button
    And user closes the application
    
    Examples:
    |John|
    |Doe|
    |johndoe@gmail.com|
    |84|
   
    

