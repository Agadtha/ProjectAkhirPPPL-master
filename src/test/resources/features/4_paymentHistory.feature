Feature: Payment History

Scenario: View payment history
Given user is logged in
When user clicks Riwayat Bayar menu
Then Riwayat Pembayaran page should be displayed
And user should see payment history information
