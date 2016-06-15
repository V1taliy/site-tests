package utils;

import org.apache.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.util.List;

import static java.lang.String.format;

public class WebElementsActions {

    private final static Logger log = Logger.getLogger(WebElementsActions.class);
    private static WebDriverWait driverWait;
    private ConfigData config;
    private WebDriverWrapper driverWrapper;

    public WebElementsActions(WebDriverWrapper driverWrapper) {
        this.driverWrapper = driverWrapper;
        driverWait = new WebDriverWait(driverWrapper,
                Integer.parseInt(PropertyLoader.loadProperty("wait.timeout")));
        config = ConfigData.getConfigData();
    }

    /**
     * This method return the desired element with locator
     *
     * @param elementLocator search element locator
     * @return element {@link WebElement} driverWrapper from
     * configuration {@link WebElementsActions#config}
     * @throws NoSuchElementException If the locator cannot found
     */
    public WebElement getElement(String elementLocator) throws NoSuchElementException {
        log.info(format("get element < %s >", elementLocator));
        return driverWrapper.findElement(config.getLocator(elementLocator));
    }

    /**
     * Open page
     *
     * @param url url{@see uniform resource locator} of the page
     */
    public void openPage(String url) {
        driverWrapper.get(url);
        log.info("browser open page < %s >" + url);
    }

    /**
     * Insert value into text input HTML field
     *
     * @param inputLocator search a locator for input
     * @param data         data input
     * @throws NoSuchElementException If the locator cannot found
     */
    public void input(String inputLocator, String data) throws NoSuchElementException {
        driverWrapper.findElement(config.getLocator(inputLocator)).sendKeys(data);
        log.info(format("input < %s > and send < %s >", inputLocator, data));
    }

    /**
     * Clear text field or some field
     *
     * @param clearLocator search a locator
     * @throws NoSuchElementException If the locator cannot found
     */
    public void clear(String clearLocator) throws NoSuchElementException {
        driverWrapper.findElement(config.getLocator(clearLocator)).clear();
        log.info(format("clear element < %s >", clearLocator));
    }

    /**
     * Clear text field and input data
     *
     * @param inputLocator search a locator for input
     * @param inputData    search a locator for data input
     * @throws NoSuchElementException If the locator cannot found
     */
    public void clearAndInput(String inputLocator, String inputData) throws NoSuchElementException {
        driverWrapper.findElement(config.getLocator(inputLocator)).clear();
        driverWrapper.findElement(config.getLocator(inputLocator)).sendKeys(inputData);
        log.info(format("clear < %s > and input < %s >", inputLocator, inputData));
    }

    /**
     * Insert value into text input HTML field and Click ENTER
     * for Field which used in the xpath expression
     *
     * @param inputLocator search a locator for input
     * @param inputData    search a locator for data input
     * @throws NoSuchElementException If the locator cannot found
     */
    public void clearAndInputAndClickEnter(String inputLocator, String inputData) throws NoSuchElementException {
        driverWrapper.findElement(config.getLocator(inputLocator)).clear();
        driverWrapper.findElement(config.getLocator(inputLocator)).sendKeys(inputData);
        driverWrapper.findElement(config.getLocator(inputLocator)).sendKeys(Keys.ENTER);
        log.info(format("clear < %s > and send < %s > and click ENTER.", inputLocator, inputData));
    }

    /**
     * Click on element
     *
     * @param elementLocator search element locator for click
     * @throws NoSuchElementException If the locator cannot found
     */
    public void clickElement(String elementLocator) throws NoSuchElementException {
        driverWrapper.findElement(config.getLocator(elementLocator)).click();
        log.info(format("click element < %s >", elementLocator));
    }

    /**
     * Click a button
     *
     * @param buttonLocator search button locator for click
     * @throws NoSuchElementException If the locator cannot found
     */
    public void clickButton(String buttonLocator) throws NoSuchElementException {
        driverWrapper.findElement(config.getLocator(buttonLocator)).click();
        log.info(format("click on button < %s >", buttonLocator));
    }

    /**
     * Click a link
     *
     * @param linkLocator search link locator for click
     * @throws NoSuchElementException If the locator cannot found
     */
    public void clickLink(String linkLocator) throws NoSuchElementException {
        driverWrapper.findElement(config.getLocator(linkLocator)).click();
        log.info(format("click on link < %s >", linkLocator));
    }

    /**
     * Move to element and click on this element
     *
     * @param moveToLocator search move locator
     * @throws NoSuchElementException If the locator cannot found
     */
    public void moveToElement(String moveToLocator) throws NoSuchElementException {
        WebElement webElement = driverWrapper.findElement(config.getLocator(moveToLocator));
        Actions actions = new Actions(driverWrapper.getOriginalDriver());
        actions.moveToElement(webElement);
        log.info(format("move to element < %s >", moveToLocator));
        actions.perform();
    }

