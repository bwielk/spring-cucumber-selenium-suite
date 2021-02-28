  Feature: Failed login attempt

    Background: User enters the login page
      Given the login page is open

    Scenario: Failed login with both invalid credentials
      Given a user has entered a wrong username "abc"
      And the user has entered an invalid password "def"
      When the user hits the submit button
      Then the user sees an error
      And the user is not logged in