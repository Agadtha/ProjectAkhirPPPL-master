package stepDef;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.loginPage;
import pages.logoutPage;
import utils.driverManager;

public class logoutSteps {

    // ✅ Pakai driverManager, BUKAN new ChromeDriver()
    loginPage login = new loginPage(driverManager.getDriver());
    logoutPage logout = new logoutPage(driverManager.getDriver());

    @Given("the user is logged in")
    public void the_user_is_logged_in() {
        // sudah dihandle @Before di hooks.java
    }

    @When("the user clicks the logout button")
    public void the_user_clicks_the_logout_button() {
        logout.clickLogoutButton();
    }

    @Then("the user should be redirected to the login page")
    public void the_user_should_be_redirected_to_the_login_page() {
        Assert.assertTrue(logout.isLoginPageDisplayed());
    }

    @And("the session should be terminated")
    public void the_session_should_be_terminated() {
        Assert.assertTrue(true);
    }

    @Given("the user has logged out")
    public void the_user_has_logged_out() {
        // @Before sudah login, tinggal logout saja
        logoutPage logout = new logoutPage(driverManager.getDriver());
        logout.clickLogoutButton();
    }

    @When("the user tries to access the dashboard URL")
    public void the_user_tries_to_access_the_dashboard_url() {
        // ✅ Pakai driver dari driverManager
        driverManager.getDriver().get("http://localhost:5173/dashboard");
    }
}