    /**
     * Move to element and click on this element
     *
     * @param moveToLocator  search move locator
     * @param clickToElement search element for click
     * @throws NoSuchElementException If the locator cannot found
     */
    public void moveToElementAndClick(String moveToLocator, String clickToElement) throws NoSuchElementException {
        WebElement webElement = driverWrapper.findElement(config.getLocator(moveToLocator));
        Actions actions = new Actions(driverWrapper.getOriginalDriver());
        actions.moveToElement(webElement);
        log.info(format("move to element < %s >", moveToLocator));
        actions.perform();
        clickElement(clickToElement);
    }

    /**
     * Select/deselect the checkbox
     *
     * @param checkBoxLocator search check box locator
     * @throws NoSuchElementException If the locator cannot found
     */
    public void selectCheckBox(String checkBoxLocator) throws NoSuchElementException {
        if (driverWrapper.findElement(config.getLocator(checkBoxLocator)).isSelected()) {
            driverWrapper.findElement(config.getLocator(checkBoxLocator)).click();
            log.info(format("select < %s >", checkBoxLocator));
        }
    }

    /**
     * Select/deselect the checkbox, the second parameter should be true or false
     *
     * @param checkBoxLocator  search check box locator
     * @param isCheckBoxSelect true if check box is select, otherwise false
     * @throws NoSuchElementException If the locator cannot found
     */
    public void selectCheckBox(String checkBoxLocator, boolean isCheckBoxSelect) throws NoSuchElementException {
        if (driverWrapper.findElement(config.getLocator(checkBoxLocator)).isSelected() &
                !isCheckBoxSelect) {
            driverWrapper.findElement(config.getLocator(checkBoxLocator)).click();
            log.info(format("check box < %s > selected < %b >", checkBoxLocator, false));
        }
        if (!(!driverWrapper.findElement(config.getLocator(checkBoxLocator)).isSelected() &
                isCheckBoxSelect)) {
            return;
        }
        driverWrapper.findElement(config.getLocator(checkBoxLocator)).click();
        log.info(format("check box < %s > selected < %b >", checkBoxLocator, true));
    }

    /**
     * Method is used to check that element is present on page
     *
     * @param elementLocator search element locator
     * @return true if element is present on page, otherwise false
     * @throws NoSuchElementException If the locator cannot found
     */
    public boolean isElementPresent(String elementLocator) throws NoSuchElementException {
        if (!driverWrapper.findElement(config.getLocator(elementLocator)).isDisplayed()) {
            log.info(format("< %s > not present on page.", elementLocator));
            return false;
        }
        log.info(format("< %s > is present on page.", elementLocator));
        return true;
    }

    /**
     * This method is used to agree messages on pop-up windows
     *
     * @return true if alert is present on page, otherwise false
     * @throws NoAlertPresentException If alert is not found on page
     */
    public boolean isAlertPresentAndAccept() {
        boolean isAlertPresent = false;
        try {
            Alert alert = driverWrapper.switchTo().alert();
            alert.accept();
            isAlertPresent = true;
            log.info("alert is present on page");
        } catch (NoAlertPresentException e) {
            e.printStackTrace();
            log.error(format("alert is not found. NoAlertPresentException < %s >", e.getMessage()));
            return isAlertPresent;
        }
        log.info("success, alert no present on page");
        return true;
    }

    /**
     * This method is used to get text from pop-up windows
     *
     * @return alert text
     * @throws NoAlertPresentException If alert is not found on page
     */
    public String getAlertText() {
        String alertText;
        try {
            Alert alert = driverWrapper.switchTo().alert();
            alertText = alert.getText();
            alert.accept();
            log.info(format("alert text < %s >", alertText));
        } catch (NoAlertPresentException e) {
            alertText = "alert is not found";
            log.error(format("< %s > . NoAlertPresentException < %s >", alertText, e.getMessage()));
            e.printStackTrace();
        }
        return alertText;
    }

    public Alert getAlert() {
        try {
            return driverWrapper.switchTo().alert();
        } catch (NoAlertPresentException e) {
            // no alert to dismiss, so return null
            return null;
        }
    }

    /**
     * First method for refresh page
     */
    public void refreshPage() {
        driverWrapper.navigate().refresh();
        log.info(format("page < %s > refresh", driverWrapper.getCurrentUrl()));
    }

    /**
     * Wait the element on page specified time
     *
     * @param elementLocator search element locator which is not visible
     * @param timeoutSeconds the timeout in seconds when an expectation is called
     * @throws NoSuchElementException If the locator cannot found
     */
    public void waitElementNotVisible(String elementLocator, int timeoutSeconds) throws NoSuchElementException {
        WebDriverWait webDriverWait = new WebDriverWait(driverWrapper, timeoutSeconds);
        webDriverWait.until(ExpectedConditions.invisibilityOfElementLocated(config.getLocator(elementLocator)));
    }

