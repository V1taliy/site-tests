package pages;

import utils.WebDriverWrapper;
import utils.WebElementsActions;

public class Toroption {

    public WebElementsActions web;
    public MainPage mainPage;
    public OpenAccount openAccount;



    public Toroption(WebDriverWrapper driverWrapper) {
        web = new WebElementsActions(driverWrapper);
        mainPage = new MainPage(driverWrapper);
        openAccount = new OpenAccount(driverWrapper);
    }

}
