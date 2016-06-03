package pages;

import utils.WebDriverWrapper;

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
