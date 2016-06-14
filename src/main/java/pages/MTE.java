package pages;


import utils.WebDriverWrapper;

public class MTE extends AbstractPage{
    public MTE (WebDriverWrapper driverWrapper) {
        super(driverWrapper);
    }
    private static final String TRADING_GUIDE = "tradingGuide";
    private static final String MTE = "mte";
    private static final String MTE_CONTENT = "mteContent";
    private static final String INTRODUCTION_VIDEO = "introductionVideo";
    private static final String BACK = "backBtn";
    private static final String ADVANCED = "advancedBtn";
    private static final String PRODUCTS = "platformTutorialsProductsBtn";
    private static final String EXECUTING_ORDERS = "platformTutorialsExecutingOrdersBtn";
    private static final String INTRODUCTION_VIDEO_CONTENT = "introductionVideoContent";

    /**
     * MTE BUTTONS
     * */
    public void clickBackBtn() {
        web.moveToElementAndClick(BACK, BACK);
    }
    public void clickAdvancedBtn() {
        web.moveToElementAndClick(ADVANCED, ADVANCED);
    }
    public void clickPlatformTutorialsProductsBtn() {
        web.moveToElementAndClick(PRODUCTS, PRODUCTS);
    }
    public void clickPlatformTutorialsExecutingOrdersBtn() {
        web.moveToElementAndClick(EXECUTING_ORDERS, EXECUTING_ORDERS);
    }

