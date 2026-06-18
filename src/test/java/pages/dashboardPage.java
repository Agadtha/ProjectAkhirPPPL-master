package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class dashboardPage {


    WebDriver driver;

    By menuDashboard = By.xpath("//a[@href='/student/dashboard']");
    By titleDashboard = By.xpath("//*[contains(text(),'Dashboard')]");
    By welcomeText = By.xpath("//*[contains(text(),'SELAMAT DATANG KEMBALI')]");

    public dashboardPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickDashboardMenu() {
        driver.findElement(menuDashboard).click();
    }

    public boolean isDashboardDisplayed() {
        return driver.findElement(titleDashboard).isDisplayed();
    }

    public boolean isWelcomeTextDisplayed() {
        return driver.findElement(welcomeText).isDisplayed();
    }


}
