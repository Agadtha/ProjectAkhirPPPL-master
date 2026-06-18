package stepDef;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.schedulePage;
import utils.driverManager;

public class scheduleSteps {

    schedulePage schedule =
            new schedulePage(driverManager.getDriver());



    @When("user clicks Jadwal Belajar menu")
    public void userClicksJadwalBelajarMenu() {
        schedule.clickScheduleMenu();
    }

    @Then("Jadwal Belajar page should be displayed")
    public void jadwalBelajarPageShouldBeDisplayed() {
        Assert.assertTrue(schedule.isScheduleDisplayed());
    }

    @And("user should see schedule information")
    public void userShouldSeeScheduleInformation() {
        Assert.assertTrue(schedule.isScheduleDisplayed());
    }
}