package com.toroption.pre.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import utils.PropertyLoader;

public class EducationMTE extends Fixture{

    private static final String EMAIL = PropertyLoader.loadProperty("user.EMAIL");
    private static final String PASS = PropertyLoader.loadProperty("user.PASS");

    @Test(priority = 1)
    public void MTE() {
        toroption.mte.clickMTE();
        Assert.assertTrue(toroption.mte.isMTEContentPresent());
    }
    @Test(priority = 2)
    public void INTRODUCTION_VIDEO() {
        toroption.mte.click_INTRODUCTION_VIDEO();
        Assert.assertTrue(toroption.mte.is_INTRODUCTION_VIDEO_Present());
        Assert.assertTrue(toroption.mte.is_INTRODUCTION_VIDEO_FOR_BEGGINERS_1_Present());
        Assert.assertTrue(toroption.mte.is_INTRODUCTION_VIDEO_FOR_BEGGINERS_2_LOCK());
        Assert.assertTrue(toroption.mte.is_INTRODUCTION_VIDEO_FOR_BEGGINERS_3_LOCK());
        Assert.assertTrue(toroption.mte.is_INTRODUCTION_VIDEO_FOR_BEGGINERS_4_LOCK());
        Assert.assertTrue(toroption.mte.is_INTRODUCTION_VIDEO_FOR_BEGGINERS_5_LOCK());
        Assert.assertTrue(toroption.mte.is_INTRODUCTION_VIDEO_FOR_BEGGINERS_6_LOCK());
        Assert.assertTrue(toroption.mte.is_INTRODUCTION_VIDEO_FOR_BEGGINERS_7_LOCK());
        toroption.mte.clickAdvancedBtn();
        Assert.assertTrue(toroption.mte.is_INTRODUCTION_VIDEO_FOR_ADVANCED_1_LOCK());
        Assert.assertTrue(toroption.mte.is_INTRODUCTION_VIDEO_FOR_ADVANCED_2_LOCK());
        Assert.assertTrue(toroption.mte.is_INTRODUCTION_VIDEO_FOR_ADVANCED_3_LOCK());
        Assert.assertTrue(toroption.mte.is_INTRODUCTION_VIDEO_FOR_ADVANCED_4_LOCK());
        Assert.assertTrue(toroption.mte.is_INTRODUCTION_VIDEO_FOR_ADVANCED_5_LOCK());
        Assert.assertTrue(toroption.mte.is_INTRODUCTION_VIDEO_FOR_ADVANCED_6_LOCK());
        Assert.assertTrue(toroption.mte.is_INTRODUCTION_VIDEO_FOR_ADVANCED_7_LOCK());
        Assert.assertTrue(toroption.mte.is_INTRODUCTION_VIDEO_FOR_ADVANCED_8_LOCK());
        toroption.mte.clickBackBtn();
        Assert.assertTrue(toroption.mte.isMTEContentPresent());
    }
    @Test(priority = 3)
    public void IN_DEPTH_COURSE() {
        toroption.mte.click_IN_DEPTH_COURSE();
        Assert.assertTrue(toroption.mte.is_IN_DEPTH_COURSE_1_Present());
        Assert.assertTrue(toroption.mte.is_IN_DEPTH_COURSE_2_LOCK());
        Assert.assertTrue(toroption.mte.is_IN_DEPTH_COURSE_3_LOCK());
        Assert.assertTrue(toroption.mte.is_IN_DEPTH_COURSE_4_LOCK());
        toroption.mte.clickBackBtn();
        Assert.assertTrue(toroption.mte.isMTEContentPresent());
    }
    @Test(priority = 4)
    public void ADVANCED_IN_DEPTH_COURSE() {
        toroption.mte.click_ADVANCED_IN_DEPTH_COURSE();
        Assert.assertTrue(toroption.mte.is_ADVANCED_IN_DEPTH_COURSE_1_Present());
        Assert.assertTrue(toroption.mte.is_ADVANCED_IN_DEPTH_COURSE_2_LOCK());
        Assert.assertTrue(toroption.mte.is_ADVANCED_IN_DEPTH_COURSE_3_LOCK());
        toroption.mte.clickBackBtn();
        Assert.assertTrue(toroption.mte.isMTEContentPresent());
    }
    @Test(priority = 5)
    public void BINARY_STRATEGIES() {
        toroption.mte.click_BINARY_STRATEGIES();
        Assert.assertTrue(toroption.mte.is_BINARY_STRATEGY_1_Present());
        Assert.assertTrue(toroption.mte.is_BINARY_STRATEGY_2_LOCK());
        Assert.assertTrue(toroption.mte.is_BINARY_STRATEGY_3_LOCK());
        Assert.assertTrue(toroption.mte.is_BINARY_STRATEGY_4_LOCK());
        Assert.assertTrue(toroption.mte.is_BINARY_STRATEGY_5_LOCK());
        Assert.assertTrue(toroption.mte.is_BINARY_STRATEGY_6_LOCK());
        Assert.assertTrue(toroption.mte.is_BINARY_STRATEGY_7_LOCK());
        Assert.assertTrue(toroption.mte.is_BINARY_STRATEGY_8_LOCK());
        Assert.assertTrue(toroption.mte.is_BINARY_STRATEGY_9_LOCK());
        toroption.mte.clickBackBtn();
        Assert.assertTrue(toroption.mte.isMTEContentPresent());
    }
    @Test(priority = 6)
    public void ECONOMICS() {
        toroption.mte.click_ECONOMICS();
        Assert.assertTrue(toroption.mte.is_ECONOMICS_CONTENT_1_Present());
        Assert.assertTrue(toroption.mte.is_ECONOMICS_CONTENT_2_LOCK());
        Assert.assertTrue(toroption.mte.is_ECONOMICS_CONTENT_3_LOCK());
        Assert.assertTrue(toroption.mte.is_ECONOMICS_CONTENT_4_LOCK());
        Assert.assertTrue(toroption.mte.is_ECONOMICS_CONTENT_5_LOCK());
        Assert.assertTrue(toroption.mte.is_ECONOMICS_CONTENT_6_LOCK());
        toroption.mte.clickBackBtn();
        Assert.assertTrue(toroption.mte.isMTEContentPresent());
    }
    @Test(priority = 7)
    public void PLATFORM_TUTORIALS() {
        toroption.mte.click_PLATFORM_TUTORIALS();
        Assert.assertTrue(toroption.mte.is_PLATFORM_TUTORIALS_INTRODUCTION_1_Present());
        Assert.assertTrue(toroption.mte.is_PLATFORM_TUTORIALS_INTRODUCTION_2_LOCK());
        Assert.assertTrue(toroption.mte.is_PLATFORM_TUTORIALS_INTRODUCTION_3_LOCK());
        Assert.assertTrue(toroption.mte.is_PLATFORM_TUTORIALS_INTRODUCTION_4_LOCK());
        Assert.assertTrue(toroption.mte.is_PLATFORM_TUTORIALS_INTRODUCTION_5_LOCK());
        Assert.assertTrue(toroption.mte.is_PLATFORM_TUTORIALS_INTRODUCTION_6_LOCK());
        toroption.mte.clickPlatformTutorialsProductsBtn();
        Assert.assertTrue(toroption.mte.is_PLATFORM_TUTORIALS_PRODUCTS_1_LOCK());
        Assert.assertTrue(toroption.mte.is_PLATFORM_TUTORIALS_PRODUCTS_2_LOCK());
        Assert.assertTrue(toroption.mte.is_PLATFORM_TUTORIALS_PRODUCTS_3_LOCK());
        Assert.assertTrue(toroption.mte.is_PLATFORM_TUTORIALS_PRODUCTS_4_LOCK());
        Assert.assertTrue(toroption.mte.is_PLATFORM_TUTORIALS_PRODUCTS_5_LOCK());
        Assert.assertTrue(toroption.mte.is_PLATFORM_TUTORIALS_PRODUCTS_6_LOCK());
        Assert.assertTrue(toroption.mte.is_PLATFORM_TUTORIALS_PRODUCTS_7_LOCK());
        toroption.mte.clickPlatformTutorialsExecutingOrdersBtn();
        Assert.assertTrue(toroption.mte.is_PLATFORM_TUTORIALS_EXECUTING_ORDERS_1_LOCK());
        Assert.assertTrue(toroption.mte.is_PLATFORM_TUTORIALS_EXECUTING_ORDERS_2_LOCK());
        Assert.assertTrue(toroption.mte.is_PLATFORM_TUTORIALS_EXECUTING_ORDERS_3_LOCK());
        Assert.assertTrue(toroption.mte.is_PLATFORM_TUTORIALS_EXECUTING_ORDERS_4_LOCK());
        toroption.mte.clickBackBtn();
        Assert.assertTrue(toroption.mte.isMTEContentPresent());
    }
    @Test(priority = 8)
    public void BINARY_EBOOK() {
        toroption.mte.click_BINARY_EBOOK();
        /**
         * need methods for checking content
         * */
        toroption.mte.clickBackBtn();
    }
    @Test(priority = 9)
    public void ADVANCED_BINARY_EBOOK() {
        toroption.mte.click_ADVANCED_BINARY_EBOOK();
        /**
         * need methods for checking content
         * */
        toroption.mte.clickBackBtn();
    }
    @Test(priority = 10)
    public void PLATFORM_EBOOK() throws InterruptedException {
        toroption.mte.click_PLATFORM_EBOOK();
        /**
         * need methods for checking content
         * */
    }
    @Test(priority = 11)
    public void MTE_USER_LOGGED_IN() {
        toroption.mainPage.openPage();
        toroption.mainPage.clickAndInputLoginField(EMAIL);
        toroption.mainPage.clickAndInputPassField(PASS);
        toroption.mainPage.clickLoginButton();
        Assert.assertTrue(toroption.mainPage.isUserLogIn());
        toroption.mte.clickMTE();
        Assert.assertTrue(toroption.mte.isMTEContentPresent());
    }
    @Test(priority = 12)
    public void INTRODUCTION_VIDEO_USER_LOGGED_IN() throws InterruptedException {
        toroption.mte.click_INTRODUCTION_VIDEO();
        Assert.assertTrue(toroption.mte.is_INTRODUCTION_VIDEO_Present());
        Assert.assertTrue(toroption.mte.is_INTRODUCTION_VIDEO_FOR_BEGGINERS_1_Present());
        Assert.assertTrue(toroption.mte.is_INTRODUCTION_VIDEO_FOR_BEGGINERS_2_Present());
        Assert.assertTrue(toroption.mte.is_INTRODUCTION_VIDEO_FOR_BEGGINERS_3_Present());
        Assert.assertTrue(toroption.mte.is_INTRODUCTION_VIDEO_FOR_BEGGINERS_4_Present());
        Assert.assertTrue(toroption.mte.is_INTRODUCTION_VIDEO_FOR_BEGGINERS_5_Present());
        Assert.assertTrue(toroption.mte.is_INTRODUCTION_VIDEO_FOR_BEGGINERS_6_Present());
        Assert.assertTrue(toroption.mte.is_INTRODUCTION_VIDEO_FOR_BEGGINERS_7_Present());
        toroption.mte.clickAdvancedBtn();
        Assert.assertTrue(toroption.mte.is_INTRODUCTION_VIDEO_FOR_ADVANCED_1_Present());
        Assert.assertTrue(toroption.mte.is_INTRODUCTION_VIDEO_FOR_ADVANCED_2_Present());
        Assert.assertTrue(toroption.mte.is_INTRODUCTION_VIDEO_FOR_ADVANCED_3_Present());
        Assert.assertTrue(toroption.mte.is_INTRODUCTION_VIDEO_FOR_ADVANCED_4_Present());
        Assert.assertTrue(toroption.mte.is_INTRODUCTION_VIDEO_FOR_ADVANCED_5_Present());
        Assert.assertTrue(toroption.mte.is_INTRODUCTION_VIDEO_FOR_ADVANCED_6_Present());
        Assert.assertTrue(toroption.mte.is_INTRODUCTION_VIDEO_FOR_ADVANCED_7_Present());
        Assert.assertTrue(toroption.mte.is_INTRODUCTION_VIDEO_FOR_ADVANCED_8_Present());
        toroption.mte.clickBackBtn();
        Assert.assertTrue(toroption.mte.isMTEContentPresent());
    }
    @Test(priority = 13)
    public void IN_DEPTH_COURSE_USER_LOGGED_IN() {
        toroption.mte.click_IN_DEPTH_COURSE();
        Assert.assertTrue(toroption.mte.is_IN_DEPTH_COURSE_1_Present());
        Assert.assertTrue(toroption.mte.is_IN_DEPTH_COURSE_2_Present());
        Assert.assertTrue(toroption.mte.is_IN_DEPTH_COURSE_3_Present());
        Assert.assertTrue(toroption.mte.is_IN_DEPTH_COURSE_4_Present());
        toroption.mte.clickBackBtn();
        Assert.assertTrue(toroption.mte.isMTEContentPresent());
    }
    @Test(priority = 14)
    public void ADVANCED_IN_DEPTH_COURSE_USER_LOGGED_IN() {
        toroption.mte.click_ADVANCED_IN_DEPTH_COURSE();
        Assert.assertTrue(toroption.mte.is_ADVANCED_IN_DEPTH_COURSE_1_Present());
        Assert.assertTrue(toroption.mte.is_ADVANCED_IN_DEPTH_COURSE_2_Present());
        Assert.assertTrue(toroption.mte.is_ADVANCED_IN_DEPTH_COURSE_3_Present());
        toroption.mte.clickBackBtn();
        Assert.assertTrue(toroption.mte.isMTEContentPresent());
    }
    @Test(priority = 15)
    public void BINARY_STRATEGIES_USER_LOGGED_IN() {
        toroption.mte.click_BINARY_STRATEGIES();
        Assert.assertTrue(toroption.mte.is_BINARY_STRATEGY_1_Present());
        Assert.assertTrue(toroption.mte.is_BINARY_STRATEGY_2_Present());
        Assert.assertTrue(toroption.mte.is_BINARY_STRATEGY_3_Present());
        Assert.assertTrue(toroption.mte.is_BINARY_STRATEGY_4_Present());
        Assert.assertTrue(toroption.mte.is_BINARY_STRATEGY_5_Present());
        Assert.assertTrue(toroption.mte.is_BINARY_STRATEGY_6_Present());
        Assert.assertTrue(toroption.mte.is_BINARY_STRATEGY_7_Present());
        Assert.assertTrue(toroption.mte.is_BINARY_STRATEGY_8_Present());
        Assert.assertTrue(toroption.mte.is_BINARY_STRATEGY_9_Present());
        toroption.mte.clickBackBtn();
        Assert.assertTrue(toroption.mte.isMTEContentPresent());
    }
    @Test(priority = 16)
    public void ECONOMICS_USER_LOGGED_IN() {
        toroption.mte.click_ECONOMICS();
        Assert.assertTrue(toroption.mte.is_ECONOMICS_CONTENT_1_Present());
        Assert.assertTrue(toroption.mte.is_ECONOMICS_CONTENT_2_Present());
        Assert.assertTrue(toroption.mte.is_ECONOMICS_CONTENT_3_Present());
        Assert.assertTrue(toroption.mte.is_ECONOMICS_CONTENT_4_Present());
        Assert.assertTrue(toroption.mte.is_ECONOMICS_CONTENT_5_Present());
        Assert.assertTrue(toroption.mte.is_ECONOMICS_CONTENT_6_Present());
        toroption.mte.clickBackBtn();
        Assert.assertTrue(toroption.mte.isMTEContentPresent());
    }
    @Test(priority = 17)
    public void PLATFORM_TUTORIALS_USER_LOGGED_IN() {
        toroption.mte.click_PLATFORM_TUTORIALS();
        Assert.assertTrue(toroption.mte.is_PLATFORM_TUTORIALS_INTRODUCTION_1_Present());
        Assert.assertTrue(toroption.mte.is_PLATFORM_TUTORIALS_INTRODUCTION_2_Present());
        Assert.assertTrue(toroption.mte.is_PLATFORM_TUTORIALS_INTRODUCTION_3_Present());
        Assert.assertTrue(toroption.mte.is_PLATFORM_TUTORIALS_INTRODUCTION_4_Present());
        Assert.assertTrue(toroption.mte.is_PLATFORM_TUTORIALS_INTRODUCTION_5_Present());
        Assert.assertTrue(toroption.mte.is_PLATFORM_TUTORIALS_INTRODUCTION_6_Present());
        toroption.mte.clickPlatformTutorialsProductsBtn();
        Assert.assertTrue(toroption.mte.is_PLATFORM_TUTORIALS_PRODUCTS_1_Present());
        Assert.assertTrue(toroption.mte.is_PLATFORM_TUTORIALS_PRODUCTS_2_Present());
        Assert.assertTrue(toroption.mte.is_PLATFORM_TUTORIALS_PRODUCTS_3_Present());
        Assert.assertTrue(toroption.mte.is_PLATFORM_TUTORIALS_PRODUCTS_4_Present());
        Assert.assertTrue(toroption.mte.is_PLATFORM_TUTORIALS_PRODUCTS_5_Present());
        Assert.assertTrue(toroption.mte.is_PLATFORM_TUTORIALS_PRODUCTS_6_Present());
        Assert.assertTrue(toroption.mte.is_PLATFORM_TUTORIALS_PRODUCTS_7_Present());
        toroption.mte.clickPlatformTutorialsExecutingOrdersBtn();
        Assert.assertTrue(toroption.mte.is_PLATFORM_TUTORIALS_EXECUTING_ORDERS_1_Present());
        Assert.assertTrue(toroption.mte.is_PLATFORM_TUTORIALS_EXECUTING_ORDERS_2_Present());
        Assert.assertTrue(toroption.mte.is_PLATFORM_TUTORIALS_EXECUTING_ORDERS_3_Present());
        Assert.assertTrue(toroption.mte.is_PLATFORM_TUTORIALS_EXECUTING_ORDERS_4_Present());
        toroption.mte.clickBackBtn();
        Assert.assertTrue(toroption.mte.isMTEContentPresent());
    }
    @Test(priority = 18)
    public void BINARY_EBOOK_USER_LOGGED_IN() {
        toroption.mte.click_BINARY_EBOOK();
        /**
         * need methods for checking content
         * */
        toroption.mte.clickBackBtn();
    }
    @Test(priority = 19)
    public void ADVANCED_BINARY_EBOOK_USER_LOGGED_IN() {
        toroption.mte.click_ADVANCED_BINARY_EBOOK();
        /**
         * need methods for checking content
         * */
        toroption.mte.clickBackBtn();
    }
    @Test(priority = 20)
    public void PLATFORM_EBOOK_USER_LOGGED_IN() throws InterruptedException {
        toroption.mte.click_PLATFORM_EBOOK();
        /**
         * need methods for checking content
         * */
        toroption.mainPage.logout();
    }
}
