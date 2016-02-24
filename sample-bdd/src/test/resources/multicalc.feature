Feature: multi-calc
  To allow an user to add two numbers
  
 Scenario Outline: Add two numbers of multi generic calc
    Given first number <first> 
    And second number <second>
    When the user do calculate
    Then result should be printed as '<result>'
    
    Examples:
    | first | second | result |
    |  12   |  5     |  17    |
    |  20   |  5     |  25    |
	
