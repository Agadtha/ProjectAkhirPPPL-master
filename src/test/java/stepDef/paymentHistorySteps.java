package stepDef;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.paymentHistoryPage;
import utils.driverManager;

public class paymentHistorySteps {

    paymentHistoryPage payment =
            new paymentHistoryPage(driverManager.getDriver());

    @When("user clicks Riwayat Bayar menu")
    public void userClicksRiwayatBayarMenu() {
        payment.clickRiwayatBayarMenu();
    }

    @Then("Riwayat Pembayaran page should be displayed")
    public void riwayatPembayaranPageShouldBeDisplayed() {
        Assert.assertTrue(payment.isPaymentHistoryDisplayed());
    }

    @And("user should see payment history information")
    public void userShouldSeePaymentHistoryInformation() {
        Assert.assertTrue(payment.isPaymentHistoryDisplayed());
    }
}