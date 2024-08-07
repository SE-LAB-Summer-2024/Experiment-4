@tag
Feature: Root
    Scenario: root of tow numbers
        Given two integers -27, -3 and division must be non-negative
        When I calculate the root
        Then the expected result should be 3

    Scenario Outline: root of tow numbers
        Given two integers <input1>, <input2> and division must be non-negative
        When I calculate the root
        Then the expected result should be <result>
        Examples:
            | input1 | input2 | result |
            | 4      | 1      |   2    |
            |   -9   |  -1    |   3    |
            |  16    |  4     |   2    |
            |  36    |  4     | 3      |

