# TestAutomationPicsart
A Selenium WebDriver framework using TestNG and POM, supporting parallel execution and explicit waits

This is a Selenium WebDriver automation framework using TestNG, designed to test the Picsart web application. The framework follows the Page Object Model (POM) for better maintainability and supports parallel execution with different screen resolutions. It includes structured test execution, explicit waits via WaitHelper, and iframe handling for smoother interactions. The project is structured with constants, helper utilities, page object classes, and end-to-end test scenarios. Tests run in parallel on screen resolutions (1024x768, 1440x900, 1366x768) using TestNG parameters.

Tests can be run both in the IDE and from the terminal using the mvn clean test command. The framework includes key classes such as BasePage.java for initializing web elements and managing waits, BaseTest.java for WebDriver setup, PicsartE2ETest.java for end-to-end tests, WaitHelper.java for explicit waits, Iframe.java for iframe handling, and CommonHelper.java for element visibility checks. Additional classes handle specific functionalities: SearchResultsPage.java manages search interactions, ImagePage.java automates liking, saving, and editing functionalities by verifying the visibility of important buttons and interacting with them., CanvasEditPage.java ensures canvas visibility, and GetStartedWithPicsartPopup.java manages authentication popups.

The project dependencies are managed via Maven, including selenium-java for browser automation, testng for test execution, and webdrivermanager for driver management. The Maven Surefire Plugin runs TestNG test suites in parallel and ensures automated test execution.

Create a web automation framework with one test that will run in parallel on three different
resolutions: 1024 x 768, 1440 x 900, and 1366 x 768.
Test Case:
1. Navigate to Picsart Search.
2. Click on the filter button and verify that the filters disappear.
3. Click on the filter button again to open the filters.
4. Choose the &quot;Personal&quot; checkbox from the “License” section and verify that there are
no “PLUS” assets. Clicking on an asset should display image browser page and there
will be the like, save, and Edit this image buttons.
5. Click on the like button and verify that the sign-in popup appears.
6. Close the popup.
7. Go back to the search screen
8. Remove the filter.
9. Click on a “PLUS” asset and verify that the editing screen opens with the image
applied to the canvas.
