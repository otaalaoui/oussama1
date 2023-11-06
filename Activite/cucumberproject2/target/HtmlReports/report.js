$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/project.features/compte.feature");
formatter.feature({
  "name": "Creating a new user account",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Create an account with valid information",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user is on the account creation page",
  "keyword": "Given "
});
formatter.match({
  "location": "create.compte.steps.CompteSteps.is_login_in_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters their first name",
  "keyword": "When "
});
formatter.match({
  "location": "create.compte.steps.CompteSteps.user_enters_their_first_name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters their last name",
  "keyword": "And "
});
formatter.match({
  "location": "create.compte.steps.CompteSteps.user_enters_their_last_name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters their company name",
  "keyword": "And "
});
formatter.match({
  "location": "create.compte.steps.CompteSteps.user_enters_their_company()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters their phone number",
  "keyword": "And "
});
formatter.match({
  "location": "create.compte.steps.CompteSteps.user_enters_their_phone_number()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters their complete address",
  "keyword": "And "
});
formatter.match({
  "location": "create.compte.steps.CompteSteps.user_enters_their_complete_address()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects the country",
  "keyword": "And "
});
formatter.match({
  "location": "create.compte.steps.CompteSteps.user_selects_the_country()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects the state",
  "keyword": "And "
});
formatter.match({
  "location": "create.compte.steps.CompteSteps.user_selects_the_state()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects a city",
  "keyword": "And "
});
formatter.match({
  "location": "create.compte.steps.CompteSteps.user_selects_a_city()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects a locality",
  "keyword": "And "
});
formatter.match({
  "location": "create.compte.steps.CompteSteps.user_selects_a_locality()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects a postal code",
  "keyword": "And "
});
formatter.match({
  "location": "create.compte.steps.CompteSteps.user_selects_a_postal_code()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters their email address",
  "keyword": "And "
});
formatter.match({
  "location": "create.compte.steps.CompteSteps.user_enters_their_email_address()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters a password",
  "keyword": "And "
});
formatter.match({
  "location": "create.compte.steps.CompteSteps.user_enters_a_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user confirms the password",
  "keyword": "And "
});
formatter.match({
  "location": "create.compte.steps.CompteSteps.user_confirms_the_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks on the create account button",
  "keyword": "And "
});
formatter.match({
  "location": "create.compte.steps.CompteSteps.clicks_on_the_create_account_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user account is successfully created",
  "keyword": "Then "
});
formatter.match({
  "location": "create.compte.steps.CompteSteps.user_account_is_successfully_created()"
});
formatter.result({
  "status": "passed"
});
});