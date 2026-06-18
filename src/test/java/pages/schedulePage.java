package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class schedulePage {

    WebDriver driver;

    // ✅ Menu: targetkan elemen navigasi (sidebar/nav)

    // atau lebih simpel pakai href
    By menuSchedule = By.xpath("//a[@href='/student/schedule']");

    // ✅ Title: targetkan heading di dalam konten halaman
    By titleSchedule = By.xpath("//main//*[contains(text(),'Jadwal Belajar')] | //h1[contains(text(),'Jadwal Belajar')] | //h2[contains(text(),'Jadwal Belajar')]");

    public schedulePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickScheduleMenu() {
        driver.findElement(menuSchedule).click();
    }

    public boolean isScheduleDisplayed() {
        return driver.findElement(titleSchedule).isDisplayed();
    }
}