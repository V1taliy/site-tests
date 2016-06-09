package utils;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

import java.util.HashMap;
import java.util.Objects;

import static org.apache.http.client.methods.RequestBuilder.put;

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
        String httpProxy = "217.106.65.253:3128";
        String sslProxy = "217.106.65.253:3128";
        String ftpProxy = "217.106.65.253:3128";
        DesiredCapabilities capability = new DesiredCapabilities();
        addProxyCapabilities(capability, httpProxy, sslProxy, ftpProxy);

        if (FIREFOX.equals(browserName)) {
            driverWrapper = new WebDriverWrapper(new FirefoxDriver(capability));
        } else if (CHROME.equals(browserName)) {
            System.setProperty("webdriver.chrome.driver",
                    "C:\\Users\\BorysN\\chromedriver.exe");
            ChromeOptions options = new ChromeOptions();
            driverWrapper = new WebDriverWrapper(new ChromeDriver(capability));
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
        capability.setCapability(ChromeOptions.CAPABILITY, new ChromeOptions(){
            {
                setExperimentalOption("mobileEmulation", new HashMap<String, Object>() {
                    {
                        put("deviceName", "Google Nexus 5");
                    }
                });
            }
        });


        return capability;
    }
}
