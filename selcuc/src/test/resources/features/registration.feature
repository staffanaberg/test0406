Feature: Register new use
I want to register a new user

Background: 
Given I want to navigate to Mailchimp

Scenario Outline: Title of your scenario outline
    When I check for the <value> in step
    Then I verify the <status> in step

    Examples: 
      | value | status  |
      |     5 | success |
