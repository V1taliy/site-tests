package com.toroption.pre.tests;


import org.testng.Assert;
import org.testng.annotations.Test;

public class InnerMenu extends Fixture {

    @Test(priority = 1)
    public void economicCalendar() throws InterruptedException {
        toroption.economicCalendar.clickEconomicCalendar();
        Assert.assertTrue(toroption.economicCalendar.isEconomicCalendarDisplayed());
        Assert.assertEquals(driverWrapper.getTitle(), "Economic calendar");
        toroption.contactUS.popup();
    }
    @Test(priority = 2)
    public void assetIndex() {
        toroption.assetIndex.clickAssetIndex();
        Assert.assertTrue(toroption.assetIndex.isAssetIndexSpotPresent());
        Assert.assertEquals(driverWrapper.getTitle(), "Asset Index");
    }

    @Test(priority = 3)
    public void contactUsRegFormMin() throws InterruptedException {
        toroption.contactUS.clickContactUs();
        Assert.assertEquals(driverWrapper.getTitle(), "Contact Us");
        Assert.assertTrue(toroption.contactUS.isContactUsPresent());
        Assert.assertTrue(toroption.contactUS.isRegisterFormPresent());
        toroption.contactUS.inputFullName();
        toroption.contactUS.inputPhone();
        toroption.contactUS.inputEmail();
        toroption.contactUS.inputSubject();
        toroption.contactUS.inputMessage();
        toroption.contactUS.clickSubmitBtn();
        Assert.assertTrue(toroption.contactUS.isAlertPresent());
    }
}
