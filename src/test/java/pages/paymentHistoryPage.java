package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class paymentHistoryPage {


    WebDriver driver;

    By menuRiwayatBayar = By.xpath("//a[@href='/student/payment-history']");
    By titleRiwayatPembayaran = By.xpath("//*[contains(text(),'Riwayat Pembayaran')]");
    By emptyPaymentText = By.xpath("//*[contains(text(),'Belum ada riwayat pembayaran')]");

    public paymentHistoryPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickRiwayatBayarMenu() {
        driver.findElement(menuRiwayatBayar).click();
    }

    public boolean isPaymentHistoryDisplayed() {
        return driver.findElement(titleRiwayatPembayaran).isDisplayed();
    }

    public boolean isEmptyPaymentMessageDisplayed() {
        return driver.findElement(emptyPaymentText).isDisplayed();
    }


}
