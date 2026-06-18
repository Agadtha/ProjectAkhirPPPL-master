package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class loginPage {

    WebDriver driver;

    By txtEmail = By.xpath("//input[@placeholder='Email']");
    By txtPassword = By.xpath("//input[@placeholder='Password']");
    By btnMasuk = By.xpath("//button[contains(.,'Masuk')]");
    By popupBerhasil = By.xpath("//*[contains(text(),'Selamat datang')]");
    By btnMengerti = By.xpath("//button[contains(.,'Mengerti')]");

    public loginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openLoginPage() {
        driver.get("http://localhost:5173/login");
    }

    public void inputEmail(String email) {
        driver.findElement(txtEmail).sendKeys(email);
    }

    public void inputPassword(String password) {
        driver.findElement(txtPassword).sendKeys(password);
    }

    public void clickMasukButton() {
        driver.findElement(btnMasuk).click();
    }

    public void verifyDashboardPage() {
        // assertion sesuai aplikasi
    }

    public boolean isSuccessPopupDisplayed() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(
                ExpectedConditions.visibilityOfElementLocated(popupBerhasil)
        );

        return driver.findElement(popupBerhasil).isDisplayed();
    }

    public void clickMengertiButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // ✅ Tunggu popup/overlay lain hilang dulu jika ada
        wait.until(ExpectedConditions.invisibilityOfElementLocated(
                By.xpath("//*[contains(@class,'overlay') or contains(@class,'backdrop')]")
        ));

        WebElement btn = wait.until(
                ExpectedConditions.elementToBeClickable(btnMengerti)
        );

        // ✅ Gunakan JavaScript click sebagai fallback jika biasa gagal
        try {
            btn.click();
        } catch (Exception e) {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].click();", btn);
        }
    }



}