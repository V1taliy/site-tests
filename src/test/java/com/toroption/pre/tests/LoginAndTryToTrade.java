package com.toroption.pre.tests;


import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import utils.PropertyLoader;

import java.io.IOException;

public class LoginAndTryToTrade extends Fixture {

    private static final String EMAIL = PropertyLoader.loadProperty("user.EMAIL");
    private static final String PASS = PropertyLoader.loadProperty("user.PASS");
    private static final String DEFAULT_FILE_PATH = PropertyLoader.loadProperty("screenshot.folder");
    private static final String DEFAULT_FILE_NAME = PropertyLoader.loadProperty("screenshot.name");
    private static final String DEFAULT_FILE_FORMAT = PropertyLoader.loadProperty("screenshot.format");

    @Test(priority = 1)
    public void logIn() {
        toroption.mainPage.openPage();
        toroption.mainPage.refreshPage();
        toroption.mainPage.isTradeSpotPresent();
        toroption.mainPage.clickAndInputLoginField(EMAIL);
        toroption.mainPage.clickAndInputPassField(PASS);
        toroption.mainPage.clickLoginButton();
        Assert.assertTrue(toroption.mainPage.isUserLogIn());
        Assert.assertTrue(toroption.mainPage.isTradeSpotForLoggedInUserPresent());
    }
    @Test(priority = 2)
    public void tryToTrade() throws InterruptedException {
        Thread.sleep(3000);
        toroption.mainPage.pushCallBtn();
        Thread.sleep(3000);
        toroption.mainPage.pushApplyBtn();
        Assert.assertTrue(toroption.mainPage.isTradeSpotForLoggedInUserPresent());

    }
}
