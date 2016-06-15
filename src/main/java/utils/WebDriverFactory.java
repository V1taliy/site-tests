package utils;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import java.util.HashMap;
import java.util.Map;

public class WebDriverFactory {

    public static WebDriverWrapper driverWrapper;
    private static final String browserName = PropertyLoader.loadProperty("browser.name");
    /*Browsers constants*/
    private static final String FIREFOX = "firefox";
    private static final String CHROME = "chrome";
    private static final String MOBILE_EMULATOR = "mobileEmulator";
    private static final String PHANTOMJS = "phantomjs";
    /*Proxy configuration*/
    private static final String  httpProxy = "217.106.65.253:3128";
    private static final String  sslProxy = "217.106.65.253:3128";
    private static final String  ftpProxy = "217.106.65.253:3128";
    /*Capabilities */
    private static DesiredCapabilities  capabilities = new DesiredCapabilities();
    private static String DeviceName = "Apple iPhone 5";


    public WebDriverFactory() {
    }

    public static WebDriverWrapper initDriver() {


//        addProxyCapabilities(capabilities, httpProxy, sslProxy, ftpProxy);

        if (FIREFOX.equals(browserName)) {
            driverWrapper = new WebDriverWrapper(new FirefoxDriver(WebDriverFactory.capabilities));
        } else if (CHROME.equals(browserName)) {

            System.setProperty("webdriver.chrome.driver",
                    "C:\\Users\\BorysN\\chromedriver.exe");

            WebDriverFactory.capabilities = DesiredCapabilities.chrome();
            ChromeOptions options = new ChromeOptions();
            driverWrapper = new WebDriverWrapper(new ChromeDriver(options));

        } else if (MOBILE_EMULATOR.equals(browserName)) {

            System.setProperty("webdriver.chrome.driver",
                    "C:\\Users\\BorysN\\chromedriver.exe");

            Map<String, String> mobileEmulation = new HashMap<String, String>();
            mobileEmulation.put("deviceName", DeviceName);

            Map<String, Object> chromeOptions = new HashMap<String, Object>();
            chromeOptions.put("mobileEmulation", mobileEmulation);

            WebDriverFactory.capabilities = DesiredCapabilities.chrome();
            WebDriverFactory.capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);

            driverWrapper = new WebDriverWrapper(new ChromeDriver(WebDriverFactory.capabilities));
        } else {
            Assert.fail("invalid driver name");
        }
        driverWrapper.manage().deleteAllCookies();
        driverWrapper.manage().window().maximize();
        return driverWrapper;
    }
    public static DesiredCapabilities addProxyCapabilities(DesiredCapabilities capability, String httpProxy, String sslProxy,
                                                           String ftpProxy) {
        Proxy proxy = new Proxy();
        proxy.setProxyType(Proxy.ProxyType.MANUAL);
        proxy.setHttpProxy(httpProxy);
        proxy.setSslProxy(sslProxy);
        proxy.setFtpProxy(ftpProxy);

        capability.setCapability(CapabilityType.PROXY, proxy);
        capability.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        return capability;
    }
}