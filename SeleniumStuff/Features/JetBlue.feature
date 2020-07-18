
@JetBlue
Feature: JetBlue

  @tag1
  Scenario: JetBlue
    Given I am on JetBlue
    And try to book a flight
    When I add more tickets
    Then I have my tickets

  