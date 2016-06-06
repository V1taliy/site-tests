package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import utils.WebDriverWrapper;

import static org.apache.commons.io.FileUtils.waitFor;

public class EconomicCalendar extends AbstractPage {

    public EconomicCalendar (WebDriverWrapper driverWrapper) {
        super(driverWrapper);
    }
    public void clickEconomicCalendar() {
        web.moveToElementAndClick("marketAnalysis", "economicCalendar");
    }
    public boolean isEconomicCalendarDisplayed() {

        if (web.waitForElementPresent("economicCalendarPlatform")) {
            return true;
        }else {
            return false;
        }
    }

}
