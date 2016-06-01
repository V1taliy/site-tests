package com.toroption.pre.tests;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import utils.PropertyLoader;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class CreateLeadFromMainPageAndRegistration extends Fixture {

    private static final String NAME = PropertyLoader.loadProperty("firstName");
    private static final String SURNAME = PropertyLoader.loadProperty("lastName");
    private static final String PHONE = PropertyLoader.loadProperty("phone");
    private static final String PASS = PropertyLoader.loadProperty("user.PASS");
    private static final String CAPTCHA = PropertyLoader.loadProperty("captcha");



    @Test (priority = 1)
    public void fillLeadForm() {
        WebDriver driverWrapper2 = new FirefoxDriver();
        /**
         * Generate random email
         */
        driverWrapper2.get("https://dropmail.me");
        driverWrapper2.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement emailField = driverWrapper2.findElement(By.xpath(".//div[2]/div[2]/div[1]/h2"));
        String mail = emailField.getText();
        driverWrapper2.close();

        /**
         * The filling lead form and the checking transmitted data from lead
         */
        toroption.mainPage.clickAndInputFirstName(NAME);
        toroption.mainPage.clickAndInputLastName(SURNAME);
        toroption.mainPage.clickAndInputEmail(mail);
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
        toroption.mainPage.refreshPage();
    }
}
