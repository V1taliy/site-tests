package com.toroption.pre.tests;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import utils.PropertyLoader;
import utils.ScreenShot;

import java.io.IOException;

public class RegistrationEmailWhichUsed extends Fixture{
    private static final String NAME = PropertyLoader.loadProperty("firstName");
    private static final String SURNAME = PropertyLoader.loadProperty("lastName");
    private static final String PHONE = PropertyLoader.loadProperty("phone");
    private static final String PASS = PropertyLoader.loadProperty("user.PASS");
    private static final String CAPTCHA = PropertyLoader.loadProperty("captcha");
    private static final String EMAIL = PropertyLoader.loadProperty("email");
    private static final String DEFAULT_FILE_PATH = PropertyLoader.loadProperty("screenshot.folder");
    private static final String DEFAULT_FILE_NAME = PropertyLoader.loadProperty("screenshot.name");
    private static final String DEFAULT_FILE_FORMAT = PropertyLoader.loadProperty("screenshot.format");


    @Test(priority = 1)
    /**
     * The filling lead form, with email which was used earlier
     */
    public void fillLeadForm() {
        toroption.mainPage.openPage();
        toroption.mainPage.refreshPage();
        toroption.mainPage.clickAndInputFirstName(NAME);
        toroption.mainPage.clickAndInputLastName(SURNAME);
        toroption.mainPage.clickAndInputEmail(EMAIL);
        toroption.mainPage.clickAndInputPhone(PHONE);
        toroption.mainPage.clickJoinButton();
        Assert.assertTrue(toroption.mainPage.isOpenAccountFormPresent());
    }

    @Test(priority = 2)
    /**
     * Check alert with needed message
     */
    public void fillOpenAccountForm() {
        toroption.openAccount.clickAndInputPassField(PASS);
        toroption.openAccount.clickAndInputPassVerificationField(PASS);
        toroption.openAccount.clickAndInputCaptchaField(CAPTCHA);
        toroption.openAccount.clickLoginButton();
        Assert.assertTrue(toroption.openAccount.errorForm());
    }

    @AfterMethod
    public void takeScreenShotOnFailure(ITestResult testResult) throws IOException {
        if (testResult.getStatus() == ITestResult.FAILURE) {
            System.out.println(testResult.getStatus());
            ScreenShot.quicklyScreenShot(driverWrapper, DEFAULT_FILE_PATH, DEFAULT_FILE_NAME, DEFAULT_FILE_FORMAT);
        }
    }
}
