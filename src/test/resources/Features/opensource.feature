Feature: Opensource Login and Logout
  
  Scenario: Verify Opensource login with valid credentials
    Given Open OPENSOURCE url using any browser
    When User type valid test data as UN and PSWD
    And click on Login button
    Then User should be able to login
    
 Scenario: Verify Opensource logout
 