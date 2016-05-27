package com.toroption.pre.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import utils.PropertyLoader;

public class RegistrationEmailWhichUsed extends Fixture{
    public static final String NAME = PropertyLoader.loadProperty("firstName");
    public static final String SURNAME = PropertyLoader.loadProperty("lastName");
    public static final String PHONE = PropertyLoader.loadProperty("phone");
    public static final String PASS = PropertyLoader.loadProperty("user.PASS");
    public static final String CAPTCHA = PropertyLoader.loadProperty("captcha");
    public static final String EMAIL = PropertyLoader.loadProperty("email");


    @Test(priority = 1)
    /**
     * The filling lead form, with email which was used earlier
     */
    public void fillLeadForm() {
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

}
