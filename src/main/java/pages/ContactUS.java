package pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.*;
import utils.WebDriverWrapper;

public class ContactUS extends AbstractPage {
    private static final Logger log = Logger.getLogger(MainPage.class);

    public ContactUS(WebDriverWrapper driverWrapper) {
        super(driverWrapper);
    }
    public void clickContactUs() {
        web.moveToElementAndClick("contactUs", "contactUs");
    }

    public void inputFullName() {
        web.clearAndInput("contactUsFullName","Test Full Name" );
    }

    public void inputPhone() {
        web.clearAndInput("contactUsPhone", "1234567890");
    }
    public void inputEmail() {
        web.clearAndInput("contactUsEmail", "hbjuxhqu@10mail.org");
    }
    public void inputSubject() {
        web.clearAndInput("contactUsSubject", "Test Subject");
    }
    public void inputMessage() {
        web.clearAndInput("contactUsMessage", "Test Message");
    }

    public void clickSubmitBtn () {
        web.windowScrollDown();
        web.clickButton("SubmitBtn");
    }

    public boolean isContactUsPresent() {

        if (web.isElementPresent("contactUsInfo")) {
            return true;
        }else {
            return false;
        }
    }
    public boolean isRegisterFormPresent() {

        if (web.isElementPresent("registerForm")) {
            return true;
        }else {
            return false;
        }
    }

    public boolean isAlertPresent() throws NoSuchElementException {
        WebElement alertSuccess = driverWrapper.findElement(By.xpath(".//div[2][@id='error-form']/h3[contains(.,'Success')]"));
       if (alertSuccess.isDisplayed()) {
           log.info(String.format("Pop-up 'Success' not present on page."));
           return false;
       }else {
           log.info(String.format("Pop-up 'Success' is present on page."));
           return true;
       }
    }

}

