Feature: facebook login

  Scenario: Verify FB login with invalid test data
    Given Open FB url using any browser
    When User type invalid test data as UN and PSWD
    And click on Login button
    Then system should display error message

  Scenario: Verify FB login with valid test data
    Given Open FB url using any browser
    When User type valid test data as UN and PSWD
    And click on Login button
    Then system should display error message
