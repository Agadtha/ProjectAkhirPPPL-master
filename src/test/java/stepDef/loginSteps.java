package stepDef;

import io.cucumber.java.Before;
import io.cucumber.java.After;
import io.cucumber.java.en.*;
import pages.loginPage;
import org.junit.Assert;
import utils.driverManager;

public class loginSteps {

    loginPage login;

    // ✅ Diinisialisasi SETELAH driver siap
    @Before
    public void setUp() {
        login = new loginPage(driverManager.getDriver());
    }

    @After
    public void tearDown() {
        driverManager.quitDriver(); // ✅ Browser ditutup setelah semua test selesai
    }

    @Given("the user is on the login page")
    public void theUserIsOnTheLoginPage() {
        login.openLoginPage();
    }

    @When("the user enters a valid email and password")
    public void theUserEntersAValidEmailAndPassword() {
        login.inputEmail("atmajagading666@gmail.com");
        login.inputPassword("Nasigorengkuah060606");
    }

    @And("clicks the login button")
    public void clicksTheLoginButton() {
        login.clickMasukButton();
    }

    @Then("the user should be redirected to the dashboard")
    public void theUserShouldBeRedirectedToTheDashboard() {
        login.verifyDashboardPage();
    }

    @Then("success login notification should be displayed")
    public void successLoginNotificationShouldBeDisplayed() {
        Assert.assertTrue(login.isSuccessPopupDisplayed());
    }

    @And("user clicks Mengerti button")
    public void userClicksMengertiButton() {
        login.clickMengertiButton();
    }
}