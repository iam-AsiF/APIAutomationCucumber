Feature:

  @patchApi
  Scenario Outline:
    Given user got the base api '<path>'
    When user hits patched '<job>'
    And calls the api with patched body
    Then it will return patched data
    Examples:
      | path      | job     |
      | users/265 | Athlete |
