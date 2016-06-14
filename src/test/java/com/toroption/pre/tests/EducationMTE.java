package com.toroption.pre.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class EducationMTE extends Fixture{

    @Test(priority = 1)
    public void mte() {
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
}
