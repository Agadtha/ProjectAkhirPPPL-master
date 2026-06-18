package stepDef;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.dashboardPage;
import utils.driverManager;

public class dashboardSteps {

    dashboardPage dashboard =
            new dashboardPage(driverManager.getDriver());

    @When("user clicks Dashboard menu")
    public void userClicksDashboardMenu() {

        dashboard.clickDashboardMenu();
    }

    @Then("Dashboard page should be displayed")
    public void dashboardPageShouldBeDisplayed() {

        Assert.assertTrue(
                dashboard.isDashboardDisplayed()
        );
    }

    @And("user should see dashboard information")
    public void userShouldSeeDashboardInformation() {

        Assert.assertTrue(
                dashboard.isWelcomeTextDisplayed()
        );
    }

    @When("user clicks Paket Belajar menu")
    public void userClicksPaketBelajarMenu() {

        dashboard.clickPaketBelajarMenu();
    }

    @Then("Paket Belajar page should be displayed")
    public void paketBelajarPageShouldBeDisplayed() {

        Assert.assertTrue(
                driverManager.getDriver()
                        .getCurrentUrl()
                        .contains("package")
        );
    }

    @When("user clicks Jadwal Belajar menu")
    public void userClicksJadwalBelajarMenu() {

        dashboard.clickJadwalBelajarMenu();
    }

    @Then("Jadwal Belajar page should be displayed")
    public void jadwalBelajarPageShouldBeDisplayed() {

        Assert.assertTrue(
                driverManager.getDriver()
                        .getCurrentUrl()
                        .contains("schedule")
        );
    }

    @When("user clicks Riwayat Bayar menu")
    public void userClicksRiwayatBayarMenu() {

        dashboard.clickRiwayatBayarMenu();
    }

    @Then("Riwayat Bayar page should be displayed")
    public void riwayatBayarPageShouldBeDisplayed() {

        Assert.assertTrue(
                driverManager.getDriver()
                        .getCurrentUrl()
                        .contains("payment")
        );
    }
}