package com.toroption.pre.tests;


import org.testng.Assert;
import org.testng.annotations.Test;
import utils.PropertyLoader;

public class CreateLeadFromMainPageAndRegistration extends Fixture {

    private static final String NAME = PropertyLoader.loadProperty("firstName");
    private static final String SURNAME = PropertyLoader.loadProperty("lastName");
    private static final String PHONE = PropertyLoader.loadProperty("phone");
    private static final String PASS = PropertyLoader.loadProperty("user.PASS");
    private static final String CAPTCHA = PropertyLoader.loadProperty("captcha");




    @Test (priority = 1)
    public void fillLeadForm() {
        String EMAIL = toroption.mainPage.emailGenerate();
        toroption.mainPage.clickAndInputFirstName(NAME);
        toroption.mainPage.clickAndInputLastName(SURNAME);
        toroption.mainPage.clickAndInputEmail(EMAIL);
        toroption.mainPage.chooseCountry();
        toroption.mainPage.clickAndInputPhone(PHONE);
        toroption.mainPage.clickJoinButton();
        Assert.assertTrue(toroption.mainPage.isOpenAccountFormPresent());

    }

    @Test(priority = 2)
    /**
     * The filling of remaining fields and registration new user
     */
    public void fillOpenAccountForm() {
        toroption.openAccount.clickAndInputPassField(PASS);
        toroption.openAccount.clickAndInputPassVerificationField(PASS);
        toroption.openAccount.clickAndInputCaptchaField(CAPTCHA);
        toroption.openAccount.clickLoginButton();
        Assert.assertTrue(toroption.mainPage.isUserLogIn());
        toroption.mainPage.logout();
    }
}
