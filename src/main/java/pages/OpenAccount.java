package pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
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

    public boolean errorForm() {
        if(web.waitForElementPresent("alertMailError")) {
            return true;
        }else {
            return false;
        }
    }
}
