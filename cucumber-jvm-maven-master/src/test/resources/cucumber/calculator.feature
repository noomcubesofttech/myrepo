Feature: Calculator
  As a user
  I want to use a calculator
  So that I don't need to calculate myself

  Scenario: operate two numbers
    Given I have a calculator
    When I add 2 and 3
    Then the result1 should be 5
    When I minus 12 and 3
    Then the result2 should be 9
    When I multiply 5 and 6
    Then the result3 should be 30
    When I divide 20 and 2
    Then the result4 should be 10
    
    Scenario: operate one number
    Given I have a science calculator
    When  2 power 3
    Then the result5 should be 8
    