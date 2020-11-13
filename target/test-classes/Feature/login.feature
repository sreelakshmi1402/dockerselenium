Feature: Feature to test login fnality



@first
  Scenario: Check login functionality
  
    Given User is on login page
    When User enters username and password
    Then Clicks on login button
