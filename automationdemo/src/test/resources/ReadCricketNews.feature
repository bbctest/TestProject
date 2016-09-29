Feature: Read cricket news on BBC
  As a BBC user
  I want to be able to navigate to the Cricket page
  So that I read my news

  Scenario: Navigate to cricket news
    Given I have navigated to the BBC Home page
    And I have navigated the Sports page
    Given I have clicked on the Cricket

#Background:
#    Given I have navigated to the BBC Home page
#    And I have navigated the Sports page
#
#Scenario: Navigate to cricket news
#  Given I have clicked on the Cricket
#  When I click on the main new
#  Then I should be redirected to the page with the news details