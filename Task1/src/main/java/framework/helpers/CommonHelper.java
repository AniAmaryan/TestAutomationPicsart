package framework.helpers;

import org.openqa.selenium.WebElement;

public class CommonHelper {

    public static boolean isDisplayed(WebElement element) {
        try {
            if (element.isDisplayed()) return true;
        } catch (Exception e) {
            return false;
        }
        return false;
    }

}
