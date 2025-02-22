package framework.pages;

import framework.helpers.WaitHelper;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public WaitHelper waitHelper;

    public BasePage(ChromeDriver driver) {
        PageFactory.initElements(driver, this);
        waitHelper = new WaitHelper(driver);
    }
}
