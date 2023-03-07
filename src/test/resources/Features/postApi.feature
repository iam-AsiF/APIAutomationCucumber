Feature: User Registration

  @postApi
  Scenario Outline:
    Given user has the api '<path>'
    When user hits '<name>' and '<job>'
    And calls the api with body
    Then it will return created data

    Examples:
      | path  | name | job |
      | users | john | qa  |

