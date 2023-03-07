Feature:

  @getApi
  Scenario Outline: get api check of pages
    Given user has the base api
    When user call the '<parameter>' and '<paramsValue>'
    Then it will return valid data
    Examples:
      | parameter | paramsValue |
      | ?page     | 2           |