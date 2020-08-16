
@DataTable
Feature: Title of your feature
  I want to use this template for my feature file

  
  Scenario: Valid Login
    Given I am on http://automationpractice.com/index.php
    When I click login
    And I enter username and password
    |username|password|
    |Snapchatfire1|y11|
    |x22|y123|
    |pinyo|Tonku|
    And I click enter
    Then I should recieve an error message
   

 