package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class dashboardPage {


    WebDriver driver;

    By menuDashboard = By.xpath("//a[@href='/student/dashboard']");
    By titleDashboard = By.xpath("//*[contains(text(),'Dashboard')]");
    By welcomeText = By.xpath("//*[contains(text(),'SELAMAT DATANG KEMBALI')]");
    By menuPaketBelajar =
            By.xpath("//*[contains(text(),'Paket Belajar')]");

    By menuJadwalBelajar =
            By.xpath("//*[contains(text(),'Jadwal Belajar')]");

    By menuRiwayatBayar =
            By.xpath("//*[contains(text(),'Riwayat Bayar')]");

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

    public void clickPaketBelajarMenu() {

        driver.findElement(
                menuPaketBelajar
        ).click();
    }

    public void clickJadwalBelajarMenu() {

        driver.findElement(
                menuJadwalBelajar
        ).click();
    }

    public void clickRiwayatBayarMenu() {

        driver.findElement(
                menuRiwayatBayar
        ).click();
    }

}
