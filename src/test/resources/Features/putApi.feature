Feature:

  @putApi
  Scenario Outline:
    Given user got the api '<path>'
    When user hits '<job>'
    And calls the api with changed body
    Then it will return updated data

    Examples:
      | path      | job     |
      | users/265 | fighter |
