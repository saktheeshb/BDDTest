Feature: calc
  To allow an user to add twon numbers
  
 Scenario: Add two numbers of new calc
    Given first number 1 
      And second number 2
    When the user do calculate
    Then result should be printed as '3'

 Scenario: Add two numbers negetive case of new calc
    Given first number 10 
      And second number 10
    When the user do calculate
    Then result should be printed as '20'