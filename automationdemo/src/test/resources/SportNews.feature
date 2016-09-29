Feature: Read sports news on BBC
  As a BBC user
  I want to be able to navigate to the sport page
  So that I read my sport news

  Scenario: Navigate to the sport page
    Given I have navigated to the BBC home page
    When I click on the sport button on the header
    Then I should be redirected to the sport page