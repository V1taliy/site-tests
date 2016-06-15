package com.toroption.pre.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import utils.PropertyLoader;

public class LoginAndTryToTrade extends Fixture {

    private static final String EMAIL = PropertyLoader.loadProperty("user.EMAIL");
    private static final String PASS = PropertyLoader.loadProperty("user.PASS");

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
    public void tryToTrade() throws InterruptedException {
        Thread.sleep(3000);
        toroption.mainPage.pushCallBtn();
        Thread.sleep(3000);
        toroption.mainPage.pushApplyBtn();
        Assert.assertTrue(toroption.mainPage.isTradeSpotForLoggedInUserPresent());
        toroption.mainPage.logout();

    }
}
