package framework.pages.popup;

import framework.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import static framework.helpers.CommonHelper.isDisplayed;

public class GetStartedWithPicsartPopup extends BasePage {

    @FindBy(css = "[data-testid=\"auth-form-container\"]")
    private WebElement signInPopup;

    @FindBy(css = "[data-testid=\"modal-close-icon\"]")
    private WebElement closeButton;

    public GetStartedWithPicsartPopup(ChromeDriver driver) {
        super(driver);
    }

    public void clickOnCloseButton() {
        waitHelper.waitElementVisibility(closeButton, 20);
        closeButton.click();
    }

    public void isOnPopup() {
        waitHelper.waitElementVisibility(signInPopup, 20);
        Assert.assertTrue(isDisplayed(signInPopup));
    }
}
