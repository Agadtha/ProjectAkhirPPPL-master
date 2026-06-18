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
        Assert.assertTrue(dashboard.isDashboardDisplayed());
    }

    @And("user should see dashboard information")
    public void userShouldSeeDashboardInformation() {
        Assert.assertTrue(dashboard.isWelcomeTextDisplayed());
    }
}