    public void clickMTE() {
        web.moveToElementAndClick(TRADING_GUIDE, MTE);
    }
    public boolean isMTEContentPresent() {
        web.waitForElementPresent(MTE_CONTENT);
        return (web.isElementPresent(MTE_CONTENT));
    }
    public void click_INTRODUCTION_VIDEO() {
        web.moveToElementAndClick(INTRODUCTION_VIDEO, INTRODUCTION_VIDEO);
    }
    public boolean is_INTRODUCTION_VIDEO_Present() {
        web.waitForElementPresent(INTRODUCTION_VIDEO_CONTENT);
        return  (web.isElementPresent(INTRODUCTION_VIDEO_CONTENT));
    }
    public boolean is_INTRODUCTION_VIDEO_FOR_BEGGINERS_1_Present() {
        web.waitForElementPresent("beginnersContent_1");
        return web.isElementPresent("beginnersContent_1");
    }
    public boolean is_INTRODUCTION_VIDEO_FOR_BEGGINERS_2_LOCK() {
        web.waitForElementPresent("beginnersContent_2_LOCK");
        return web.isElementPresent("beginnersContent_2_LOCK");
    }
    public boolean is_INTRODUCTION_VIDEO_FOR_BEGGINERS_3_LOCK() {
        web.waitForElementPresent("beginnersContent_3_LOCK");
        return web.isElementPresent("beginnersContent_3_LOCK");
    }
    public boolean is_INTRODUCTION_VIDEO_FOR_BEGGINERS_4_LOCK() {
        web.waitForElementPresent("beginnersContent_4_LOCK");
        return web.isElementPresent("beginnersContent_4_LOCK");
    }
    public boolean is_INTRODUCTION_VIDEO_FOR_BEGGINERS_5_LOCK() {
        web.waitForElementPresent("beginnersContent_5_LOCK");
        return web.isElementPresent("beginnersContent_5_LOCK");
    }
    public boolean is_INTRODUCTION_VIDEO_FOR_BEGGINERS_6_LOCK() {
        web.waitForElementPresent("beginnersContent_6_LOCK");
        return web.isElementPresent("beginnersContent_6_LOCK");
    }
    public boolean is_INTRODUCTION_VIDEO_FOR_BEGGINERS_7_LOCK() {
        web.waitForElementPresent("beginnersContent_7_LOCK");
        return web.isElementPresent("beginnersContent_7_LOCK");
    }
    public boolean is_INTRODUCTION_VIDEO_FOR_ADVANCED_1_LOCK() {
        web.waitForElementPresent("advancedContent_1_LOCK");
        return web.isElementPresent("advancedContent_1_LOCK");
    }
    public boolean is_INTRODUCTION_VIDEO_FOR_ADVANCED_2_LOCK() {
        web.waitForElementPresent("advancedContent_2_LOCK");
        return web.isElementPresent("advancedContent_2_LOCK");
    }
    public boolean is_INTRODUCTION_VIDEO_FOR_ADVANCED_3_LOCK() {
        web.waitForElementPresent("advancedContent_3_LOCK");
        return web.isElementPresent("advancedContent_3_LOCK");
    }
    public boolean is_INTRODUCTION_VIDEO_FOR_ADVANCED_4_LOCK() {
        web.waitForElementPresent("advancedContent_4_LOCK");
        return web.isElementPresent("advancedContent_4_LOCK");
    }
    public boolean is_INTRODUCTION_VIDEO_FOR_ADVANCED_5_LOCK() {
        web.waitForElementPresent("advancedContent_5_LOCK");
        return web.isElementPresent("advancedContent_5_LOCK");
    }
    public boolean is_INTRODUCTION_VIDEO_FOR_ADVANCED_6_LOCK() {
        web.waitForElementPresent("advancedContent_6_LOCK");
        return web.isElementPresent("advancedContent_6_LOCK");
    }
    public boolean is_INTRODUCTION_VIDEO_FOR_ADVANCED_7_LOCK() {
        web.waitForElementPresent("advancedContent_7_LOCK");
        return web.isElementPresent("advancedContent_7_LOCK");
    }
    public boolean is_INTRODUCTION_VIDEO_FOR_ADVANCED_8_LOCK() {
        web.waitForElementPresent("advancedContent_8_LOCK");
        return web.isElementPresent("advancedContent_8_LOCK");
    }
    public void click_IN_DEPTH_COURSE() {
        web.moveToElementAndClick("inDepthCourse", "inDepthCourse");
    }
    public boolean is_IN_DEPTH_COURSE_1_Present() {
        web.waitForElementPresent("inDepthCourseContent_1");
        return web.isElementPresent("inDepthCourseContent_1");
    }
    public boolean is_IN_DEPTH_COURSE_2_LOCK() {
        web.waitForElementPresent("inDepthCourseContent_2_LOCK");
        return web.isElementPresent("inDepthCourseContent_2_LOCK");
    }
    public boolean is_IN_DEPTH_COURSE_3_LOCK() {
        web.waitForElementPresent("inDepthCourseContent_3_LOCK");
        return web.isElementPresent("inDepthCourseContent_3_LOCK");
    }
    public boolean is_IN_DEPTH_COURSE_4_LOCK() {
        web.waitForElementPresent("inDepthCourseContent_4_LOCK");
        return web.isElementPresent("inDepthCourseContent_4_LOCK");
    }
    public void click_ADVANCED_IN_DEPTH_COURSE() {
        web.moveToElementAndClick("advancedInDepthCourse", "advancedInDepthCourse");
    }
    public boolean is_ADVANCED_IN_DEPTH_COURSE_1_Present() {
        web.waitForElementPresent("advancedInDepthCourseContent_1");
        return web.isElementPresent("advancedInDepthCourseContent_1");
    }
    public boolean is_ADVANCED_IN_DEPTH_COURSE_2_LOCK() {
        web.waitForElementPresent("advancedInDepthCourseContent_2_LOCK");
        return web.isElementPresent("advancedInDepthCourseContent_2_LOCK");
    }
    public boolean is_ADVANCED_IN_DEPTH_COURSE_3_LOCK() {
        web.waitForElementPresent("advancedInDepthCourseContent_3_LOCK");
        return web.isElementPresent("advancedInDepthCourseContent_3_LOCK");
    }
    public void click_BINARY_STRATEGIES() {
        web.moveToElementAndClick("binaryStrategies", "binaryStrategies");
    }
    public boolean is_BINARY_STRATEGY_1_Present() {
        web.waitForElementPresent("binaryStrategiesContent_1");
        return web.isElementPresent("binaryStrategiesContent_1");
    }
    public boolean is_BINARY_STRATEGY_2_LOCK() {
        web.waitForElementPresent("binaryStrategiesContent_2_LOCK");
        return web.isElementPresent("binaryStrategiesContent_2_LOCK");
    }
    public boolean is_BINARY_STRATEGY_3_LOCK() {
        web.waitForElementPresent("binaryStrategiesContent_3_LOCK");
        return web.isElementPresent("binaryStrategiesContent_3_LOCK");
    }
    public boolean is_BINARY_STRATEGY_4_LOCK() {
        web.waitForElementPresent("binaryStrategiesContent_4_LOCK");
        return web.isElementPresent("binaryStrategiesContent_4_LOCK");
    }
    public boolean is_BINARY_STRATEGY_5_LOCK() {
        web.waitForElementPresent("binaryStrategiesContent_5_LOCK");
        return web.isElementPresent("binaryStrategiesContent_5_LOCK");
    }
    public boolean is_BINARY_STRATEGY_6_LOCK() {
        web.waitForElementPresent("binaryStrategiesContent_6_LOCK");
        return web.isElementPresent("binaryStrategiesContent_6_LOCK");
    }
    public boolean is_BINARY_STRATEGY_7_LOCK() {
        web.waitForElementPresent("binaryStrategiesContent_7_LOCK");
        return web.isElementPresent("binaryStrategiesContent_7_LOCK");
    }
    public boolean is_BINARY_STRATEGY_8_LOCK() {
        web.waitForElementPresent("binaryStrategiesContent_8_LOCK");
        return web.isElementPresent("binaryStrategiesContent_8_LOCK");
    }
    public boolean is_BINARY_STRATEGY_9_LOCK() {
        web.waitForElementPresent("binaryStrategiesContent_9_LOCK");
        return web.isElementPresent("binaryStrategiesContent_9_LOCK");
    }
    public void click_ECONOMICS() {
        web.moveToElementAndClick("economics", "economics");
    }
    public boolean is_ECONOMICS_CONTENT_1_Present() {
        web.waitForElementPresent("economicsContent_1");
        return web.isElementPresent("economicsContent_1");
    }
    public boolean is_ECONOMICS_CONTENT_2_LOCK() {
        web.waitForElementPresent("economicsContent_2_LOCK");
        return web.isElementPresent("economicsContent_2_LOCK");
    }
    public boolean is_ECONOMICS_CONTENT_3_LOCK() {
        web.waitForElementPresent("economicsContent_3_LOCK");
        return web.isElementPresent("economicsContent_3_LOCK");
    }
    public boolean is_ECONOMICS_CONTENT_4_LOCK() {
        web.waitForElementPresent("economicsContent_4_LOCK");
        return web.isElementPresent("economicsContent_4_LOCK");
    }
    public boolean is_ECONOMICS_CONTENT_5_LOCK() {
        web.waitForElementPresent("economicsContent_5_LOCK");
        return web.isElementPresent("economicsContent_5_LOCK");
    }
    public boolean is_ECONOMICS_CONTENT_6_LOCK() {
        web.waitForElementPresent("economicsContent_6_LOCK");
        return web.isElementPresent("economicsContent_6_LOCK");
    }
    public void click_PLATFORM_TUTORIALS() {
        web.moveToElementAndClick("platformTutorials", "platformTutorials");
    }
    public boolean is_PLATFORM_TUTORIALS_INTRODUCTION_1_Present() {
        web.waitForElementPresent("platformTutorialsContent_1");
        return web.isElementPresent("platformTutorialsContent_1");
    }
    public boolean is_PLATFORM_TUTORIALS_INTRODUCTION_2_LOCK() {
        web.waitForElementPresent("platformTutorialsContent_2_LOCK");
        return web.isElementPresent("platformTutorialsContent_2_LOCK");
    }
    public boolean is_PLATFORM_TUTORIALS_INTRODUCTION_3_LOCK() {
        web.waitForElementPresent("platformTutorialsContent_3_LOCK");
        return web.isElementPresent("platformTutorialsContent_3_LOCK");
    }
    public boolean is_PLATFORM_TUTORIALS_INTRODUCTION_4_LOCK() {
        web.waitForElementPresent("platformTutorialsContent_4_LOCK");
        return web.isElementPresent("platformTutorialsContent_4_LOCK");
    }
    public boolean is_PLATFORM_TUTORIALS_INTRODUCTION_5_LOCK() {
        web.waitForElementPresent("platformTutorialsContent_5_LOCK");
        return web.isElementPresent("platformTutorialsContent_5_LOCK");
    }
    public boolean is_PLATFORM_TUTORIALS_INTRODUCTION_6_LOCK() {
        web.waitForElementPresent("platformTutorialsContent_6_LOCK");
        return web.isElementPresent("platformTutorialsContent_6_LOCK");
    }
    public boolean is_PLATFORM_TUTORIALS_PRODUCTS_1_LOCK() {
        web.waitForElementPresent("platformTutorialsProductsContent_1_LOCK");
        return web.isElementPresent("platformTutorialsProductsContent_1_LOCK");
    }
    public boolean is_PLATFORM_TUTORIALS_PRODUCTS_2_LOCK() {
        web.waitForElementPresent("platformTutorialsProductsContent_2_LOCK");
        return web.isElementPresent("platformTutorialsProductsContent_2_LOCK");
    }
    public boolean is_PLATFORM_TUTORIALS_PRODUCTS_3_LOCK() {
        web.waitForElementPresent("platformTutorialsProductsContent_3_LOCK");
        return web.isElementPresent("platformTutorialsProductsContent_3_LOCK");
    }
    public boolean is_PLATFORM_TUTORIALS_PRODUCTS_4_LOCK() {
        web.waitForElementPresent("platformTutorialsProductsContent_4_LOCK");
        return web.isElementPresent("platformTutorialsProductsContent_4_LOCK");
    }
    public boolean is_PLATFORM_TUTORIALS_PRODUCTS_5_LOCK() {
        web.waitForElementPresent("platformTutorialsProductsContent_5_LOCK");
        return web.isElementPresent("platformTutorialsProductsContent_5_LOCK");
    }
    public boolean is_PLATFORM_TUTORIALS_PRODUCTS_6_LOCK() {
        web.waitForElementPresent("platformTutorialsProductsContent_6_LOCK");
        return web.isElementPresent("platformTutorialsProductsContent_6_LOCK");
    }
    public boolean is_PLATFORM_TUTORIALS_PRODUCTS_7_LOCK() {
        web.waitForElementPresent("platformTutorialsProductsContent_7_LOCK");
        return web.isElementPresent("platformTutorialsProductsContent_7_LOCK");
    }
    public boolean is_PLATFORM_TUTORIALS_EXECUTING_ORDERS_1_LOCK() {
        web.waitForElementPresent("platformTutorialsExecutingOrdersContent_1_LOCK");
        return web.isElementPresent("platformTutorialsExecutingOrdersContent_1_LOCK");
    }
    public boolean is_PLATFORM_TUTORIALS_EXECUTING_ORDERS_2_LOCK() {
        web.waitForElementPresent("platformTutorialsExecutingOrdersContent_2_LOCK");
        return web.isElementPresent("platformTutorialsExecutingOrdersContent_2_LOCK");
    }
    public boolean is_PLATFORM_TUTORIALS_EXECUTING_ORDERS_3_LOCK() {
        web.waitForElementPresent("platformTutorialsExecutingOrdersContent_3_LOCK");
        return web.isElementPresent("platformTutorialsExecutingOrdersContent_3_LOCK");
    }
    public boolean is_PLATFORM_TUTORIALS_EXECUTING_ORDERS_4_LOCK() {
        web.waitForElementPresent("platformTutorialsExecutingOrdersContent_4_LOCK");
        return web.isElementPresent("platformTutorialsExecutingOrdersContent_4_LOCK");
    }

}
