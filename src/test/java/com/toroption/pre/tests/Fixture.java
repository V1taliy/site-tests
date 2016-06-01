package com.toroption.pre.tests;

import org.apache.log4j.Logger;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import pages.Toroption;
import utils.PropertyLoader;
import utils.ScreensShotMaker;
import utils.WebDriverFactory;
import utils.WebDriverWrapper;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Fixture {

    public static final String impWait = PropertyLoader.loadProperty("wait.timeout");
    private static final Logger log = Logger.getLogger(Fixture.class);
    public static WebDriverWrapper driverWrapper;
    public static Toroption toroption;

    @BeforeSuite
    public void startBrowser() {
        driverWrapper = WebDriverFactory.initDriver();
        driverWrapper.manage().window().maximize();
        driverWrapper.manage().timeouts().implicitlyWait(Long.parseLong(impWait), TimeUnit.SECONDS);
        try {
            toroption = new Toroption(driverWrapper);
        } catch (Exception e) {
            e.printStackTrace();
        }
        log.info(String.format("start test suit execution"));
    }

    @AfterSuite
    public void quitBrowser() {
        if (driverWrapper != null) {
            driverWrapper.quit();
        }
        log.info(String.format("tests suite execution completed"));
    }

    @AfterMethod
    public void TearDown(ITestResult result) throws IOException {
        log.info(String.format("test status is < %s >", result.getStatus()));
        log.info(String.format("iresult status is < %s >", result.FAILURE));
        if (result.FAILURE == result.getStatus()) {
            ScreensShotMaker.takeScreenShot(driverWrapper, result.getName());
        }
    }


}
