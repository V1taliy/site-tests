package com.toroption.pre.tests;


import org.testng.Assert;
import org.testng.annotations.Test;

public class Mobile extends Fixture{

    @Test(priority = 1)
    public void miniAccount () {
        toroption.accountTypes.clickAccountTypesMob();
        Assert.assertTrue(toroption.accountTypes.isMiniAccContentPresent());
    }
    @Test(priority = 2)
    public void standardAccount() {
        toroption.accountTypes.clickStandardAccount();
        Assert.assertTrue(toroption.accountTypes.isStandardAccContentPresent());
    }
    @Test(priority = 3)
    public void executiveAccount() {
        toroption.accountTypes.clickExecutiveAccount();
        Assert.assertTrue(toroption.accountTypes.isExecutiveAccContentPresent());
    }
    @Test(priority = 4)
    public void vipAccount() {
        toroption.accountTypes.clickVipAccount();
        Assert.assertTrue(toroption.accountTypes.isVipAccContentPresent());
    }
}
