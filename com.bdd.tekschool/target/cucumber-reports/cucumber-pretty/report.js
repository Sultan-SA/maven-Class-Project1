$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/login.feature");
formatter.feature({
  "comments": [
    {
      "line": 2,
      "value": "#this is the name of feature"
    }
  ],
  "line": 3,
  "name": "Login Action",
  "description": "",
  "id": "login-action",
  "keyword": "Feature"
});
formatter.scenario({
  "comments": [
    {
      "line": 5,
      "value": "#this is name of scenario"
    }
  ],
  "line": 7,
  "name": "Login test to TekSChool Test Environment",
  "description": "",
  "id": "login-action;login-test-to-tekschool-test-environment",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "User is TekSchool page",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "User Click on Test Environment link",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "User should see Test Environment page",
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
});