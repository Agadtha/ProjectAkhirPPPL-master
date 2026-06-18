Feature: Dashboard

Scenario: View dashboard
Given user is logged in
When user clicks Dashboard menu
Then Dashboard page should be displayed
And user should see dashboard information
