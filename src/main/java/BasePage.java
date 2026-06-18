import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {


    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public WebElement waitForElementVisible(By by) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public void click(By by) {
        waitForElementVisible(by).click();
    }

    public void input(By by, String text) {
        WebElement element = waitForElementVisible(by);
        element.clear();
        element.sendKeys(text);
    }

    public void keyEnter(By by, String text) {
        WebElement element = waitForElementVisible(by);
        element.sendKeys(text);
        element.sendKeys(Keys.ENTER);
    }

    public boolean isDisplayed(By by) {
        return waitForElementVisible(by).isDisplayed();
    }

    public String getText(By by) {
        return waitForElementVisible(by).getText();
    }


}
