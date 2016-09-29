Feature: Read cricket news on BBC
  As a BBC user
  I want to be able to navigate to the cricket page
  So that I read my cricket news

  Background:
    Given I have navigated to the BBC home page

  Scenario: Navigate to cricket news
    Given I have clicked on the sport button on the header
    When I click on the cricket button on the sports menu
    Then I should be redirected to the cricket page