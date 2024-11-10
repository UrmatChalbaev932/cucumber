Feature: Text Box

  @smoke
  Scenario: Verify all needed fields and buttons are presented in the page
    Given user should open "https://demoqa.com/text-box"
    And verify Full Name text is displayed
    And verify Email text is displayed
    And verify Current Address text is displayed
    And verify Permanent Address text is displayed
    And verify Submit button is displayed
