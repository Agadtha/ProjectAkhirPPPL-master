package stepDef;

import io.cucumber.java.Before;
import io.cucumber.java.After;
import pages.loginPage;
import utils.driverManager;

public class hooks {

    @Before
    public void setUp() {
        loginPage login = new loginPage(driverManager.getDriver());
        login.openLoginPage();
        login.inputEmail("atmajagading666@gmail.com");
        login.inputPassword("Nasigorengkuah060606");
        login.clickMasukButton();

        try {
            Thread.sleep(2000); // ✅ Tunggu 2 detik dulu sebelum cek popup
            if (login.isSuccessPopupDisplayed()) {
                login.clickMengertiButton();
            }
        } catch (Exception e) {
            System.out.println("Popup tidak muncul, lanjut...");
        }
    }
}