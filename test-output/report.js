$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/SING110/Documents/JAVARELATEDITEMS/POMWorkspace/CucumberUsingPOM/src/main/java/com/qa3/features/login.feature");
formatter.feature({
  "line": 1,
  "name": "Login into application",
  "description": "",
  "id": "login-into-application",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Login with correct username \u0026 password",
  "description": "",
  "id": "login-into-application;login-with-correct-username-\u0026-password",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "verify title of login page",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "user enters username and password",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user lands on homepage",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "quits the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.user_is_on_login_page()"
});
formatter.result({
  "duration": 9044544300,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.verify_title_of_login_page()"
});
formatter.result({
  "duration": 68791500,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_enters_username_and_password()"
});
formatter.result({
  "duration": 630050400,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_lands_on_homepage()"
});
formatter.result({
  "duration": 1323435000,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.quits_the_browser()"
});
formatter.result({
  "duration": 2530649500,
  "status": "passed"
});
});