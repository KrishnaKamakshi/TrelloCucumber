# new feature
# Tags: optional

Feature: Test Trello CRUD Features

  Scenario: Create a new board
    Given Open chrome browser and start application
    When I login into the application using "manikant.p@qapitol.com" and "Pmani12*"
    Then Validate if there are no boards present
    Then Create a new board
    Then Add a new card