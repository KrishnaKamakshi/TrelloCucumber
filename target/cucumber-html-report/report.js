$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("mobileapp.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# new feature"
    },
    {
      "line": 2,
      "value": "# Tags: optional"
    }
  ],
  "line": 4,
  "name": "Test Trello mobile app",
  "description": "",
  "id": "test-trello-mobile-app",
  "keyword": "Feature"
});
formatter.background({
  "line": 6,
  "name": "User is shown login page",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 7,
  "name": "I navigate to the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I submit username and password",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I should be logged in",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 11,
  "name": "Test creating a board in Trello mobile app",
  "description": "",
  "id": "test-trello-mobile-app;test-creating-a-board-in-trello-mobile-app",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "I am in the home screen",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "I create a board with the name \"ManTestMobileBoard\"",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.uri("trelloScenario.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# new feature"
    },
    {
      "line": 2,
      "value": "# Tags: optional"
    }
  ],
  "line": 4,
  "name": "Test Trello CRUD Features",
  "description": "",
  "id": "test-trello-crud-features",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 6,
  "name": "Create a new board",
  "description": "",
  "id": "test-trello-crud-features;create-a-new-board",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "Open chrome browser and start application",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I login into the application using \"manikant.p@qapitol.com\" and \"Pmani12*\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Validate if there are no boards present",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Create a new board",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "Add a new card",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});