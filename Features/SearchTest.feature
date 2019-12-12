Feature: Search Test

  Scenario: I want to search for an item and see the item displayed
    Given I am on the hompage
    And I enter a search keyword
    When I click the search button
    Then the searched item shoulbd be displayed
    
   
