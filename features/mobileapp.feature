# new feature
# Tags: optional

Feature: Test Trello mobile app

  Background: User is shown login page
    Given I navigate to the login page
    When I submit username and password
    Then I should be logged in

  Scenario: Test creating a board in Trello mobile app
    Given I am in the home screen
    Then I create a board with the name "ManTestMobileBoard"