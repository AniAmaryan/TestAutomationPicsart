package framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import static framework.helpers.CommonHelper.isDisplayed;

public class ImagePage extends BasePage {

    @FindBy(css = "[data-testid=\"likeComponent\"]")
    private WebElement likeButton;

    @FindBy(xpath = "//*[text() = 'Edit this image']")
    private WebElement editThisImageButton;

    @FindBy(xpath = "//*[@type='button']//*[text() = 'save']")
    private WebElement saveButton;

    public ImagePage(ChromeDriver driver) {
        super(driver);
    }

    public void clickOnLikeButton() {
        likeButton.click();
    }

    public void verifyAllUsefulButtons() {
        waitHelper.waitElementVisibility(likeButton, 20);
        Assert.assertTrue(isDisplayed(likeButton));
        Assert.assertTrue(isDisplayed(editThisImageButton));
        Assert.assertTrue(isDisplayed(saveButton));
    }

}
