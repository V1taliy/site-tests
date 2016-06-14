package pages;

import utils.WebDriverWrapper;
import utils.WebElementsActions;

public class Toroption {

    public WebElementsActions web;
    public MainPage mainPage;
    public OpenAccount openAccount;
    public EconomicCalendar economicCalendar;
    public AssetIndex assetIndex;
    public ContactUS contactUS;
    public AccountTypes accountTypes;



    public Toroption(WebDriverWrapper driverWrapper) {
        web = new WebElementsActions(driverWrapper);
        mainPage = new MainPage(driverWrapper);
        openAccount = new OpenAccount(driverWrapper);
        economicCalendar = new EconomicCalendar(driverWrapper);
        assetIndex = new AssetIndex(driverWrapper);
        contactUS = new ContactUS(driverWrapper);
        accountTypes = new AccountTypes(driverWrapper);
    }
}