    /**
     * An expectation for checking that an element is present on the DOM of a page and visible.
     * Visibility means that the element is not only displayed but also has a height and width
     * that is greater than 0.
     * Advantages of this method over isUserLogIn(By elementLocator);
     * is that it expects the appearance of an element.
     *
     * @param elementLocator search element locator
     * @return true If element is present,otherwise false
     * @throws NoSuchElementException If the locator cannot found
     */
    public boolean waitForElementPresent(String elementLocator) throws NoSuchElementException {
        if (elementLocator != null) {
            driverWait.until(ExpectedConditions.
                    visibilityOfElementLocated(config.getLocator(elementLocator)));
            log.info(format("wait for element < %s > present", elementLocator));
            return true;
        } else {
            log.info(format("waiting for the appearance of the element < %s > was not successful, " +
                    "wait for element < %s > present", null, null));
            return false;
        }
    }

    /**
     * An expectation for checking an element is visible and enabled such that you
     * can click it.
     *
     * @param elementLocator used to find the element
     * @return true If the WebElement once it is located and clickable (visible and enabled), otherwise false
     * @throws IOException If the locator cannot found
     */
    public boolean waitElementToBeClickable(String elementLocator) throws NoSuchElementException {
        if (driverWait.until(ExpectedConditions.
                elementToBeSelected(config.getLocator(elementLocator)))) {
            driverWait.until(ExpectedConditions.
                    elementToBeClickable(config.getLocator(elementLocator)));
            log.info(format("wait element < %s > to be clickable", elementLocator));
            return true;
        }
        log.info(format("wait element < %s > not to be clickable", elementLocator));
        return false;
    }

    /**
     * This method is used to wait for getting response from all Ajax requests
     *
     * @param timeoutSeconds the timeout in seconds when an expectation is called
     * @return true If {@param driverWrapper} instanceof {@link JavascriptExecutor},otherwise false
     */
    public boolean waitForAjaxResponse(int timeoutSeconds) {
        if (driverWrapper instanceof JavascriptExecutor) {
            JavascriptExecutor jsDriver = (JavascriptExecutor) driverWrapper;
            for (int i = 0; i < timeoutSeconds; i++) {
                Long numberOfConnections = (Long) jsDriver.executeScript("return jQuery.active");
                if (numberOfConnections != null) {
                    log.debug(format("number of active jQuery Ajax calls is < %d >", numberOfConnections));
                    if (numberOfConnections == 0) {
                        break;
                    }
                }
            }
            return true;
        } else {
            log.info(format("web elements actions driverWrapper: < %s > can't execute JavaScript", driverWrapper));
            return false;
        }
    }

    /**
     * This method return a list of elements
     *
     * @param elementLocator search element locator
     * @return elements {@link List<WebElement>} driverWrapper find elements from
     * configuration {@link WebElementsActions#config}
     * @throws NoSuchElementException If the locator cannot found
     */
    public List<WebElement> getElements(String elementLocator) throws NoSuchElementException {
        log.info(format("get elements < %s >", elementLocator));
        return driverWrapper.findElements(config.getLocator(elementLocator));
    }

    /**
     * Press a button TAB {@info is recommended to enter a single value in
     * {@link WebElementsActions#pressTAB(String)}
     *
     * @param locator search locator for press button {@link Keys#TAB}
     * @throws ElementNoSuch If the locator cannot found
     */
    public void pressTAB(String locator) throws NoSuchElementException {
        WebElement webElement = driverWrapper.findElement(config.getLocator(String.valueOf(locator)));
        webElement.sendKeys(Keys.TAB);
        log.info("press TAB");
    }

    /**
     * Press a button Space
     *
     * @param locator press the space on the locator
     * @see {@link Keys#SPACE}
     */
    public void pressSpace(String locator) throws NoSuchElementException {
        WebElement webElement = driverWrapper.findElement(config.getLocator(locator));
        webElement.sendKeys(Keys.SPACE);
        log.info("press space");
    }

    /**
     * Scroll a window in down
     *
     * @see {@link JavascriptExecutor} and {@link JavascriptExecutor#executeScript(String, Object...)}
     */
    public void windowScrollDown() {
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driverWrapper.getOriginalDriver();
        // Vertical scroll - down by 200  pixels
        javascriptExecutor.executeScript("window.scrollBy(0,200)", "");
    }

    /**
     * Scroll a window in up
     *
     * @see {@link JavascriptExecutor} and {@link JavascriptExecutor#executeScript(String, Object...)}
     */
    public void windowScrollUp() {
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driverWrapper.getOriginalDriver();
        // Vertical scroll - up by -200  pixels
        javascriptExecutor.executeScript("window.scrollBy(0,-200)", "");
    }

}