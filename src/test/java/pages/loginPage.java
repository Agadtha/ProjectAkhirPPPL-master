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
    WebDriverWait wait;

    By txtEmail     = By.xpath("//input[@placeholder='Email']");
    By txtPassword  = By.xpath("//input[@placeholder='Password']");

    // ✅ Fix: ganti ke button login yang benar
    By btnMasuk     = By.xpath("//button[normalize-space()='Masuk']");

    By popupBerhasil = By.xpath("//*[contains(text(),'Selamat datang')]");

    // Cukup satu selector untuk Mengerti
    By btnMengerti  = By.xpath("//button[normalize-space()='Mengerti']");

    public loginPage(WebDriver driver) {
        this.driver = driver;
        this.wait   = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public void openLoginPage() {
        driver.get("http://localhost:5173/login");
    }

    public void inputEmail(String email) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(txtEmail))
                .sendKeys(email);
    }

    public void inputPassword(String password) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(txtPassword))
                .sendKeys(password);
    }

    public void clickMasukButton() {
        WebElement btn = wait.until(
                ExpectedConditions.elementToBeClickable(btnMasuk)
        );
        btn.click();
    }

    public void verifyDashboardPage() {
        // assertion sesuai aplikasi
    }

    public boolean isSuccessPopupDisplayed() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(popupBerhasil));
        return driver.findElement(popupBerhasil).isDisplayed();
    }

    public void clickMengertiButton() {
        WebElement btn = wait.until(
                ExpectedConditions.presenceOfElementLocated(btnMengerti)
        );

        wait.until(ExpectedConditions.elementToBeClickable(btnMengerti));

        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].scrollIntoView({block:'center'});", btn);

        try {
            btn.click();
        } catch (Exception e) {
            ((JavascriptExecutor) driver)
                    .executeScript("arguments[0].click();", btn);
        }
    }
}