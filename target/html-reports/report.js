$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Login.feature");
formatter.feature({
  "name": "Login Page",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.scenario({
  "name": "Login into system with valid credential",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@inProgress"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User enter valid username and password",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.user_enter_valid_username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.user_click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Dashboard should be opened",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.dashboard_should_be_opened()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});