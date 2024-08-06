@tag
Feature: Calculator
    Scenario: Add two numbers
        Given Two input values 1 and 4
        When I add the two values
        Then the expect result should be 5

    Scenario Outline: Add two numbers
        Given Two input values <input1> and <input2>
        When I add the two values
        Then the expect result should be <result>

        Examples:
            | input1 | input2 | result |
            | 1      | 12     |   13   |
            | -1     | 6      |   5    |
            | 2      | -6     | -4     |


