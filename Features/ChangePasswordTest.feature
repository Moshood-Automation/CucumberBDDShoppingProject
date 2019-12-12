Feature: Change Password Test

  Scenario: I want to change my password successfully/update my personal information
    Given I am on the hompage
    And I click the sign in link
    And I see an auhentication banner
    And I enter an email address
    And I click the create an account button
    When I fill the personal information form
    And I click the register button
    And i should be registered
    And i click on my personal information button
    And I see YOUR PERSONAL INFORMATION banner
    When I enter my current password
    And I enter my new password
    And I enter my password confirmation
    And I click the save button
    Then my password/personal information should be changed/updated
