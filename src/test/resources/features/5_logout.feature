Feature: Logout

  As a logged-in user
  I want to logout from the system
  So that my account remains secure

  Scenario: Logout successfully
    Given the user is logged in
    When the user clicks the logout button
    Then the user should be redirected to the login page
    And the session should be terminated

  Scenario: Access dashboard after logout
    Given the user has logged out
    When the user tries to access the dashboard URL
    Then the user should be redirected to the login page