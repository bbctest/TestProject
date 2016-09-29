Feature: Read main news on BBC
  As a BBC user
  I want to be able to navigate to the BBC home page
  So that I can read my news

  Scenario: Navigate to cricket news
    When I navigate to the BBC website
    Then I should be on the BBC home page
    And I should see a welcome message