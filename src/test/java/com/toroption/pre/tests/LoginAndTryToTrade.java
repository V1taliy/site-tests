package com.toroption.pre.tests;


import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import utils.PropertyLoader;
import utils.ScreenShot;

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
        toroption.mainPage.isTradeSpotPresent();
        toroption.mainPage.clickAndInputLoginField(EMAIL);
        toroption.mainPage.clickAndInputPassField(PASS);
        toroption.mainPage.clickLoginButton();
        Assert.assertTrue(toroption.mainPage.isUserLogIn());
        Assert.assertTrue(toroption.mainPage.isTradeSpotForLoggedInUserPresent());
    }
    @Test(priority = 2)
    public void tryToTrade() {
        toroption.mainPage.pushCallBtn();
        toroption.mainPage.pushApplyBtn();
        Assert.assertTrue(toroption.mainPage.isTradeSpotForLoggedInUserPresent());

    }

    @AfterMethod
    public void takeScreenShotOnFailure(ITestResult testResult) throws IOException {
        if (testResult.getStatus() == ITestResult.FAILURE) {
            System.out.println(testResult.getStatus());
            ScreenShot.quicklyScreenShot(driverWrapper, DEFAULT_FILE_PATH, DEFAULT_FILE_NAME, DEFAULT_FILE_FORMAT);
        }
    }
}
