package pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import utils.WebDriverWrapper;


public class OpenAccount extends AbstractPage {

    private static final Logger log = Logger.getLogger(OpenAccount.class);
    public OpenAccount(WebDriverWrapper driverWrapper){
        super(driverWrapper);
    }

    public void clickAndInputPassField(String passwordData) {
        try {
            web.clickElement("openAccountPassField");
            isBeCleaned("openAccountPassField");
            web.input("openAccountPassField", passwordData);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }
    }
    public void clickAndInputPassVerificationField(String passwordData) {
        try {
            web.clickElement("openAccountPassVerificationField");
            isBeCleaned("openAccountPassVerificationField");
            web.input("openAccountPassVerificationField", passwordData);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }
    }

    public void clickAndInputCaptchaField(String captchaData) {
        try {
            web.clickElement("captchaField");
            isBeCleaned("captchaField");
            web.input("captchaField", captchaData);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }
    }

    public void clickLoginButton() {
        try {
            web.clickElement("registrationButton");
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            log.error(String.format("EXCEPTION < %s >", e.getStackTrace()));
        }
    }
    private void isBeCleaned(String clearLocator) {
        try {
            if (!clearLocator.isEmpty()) {
                web.clear(clearLocator);
            }
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }
    }
    public boolean isAlertPresent() throws NoSuchElementException {
        WebElement alertSuccess = driverWrapper.findElement(By.xpath(".//div[2][@id='error-form']/p/div"));
        if (alertSuccess.isDisplayed()) {
            log.info(String.format("Pop-up 'Error' not present on page."));
            return false;
        }else {
            log.info(String.format("Pop-up 'Error' is present on page."));
            return true;
        }
    }
    public void clickAndEditPhone(String phoneData) {
        try {
            web.clickElement("personalInfoPhone");
            isBeCleaned("personalInfoPhone");
            web.input("personalInfoPhone", phoneData);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }
    }
    public void clickUpdateDetails() {
        web.clickButton("updateDetailsBtn");
    }

    public void closeAlert() {
        web.clickElement("closeAlert");
    }
    public void bankingHistory() {
        web.waitElementToBeClickable("bankingHistoryBtn");
        web.clickElement("bankingHistoryBtn");
        web.waitForElementPresent("bankingHistoryInfo");
    }
    public boolean bankingHistoryIsDisplayed() {
        if (web.isElementPresent("bankingHistoryInfo")) {
            return true;
        }else {
            return false;
        }
    }
    public void withdrawal() {
        web.waitElementToBeClickable("withdrawalBtn");
        web.clickElement("withdrawalBtn");
        web.waitForElementPresent("withdrawalInfo");
    }
    public boolean withdrawalIsDisplayed() {
        if (web.isElementPresent("withdrawalInfo")) {
            return true;
        }else {
            return false;
        }
    }
    public void positions() {
        web.waitElementToBeClickable("positionsBtn");
        web.clickElement("positionsBtn");
        web.waitForElementPresent("positionsInfo");
    }
    public boolean positionsIsDisplayed() {
        if (web.isElementPresent("positionsInfo")) {
            return true;
        }else {
            return false;
        }
    }

}
