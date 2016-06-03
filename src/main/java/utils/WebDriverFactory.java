package utils;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

public class WebDriverFactory {

    public static final String browserName = PropertyLoader.loadProperty("browser.name");
    public static final String browserVersion = PropertyLoader.loadProperty("browser.version");
    public static final String platform = PropertyLoader.loadProperty("browser.platform");
    public static final String grid = PropertyLoader.loadProperty("grid2.hub");
    /*Browsers constants*/
    private static final String FIREFOX = "firefox";
    private static final String CHROME = "chrome";
//    private static final String HTML_UNIT = "htmlunit";
//    private static final String PHANTOMJS = "phantomjs";

    public static WebDriverWrapper driverWrapper;

    public WebDriverFactory() {
    }

    public static WebDriverWrapper initDriver() {

        DesiredCapabilities capability = new DesiredCapabilities();
        if (FIREFOX.equals(browserName)) {
            driverWrapper = new WebDriverWrapper(new FirefoxDriver(capability));
        } else if (CHROME.equals(browserName)) {
            System.setProperty("webdriver.chrome.driver",
                    "C:\\Users\\BorysN\\chromedriver.exe");
            ChromeOptions options = new ChromeOptions();
            driverWrapper = new WebDriverWrapper(new ChromeDriver(options));
        } else {
            Assert.fail("invalid driver name");
        }
        driverWrapper.manage().deleteAllCookies();
        driverWrapper.manage().window().maximize();
        return driverWrapper;
    }

}
