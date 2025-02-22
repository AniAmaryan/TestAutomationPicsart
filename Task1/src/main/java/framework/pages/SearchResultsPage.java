package framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;

import static framework.helpers.CommonHelper.isDisplayed;
import static framework.helpers.Iframe.switchToFrame;

public class SearchResultsPage extends BasePage {

    @FindBy(css = "[data-testid=\"com.picsart.social.search\"]")
    private WebElement mainIframe;

    @FindBy(id = "filter_icon")
    private WebElement filterIcon;

    @FindBy(css = "[aria-label=\"licenses-Personal\"]")
    private WebElement personalCheckbox;

    @FindBy(css = "[data-testid=\"badge\"]")
    private WebElement plusIcon;

    @FindBy(css = "[id^=\"base_card_item\"]")
    private List<WebElement> images;

    @FindBy(css = "[data-testid=\"search-filter-header-clear\"]")
    private WebElement clearAllButton;

    @FindBy(css = "[data-testid=\"search-card-root\"] > [rel=\"nofollow\"]")
    private List<WebElement> cardsWithPlusIcon;

    @FindBy(id = "onetrust-accept-btn-handler")
    private WebElement acceptAllCookiesButton;

    public SearchResultsPage(ChromeDriver driver) {
        super(driver);

    }

    public void closeFilter() {
        waitHelper.waitElementVisibility(filterIcon);
        if (filterIcon.getAttribute("data-automation").equalsIgnoreCase("open")) {
            filterIcon.click();
        }
    }

    public void openFilter() {
        waitHelper.waitElementVisibility(filterIcon);
        if (filterIcon.getAttribute("data-automation").equalsIgnoreCase("closed")) {
            filterIcon.click();
        }
    }

    public void clickOnPersonalCheckbox() {
        waitHelper.waitElementVisibility(personalCheckbox);
        personalCheckbox.click();
        waitHelper.waitElementVisibility(clearAllButton);
    }

    public void clickOnImageCardByIndex(int index) {
        if (images.isEmpty()) {
            closeFilter();
        }
        waitHelper.waitElementVisibility(images.get(index));
        images.get(index).click();
    }

    public void clickOnClearAllButton() {
        openFilter();
        waitHelper.waitElementVisibility(clearAllButton, 20);
        clearAllButton.click();
    }

    public void clickOnImageWithPlusIcon(int index) {
        closeFilter();
        waitHelper.waitElementVisibility(plusIcon, 20);
        cardsWithPlusIcon.get(index).click();
    }

    public void clickOnAcceptAllCookiesButton() {
        waitHelper.waitElementVisibility(acceptAllCookiesButton, 20);
        acceptAllCookiesButton.click();
    }

    public void verifyFilterState(String state) {
        Assert.assertTrue(filterIcon.getAttribute("data-automation").equalsIgnoreCase(state));
    }

    public void verifyPlusIconDoesntExist() {
        Assert.assertFalse(isDisplayed(plusIcon));
    }

    public void switchToMainIframe(ChromeDriver driver) {
        waitHelper.waitElementVisibility(mainIframe, 20);
        switchToFrame(driver, mainIframe);
    }


}
