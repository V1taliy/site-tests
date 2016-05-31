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
import utils.ScreenShot;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class CreateLeadFromMainPageAndRegistration extends Fixture {

    private static final String NAME = PropertyLoader.loadProperty("firstName");
    private static final String SURNAME = PropertyLoader.loadProperty("lastName");
    private static final String PHONE = PropertyLoader.loadProperty("phone");
    private static final String PASS = PropertyLoader.loadProperty("user.PASS");
    private static final String CAPTCHA = PropertyLoader.loadProperty("captcha");
    private static final String DEFAULT_FILE_PATH = PropertyLoader.loadProperty("screenshot.folder");
    private static final String DEFAULT_FILE_NAME = PropertyLoader.loadProperty("screenshot.name");
    private static final String DEFAULT_FILE_FORMAT = PropertyLoader.loadProperty("screenshot.format");


    WebDriver driver = new FirefoxDriver();

    @Test (priority = 1)
    public void fillLeadForm() {

        /**
         * Generate random email
         */
        driver.get("https://dropmail.me");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement emeilField = driver.findElement(By.xpath(".//div[2]/div[2]/div[1]/h2"));
        String mail = emeilField.getText();
        driver.close();

        /**
         * The filling lead form and the checking transmitted data from lead
         */
        toroption.mainPage.clickAndInputFirstName(NAME);
        toroption.mainPage.clickAndInputLastName(SURNAME);
        toroption.mainPage.clickAndInputEmail(mail);
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
    @AfterMethod
    public void takeScreenShotOnFailure(ITestResult testResult) throws IOException {
        if (testResult.getStatus() == ITestResult.FAILURE) {
            System.out.println(testResult.getStatus());
            ScreenShot.quicklyScreenShot(driverWrapper, DEFAULT_FILE_PATH, DEFAULT_FILE_NAME, DEFAULT_FILE_FORMAT);
        }
    }
}
