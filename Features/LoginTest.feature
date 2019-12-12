Feature: Login Test

  Background:
    Given I am on the hompage
    And I click the sign in link
    And I see an auhentication banner

  Scenario: As a registered user i want to login successfully with valid details
    When I enter a valid email address
    And I enter a  valid password
    And I click the sign in button
    Then I should be logged in
    And I click the sign out link to log out

  Scenario Outline: I want to enter invalid details to login inorder to get an error message
    When I enter an "<email>"
    And I enter a "<password>"
    And I click the sign in button
    Then I should get an error message

    Examples: 
      | email                     | password |
      | mosh.agbosasa@yahoo.com   | Alan     |
      | moshie.agbosasa@yahoo.com | Isaac    |
      |                           |          |
      | mosh.agbosasa@yahoo.com   |          |
      |                           | Isaac    |
