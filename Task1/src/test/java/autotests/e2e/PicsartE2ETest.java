package autotests.e2e;

import autotests.BaseTest;
import org.testng.annotations.Test;

import static framework.helpers.Iframe.switchToDefaultContent;

public class PicsartE2ETest extends BaseTest {
    @Test
    public void checkSearchE2EScenarios() throws InterruptedException {
        searchResultsPage.clickOnAcceptAllCookiesButton();
        searchResultsPage.switchToMainIframe(getDriver());
        searchResultsPage.closeFilter();
        searchResultsPage.verifyFilterState("closed");
        searchResultsPage.openFilter();
        searchResultsPage.verifyFilterState("open");
        searchResultsPage.clickOnPersonalCheckbox();
        searchResultsPage.verifyPlusIconDoesntExist();
        searchResultsPage.clickOnImageCardByIndex(0);
        switchToDefaultContent(getDriver());
        imagePage.verifyAllUsefulButtons();
        imagePage.clickOnLikeButton();
        getStartedWithPicsartPopup.isOnPopup();
        getStartedWithPicsartPopup.clickOnCloseButton();
        getDriver().navigate().back();
        searchResultsPage.switchToMainIframe(getDriver());
        searchResultsPage.clickOnClearAllButton();
        searchResultsPage.clickOnImageWithPlusIcon(0);
        switchToDefaultContent(getDriver());
        getStartedWithPicsartPopup.clickOnCloseButton();
        canvasEditPage.verifyCanvasIsOpen();
    }
}
