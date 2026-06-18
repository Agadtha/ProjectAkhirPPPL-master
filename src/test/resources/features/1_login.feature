Feature: Login

  Scenario: Login successfully
    Given the user is on the login page
    When the user enters a valid email and password
    And clicks the login button
    Then the user should be redirected to the dashboard