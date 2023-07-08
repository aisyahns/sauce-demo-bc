Feature: Login
  As a user
  I want to login
  So I can access the product page

  Scenario: Login with correct username and password
    Given I am on login page
    When I input correct username and correct password
    And I click login button
    Then I will go to product page