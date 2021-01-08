@accChallenge
Feature: Tricentis Challenge
  I want to use this template for my feature file

  @tricentisVehicle
  Scenario: Fill forms at Tricentis page and send successfully
    Given I navigate to the form url
    When I fill the vehicle data form
    And I click in the Next button to Insurant Data
    Then I fill the insurant data form
    And I click in the Next button to Product Data
    Then I fill the product data form
    And I click in the Next button to Select Price Option
    Then I choose the price option
    And I click in the Next button to Send Quote
    When I fill the quote data form
    And I click in the Send button
    Then I should see the message of success