package pages;

import utils.WebDriverWrapper;

public class EconomicCalendar extends AbstractPage {

    EconomicCalendar(WebDriverWrapper driverWrapper) {
        super(driverWrapper);
    }
    public void clickEconomicCalendar() {
        web.moveToElementAndClick("marketAnalysis", "economicCalendar");
    }
    public boolean isEconomicCalendarDisplayed() {
        return web.waitForElementPresent("economicCalendarPlatform");
    }
}
