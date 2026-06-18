Feature: Dashboard Navigation

  Scenario: View Dashboard
    Given user is logged in
    When user clicks Dashboard menu
    Then Dashboard page should be displayed
    And user should see dashboard information

  Scenario: Navigate to Paket Belajar
    Given user is logged in
    When user clicks Paket Belajar menu
    Then Paket Belajar page should be displayed

  Scenario: Navigate to Jadwal Belajar
    Given user is logged in
    When user clicks Jadwal Belajar menu
    Then Jadwal Belajar page should be displayed

  Scenario: Navigate to Riwayat Bayar
    Given user is logged in
    When user clicks Riwayat Bayar menu
    Then Riwayat Bayar page should be displayed