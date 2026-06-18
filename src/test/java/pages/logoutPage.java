package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class logoutPage {

    WebDriver driver;
    By btnLogout = By.xpath("@class,'lz-logout-btn')]//*[contains(text(),'Keluar')]");
    By txtEmail = By.xpath("//input[@placeholder='Email']");

    public logoutPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickLogoutButton() {
        driver.findElement(btnLogout).click();
    }

    public boolean isLoginPageDisplayed() {
        return driver.findElement(txtEmail).isDisplayed();
    }
}