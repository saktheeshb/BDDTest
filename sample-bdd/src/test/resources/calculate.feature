Feature: calculator
  To allow an user to add twon numbers
  
 Scenario: Add two numbers
    Given first number 100 
      And second number 200
    When the user do calculate
    Then result should be printed as '300'

 Scenario: Add two numbers negetive case
    Given first number 100 
      And second number 100
    When the user do calculate
    Then result should be printed as '200'