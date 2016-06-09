package com.toroption.pre.tests;


import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.PropertyLoader;

public class AccountPage extends Fixture{
    private static final String EMAIL = PropertyLoader.loadProperty("user.EMAIL");
    private static final String PASS = PropertyLoader.loadProperty("user.PASS");
    private static final String PHONE = PropertyLoader.loadProperty("editPhone");

    @Test(priority = 1)
    public void PersonalInfo() throws InterruptedException {
        toroption.mainPage.openPage();
        toroption.mainPage.clickAndInputLoginField(EMAIL);
        toroption.mainPage.clickAndInputPassField(PASS);
        toroption.mainPage.clickLoginButton();
        Assert.assertTrue(toroption.mainPage.isUserLogIn());
        toroption.mainPage.clickMyAccount();
        Assert.assertEquals(driverWrapper.findElement(By.xpath(".//*[@id='personal_information_email']")).getAttribute("value"), "gyfgtghy@yomail.info");
        Assert.assertEquals(driverWrapper.findElement(By.xpath(".//*[@id='personal_information_firstName']")).getAttribute("value"), "testFirstName");
        Assert.assertEquals(driverWrapper.findElement(By.xpath(".//*[@id='personal_information_lastName']")).getAttribute("value"), "testLastName");
        toroption.openAccount.clickAndEditPhone(PHONE);
        toroption.openAccount.clickUpdateDetails();
        Assert.assertTrue(toroption.contactUS.isAlertPresent());
        toroption.openAccount.closeAlert();
        Assert.assertEquals(driverWrapper.findElement(By.xpath(".//*[@id='personal_information_phone']")).getAttribute("value"), PHONE);
    }
//    /**
//     * Further methods are not actual, because not possible test functions
//     */
//    @Test(priority = 2)
//    public void bankingHistory() throws InterruptedException {
//        toroption.openAccount.bankingHistory();
//        Assert.assertTrue(toroption.openAccount.bankingHistoryIsDisplayed());
//    }
//    @Test(priority = 3)
//    public void withdrawal() throws InterruptedException {
//        toroption.openAccount.withdrawal();
//        Assert.assertTrue(toroption.openAccount.withdrawalIsDisplayed());
//    }
//    @Test(priority = 4)
//    public void positions() throws InterruptedException {
//        toroption.openAccount.positions();
//        Assert.assertTrue(toroption.openAccount.positionsIsDisplayed());
//    }
}
