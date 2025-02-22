package framework.helpers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitHelper {

    private ChromeDriver driver;
    private static final int DEFAULT_TIMEOUT = 10;

    public WaitHelper(ChromeDriver driver) {
        this.driver = driver;
    }

    public void waitElementVisibility(WebElement webElement) {
        WebDriverWait wait = new WebDriverWait(driver, DEFAULT_TIMEOUT);
        wait.until(ExpectedConditions.visibilityOf(webElement));
    }

    public void waitElementInvisibility(WebElement webElement) {
        WebDriverWait wait = new WebDriverWait(driver, DEFAULT_TIMEOUT);
        wait.until(ExpectedConditions.invisibilityOf(webElement));
    }

    public void waitElementClickable(WebElement webElement) {
        WebDriverWait wait = new WebDriverWait(driver, DEFAULT_TIMEOUT);
        wait.until(ExpectedConditions.elementToBeClickable(webElement));
    }

    public void waitElementVisibility(WebElement webElement, int timeOut) {
        WebDriverWait wait = new WebDriverWait(driver, timeOut);
        wait.until(ExpectedConditions.visibilityOf(webElement));
    }

    public void waitElementInvisibility(WebElement webElement, int timeOut) {
        WebDriverWait wait = new WebDriverWait(driver, timeOut);
        wait.until(ExpectedConditions.invisibilityOf(webElement));
    }

    public void waitElementClickable(WebElement webElement, int timeOut) {
        WebDriverWait wait = new WebDriverWait(driver, timeOut);
        wait.until(ExpectedConditions.elementToBeClickable(webElement));
    }

}
