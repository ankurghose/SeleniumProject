@Amazon
Feature: Go to amazon

  Scenario: Search on Amazon
    Given I am on Amazon webiste
    When I search for golden doggy
    Then I see golden doggy
