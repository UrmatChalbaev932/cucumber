Feature: Scenario Outline example

@smoke
  Scenario Outline: Create new user
    Given enter the FirstName "<firstName>"
    And enter the LastName "<lastName>"
    And enter the Email "<email>"
    Examples:
      | firstName | lastName | email           |
      | john      | doe      | john@mail.com   |
      | james     | bond     | bond@gmail.com  |
      | leo       | messi    | messi@gmail.com |




