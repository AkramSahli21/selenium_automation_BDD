$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("authentification/Authentification.feature");
formatter.feature({
  "line": 2,
  "name": "Authentification",
  "description": "As a user i want to sign in",
  "id": "authentification",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "line": 6,
  "name": "Authentification avec identifiants valides",
  "description": "",
  "id": "authentification;authentification-avec-identifiants-valides",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@Valid_Connxion"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I navigate to the application",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I enter the correct username",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I enter the correct password",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I click to the button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I connect to the dashbord page",
  "keyword": "Then "
});
formatter.match({
  "location": "AuthentificationStepDef.i_navigate_to_the_application()"
});
formatter.result({
  "duration": 167823200,
  "error_message": "java.lang.NullPointerException\r\n\tat com.e2etests.automation.stepDefenitions.AuthentificationStepDef.i_navigate_to_the_application(AuthentificationStepDef.java:31)\r\n\tat ✽.Given I navigate to the application(authentification/Authentification.feature:7)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "AuthentificationStepDef.i_enter_the_correct_username()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AuthentificationStepDef.i_enter_the_correct_password()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AuthentificationStepDef.i_click_to_the_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AuthentificationStepDef.i_connect_to_the_dashbord_page()"
});
formatter.result({
  "status": "skipped"
});
});