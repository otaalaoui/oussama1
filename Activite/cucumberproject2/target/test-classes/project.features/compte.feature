Feature: Creating a new user account

  Scenario: Create an account with valid information
    Given user is on the account creation page
    When user enters their first name
    And user enters their last name
    And user enters their company name
    And user enters their phone number
    And user enters their complete address
    And user selects the country
    And user selects the state
    And user selects a city
    And user selects a locality
    And user selects a postal code
    And user enters their email address
    And user enters a password
    And user confirms the password
    And clicks on the create account button
    Then user account is successfully created
