@tag
Feature: Belly Calculator
  Scenario: summation of Two Numbers
    Given I have Two Numbers 1 and 2
    When I add Them.
    Then I must receive result 3

  Scenario Outline: multiplication
    Given I have Two Numbers <first> and <second>
    When I multiply Them
    Then The Multiplication of Them must be <result>
    Examples:
      |first  |second |result |
      |3      |2      |6      |
      |1      |0      |0      |

