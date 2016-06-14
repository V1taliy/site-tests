package pages;

import utils.WebDriverWrapper;


public class AccountTypes extends AbstractPage {
    public AccountTypes (WebDriverWrapper driverWrapper){
        super(driverWrapper);
    }
    public void clickAccountTypesMob() {
        web.moveToElementAndClick("navi", "navi");
        web.moveToElementAndClick("accountsMob", "accountsMob");
        web.moveToElementAndClick("accountTypesMob", "accountTypesMob");
    }
    public boolean isMiniAccContentPresent() {
        if (web.isElementPresent("miniAccContent")){
            return true;
        }else {
            return false;
        }
    }
    public void clickStandardAccount() {
        web.moveToElementAndClick("standardAccount", "standardAccount");
    }
    public boolean isStandardAccContentPresent() {
        if (web.isElementPresent("standardAccContent")) {
            return true;
        } else {
            return false;
        }
    }
    public void clickExecutiveAccount() {
        web.moveToElementAndClick("executiveAccount", "executiveAccount");
    }
    public boolean isExecutiveAccContentPresent() {
        if (web.isElementPresent("executiveAccContent")) {
            return true;
        } else {
            return false;
        }
    }
    public void clickVipAccount() {
        web.moveToElementAndClick("vipAccount", "vipAccount");
    }
    public boolean isVipAccContentPresent() {
        if (web.isElementPresent("vipAccContent")) {
            return true;
        } else {
            return false;
        }
    }

}
