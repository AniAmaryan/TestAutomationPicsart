package autotests;

import framework.helpers.WaitHelper;
import framework.pages.CanvasEditPage;
import framework.pages.ImagePage;
import framework.pages.SearchResultsPage;
import framework.pages.popup.GetStartedWithPicsartPopup;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import static framework.constants.Data.BASE_URL;

public class BaseTest {

    private ChromeDriver driver;
    public WaitHelper waitHelper;
    public SearchResultsPage searchResultsPage;
    public CanvasEditPage canvasEditPage;
    public ImagePage imagePage;
    public GetStartedWithPicsartPopup getStartedWithPicsartPopup;

    public BaseTest() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        waitHelper = new WaitHelper(driver);
        searchResultsPage = new SearchResultsPage(driver);
        canvasEditPage = new CanvasEditPage(driver);
        imagePage = new ImagePage(driver);
        getStartedWithPicsartPopup = new GetStartedWithPicsartPopup(driver);
    }

    @BeforeMethod
    @Parameters("resolution")
    public void openBaseUrl(String resolutionSize) {
        Dimension dem_1024_768 = new Dimension(1024, 768);
        Dimension dem_1440_900 = new Dimension(1440, 900);
        Dimension dem_1366_768 = new Dimension(1366, 768);
        if (resolutionSize.equalsIgnoreCase("1024x768")) {
            driver.manage().window().setSize(dem_1024_768);
            driver.get(BASE_URL);
        } else if (resolutionSize.equalsIgnoreCase("1440x900")) {
            driver.manage().window().setSize(dem_1440_900);
            driver.get(BASE_URL);
        } else if (resolutionSize.equalsIgnoreCase("1366x768")) {
            driver.manage().window().setSize(dem_1366_768);
            driver.get(BASE_URL);
        }
    }

    @AfterSuite
    public void quitDriver() {
        driver.quit();
    }

    public ChromeDriver getDriver() {
        return driver;
    }
}
