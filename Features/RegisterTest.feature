Feature: Register Test

  Scenario: I want to register succesfully
    Given I am on the hompage
    And I click the sign in link
    And I see an auhentication banner
    And I enter an email address
    And I click the create an account button
    When I fill the personal information form
    And I click the register button
    Then i should be registered
    And I click the sign out link to log out
