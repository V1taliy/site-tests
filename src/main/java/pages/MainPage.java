package pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import utils.PropertyLoader;
import utils.WebDriverWrapper;

public class MainPage extends AbstractPage {

    private static final Logger log = Logger.getLogger(MainPage.class);
    private static final String MAIN_PAGE = PropertyLoader.loadProperty("site.url");


    public MainPage(WebDriverWrapper driverWrapper) {
        super(driverWrapper, MAIN_PAGE);
        openPage();
    }

    /**
     * Click on login field, if necessary, clear the field and input login data
     */
    public void clickAndInputLoginField(String loginData) {
        try {
            web.clickElement("loginFieldInput");
            isBeCleaned("loginFieldInput");
            web.input("loginFieldInput", loginData);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }
    }



    public void clickAndInputFirstName(String firstNameData) {
        try {
            web.clickElement("firstNameFieldInput");
            isBeCleaned("firstNameFieldInput");
            web.input("firstNameFieldInput", firstNameData);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }
    }
    public void clickAndInputLastName(String lastNameData) {
        try {
            web.clickElement("lastNameFieldInput");
            isBeCleaned("lastNameFieldInput");
            web.input("lastNameFieldInput", lastNameData);

        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }
    }
    public void clickAndInputEmail(String mail) {
        try {
            web.clickElement("emailFieldInput");
            isBeCleaned("emailFieldInput");
            web.input("emailFieldInput", mail);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }
    }

    public void clickAndInputPhone(String phoneData) {
        try {
            web.clickElement("phoneFieldInput");
            isBeCleaned("phoneFieldInput");
            web.input("phoneFieldInput", phoneData);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }
    }

    public void clickJoinButton() {
        try {
            web.clickElement("joinBtn");
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            log.error(String.format("EXCEPTION < %s >", e.getStackTrace()));
        }
    }
    public boolean isOpenAccountFormPresent() {
        if (web.isElementPresent("openAccountForm")) {
            return true;
        } else {
            return false;
        }
    }



    /**
     * Click on search element locator and input {@param passwordData} in password field
     *
     * @param passwordData password
     * @throws NoSuchElementException {@link utils.WebElementsActions}
     */
    public void clickAndInputPassField(String passwordData) {
        try {
            web.clickElement("passFieldInput");
            isBeCleaned("passFieldInput");
            web.input("passFieldInput", passwordData);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }
    }
    /**
     * Click on login button
     *
     * @throws NoSuchElementException {@link utils.WebElementsActions}
     */
    public void clickLoginButton() {
        try {
            web.clickElement("loginButton");
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            log.error(String.format("EXCEPTION < %s >", e.getStackTrace()));
        }
    }
    public boolean isUserLogIn() {
        if (web.isElementPresent("userIsLogIn")) {
            log.info(String.format("user success input."));
            return true;
        } else {
            return false;
        }
    }
    /**
     * Private method for the purification of the input field, if text present in the field
     *
     * @param clearLocator search locator for clear
     * @throws NoSuchElementException IOException {@link utils.WebElementsActions}
     */
    private void isBeCleaned(String clearLocator) {
        try {
            if (!clearLocator.isEmpty()) {
                web.clear(clearLocator);
            }
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }
    }
    /**
     * Method for checking trade spot
     */
    public boolean isTradeSpotPresent() {
        web.moveToElement("tradePlatform");
        if (web.isElementPresent("tradePlatform")) {
            return true;
        }else {
            return false;
        }
    }
    public boolean isTradeSpotForLoggedInUserPresent() {
        web.moveToElement("tradePlatformForLoggedInUser");
        if (web.waitForElementPresent("tradePlatformForLoggedInUser")) {
            return true;
        }else {
            return false;
        }
    }

    public void pushCallBtn() {
        web.clickButton("callBtn");
    }

    public void logout() {
        web.moveToElementAndClick("showProfileInfo", "showProfileInfo");
        web.clickButton("logoutBtn");
    }

    public void pushApplyBtn() {
        web.clickButton("applyBtn");
    }

    public void refreshPage() {
        web.refreshPage();
    }
    public void chooseCountry() {
        web.clickElement("chooseCountry");
        web.clickElement("turkmenistan");
    }
}
