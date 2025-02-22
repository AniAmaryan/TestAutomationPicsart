package framework.helpers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

    public static void switchToFrame(ChromeDriver driver, WebElement element) {
        driver.switchTo().frame(element);
    }

    public static void switchToDefaultContent(ChromeDriver driver) {
        driver.switchTo().defaultContent();
    }
}
