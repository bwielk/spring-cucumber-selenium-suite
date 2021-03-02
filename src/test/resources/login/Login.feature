  Feature: Failed login attempt

    Background: User enters the login page
      Given the login page is open

    Scenario: Failed login with both invalid credentials
      Given a user has entered a wrong username "abc"
      And the user has entered an invalid password "def"
      When the user hits the submit button
      Then the user sees an error
      And the user is not logged in

    Scenario: Successful login
      Given a user has entered a valid username
      And the user has entered a valid password
      When the user hits the submit button
      Then the user is logged in
      And the user sees the user panel