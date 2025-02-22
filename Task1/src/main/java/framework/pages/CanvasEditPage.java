package framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class CanvasEditPage extends BasePage {

    @FindBy(css = "[class=\"konvajs-content\"] > [style*=\"background: transparent\"]")
    private WebElement canvasContainer;

    public CanvasEditPage(ChromeDriver driver) {
        super(driver);
    }

    public void verifyCanvasIsOpen() {
        waitHelper.waitElementVisibility(canvasContainer, 20);
        Assert.assertEquals(canvasContainer.getTagName(), "canvas");
    }
}
